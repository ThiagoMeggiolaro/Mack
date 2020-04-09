package br.mack.ps2.persistencia;

import br.mack.ps2.entidades.Frequencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FrequenciaDAOMySQL implements FrequenciaDAO {
    private String createSQL = "INSERT INTO frequencia VALUES (?, ?, ?, ?)";
    private String readSQL = "SELECT * FROM frequencia";

    private final MySQLConnection mysql = new MySQLConnection();

    @Override
    public boolean create(Frequencia frequencia) {
        Connection conexao = mysql.getConnection();
        try {
            PreparedStatement stm = conexao.prepareStatement(createSQL);

            //Inicializando os valores
            stm.setString(1, frequencia.getNome());
            stm.setLong(2, frequencia.getTia());
            stm.setString(3, frequencia.getHoraEntrada());
            stm.setString(4, frequencia.getHoraSaida());

            int registros = stm.executeUpdate();

            // Se a quantidade de registros modificados
            // forem maiores que 1, significa que os dados
            // foram inserido corretamente
            return  registros > 0 ? true : false;

        } catch (final SQLException ex) {
            System.out.println("Falha de conexão com a base de dados!");
            ex.printStackTrace();
        } catch (final Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                conexao.close();
            } catch (final Exception ex) {
                ex.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public List<Frequencia> read() {
        Connection conexao = mysql.getConnection();
        List<Frequencia> frequencias = new ArrayList();

        try {
            PreparedStatement stm = conexao.prepareStatement(readSQL);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                Frequencia frequencia = new Frequencia();
                frequencia.setTia(rs.getLong("tia"));
                frequencia.setNome(rs.getString("nome"));
                frequencia.setHoraEntrada(rs.getString("horaEntrada"));
                frequencia.setHoraSaida(rs.getString("horaSaida"));
                frequencias.add(frequencia);
            }

            return frequencias;

        } catch (final SQLException ex) {
            System.out.println("Falha de conexão com a base de dados!");
            ex.printStackTrace();
        } catch (final Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                conexao.close();
            } catch (final Exception ex) {
                ex.printStackTrace();
            }
        }
        return frequencias;
    }
}
