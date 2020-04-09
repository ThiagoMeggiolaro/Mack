package br.mack.ps2;

import br.mack.ps2.persistencia.FrequenciaDAOMySQL;

public class App {
    public static void main(final String[] args) {
        FrequenciaDAOMySQL mysqlDAO = new FrequenciaDAOMySQL();
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario(mysqlDAO);
        interfaceUsuario.iniciar();
    }
}