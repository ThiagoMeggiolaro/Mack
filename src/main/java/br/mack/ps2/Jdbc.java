
package br.mack.ps2;
import java.sql.*;
public class Jdbc {

    public static void main(String[] args) {
        Connection conm = null;
        try{
           Class.forName("com.mysql.jdbc.Driver").newInstance(); 
           String bc = "controle_freq_cacique";
           String url = "jdbc:mysql://Localhost:55927/"+bc;
           String user = "root";
           String psw = "1910THIAGO";
           
           conm = DriverManager.getConnection(url, user, psw);
           String sql = "SELECT * FROM frequencia";
           PreparedStatement pstm= conm.prepareStatement(sql);
           ResultSet rs = pstm.executeQuery();
           
           while(rs.next()){
               String nome = rs.getString("nome");
               int id = rs.getInt("id");
               String tia = rs.getString("tia");
               Time horaEntrada = rs.getTime("horaEntrada");
               Time horaSaida = rs.getTime("horaSaida");
           }
           
        }
        catch(IllegalAcessException e){
            e.printStackTrace();
            
        }
        catch(InstantiationException e){
            e.printStackTrace();
            
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
            
        }
        catch(SQLException e){
            e.printStackTrace();
            
        } 
    }
}

