package br.mack.ps2.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection {
    String url = "jdbc:mysql://localhost:3306/controle_freq_cacique?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    String user = "root";
    String psw = "";

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, psw);
        } catch (final Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
