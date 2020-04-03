package br.mack.ps2;
import java.sql.*;
public class App {

    public static void main(String[] args) {
        Connection conm = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            String db = "controle_freq_cacique";
            String url = "jdbc:mysql://localhost:3306/controle_freq_cacique?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String user = "root";
            String psw = "";

            conm = DriverManager.getConnection(url, user, psw);
            String sql = "SELECT * FROM frequencia";
            PreparedStatement pstm = conm.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                String nome = rs.getString("nome");
                int id = rs.getInt("id");
                String tia = rs.getString("tia");
                Time horaEntrada = rs.getTime("horaEntrada");
                Time horaSaida = rs.getTime("horaSaida");
                System.out.println("id # "+ id +" nome: "+nome+" tia: "+tia+" hora de entrada: "+horaEntrada+" hora de saída: "+horaSaida);
            }
            rs.close();
            conm.close();


        }
        catch(InstantiationException e){
            e.printStackTrace();

        }
        catch(ClassNotFoundException e){
            e.printStackTrace();

        }
        catch(SQLException e){
            e.printStackTrace();

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

