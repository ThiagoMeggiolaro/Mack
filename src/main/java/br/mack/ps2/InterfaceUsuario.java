package br.mack.ps2;

import br.mack.ps2.entidades.Frequencia;
import br.mack.ps2.persistencia.FrequenciaDAO;

import java.util.List;
import java.util.Scanner;

public class InterfaceUsuario {
    FrequenciaDAO dao;
    Scanner in;

    public InterfaceUsuario(FrequenciaDAO dao) {
        this.dao = dao;
        this.in = new Scanner(System.in);
    }

    public void iniciar() {
        imprimirMenu();
    }

    private void imprimirMenu() {
        int opc = 0;
        do {
            System.out.println("\n==============");
            System.out.println("==== Menu ====");
            System.out.println("==============");
            System.out.println("\t1. Create");
            System.out.println("\t2. Read");
            System.out.println("\t3. sair");
            System.out.print("Escolha uma opção: ");
            opc = in.nextInt();

            //necessário para ler a quebra de linha (enter)
            in.nextLine();

            switch (opc) {
                case 1:
                    this.create();
                    break;
                case 2:
                    this.read();
                    break;
                case 3:
                    System.out.println("tchau :)");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }

        }while (opc != 3);
    }

    private void create() {
        Frequencia frequencia = new Frequencia();

        System.out.println("\n******************");
        System.out.println("*** Novo aluno ***");
        System.out.println("******************");
        System.out.println("informe o TIA do aluno: ");
        frequencia.setTia(in.nextLong());
        //necessário para ler o \n da entrada (enter)
        in.nextLine();

        System.out.print("Informe o NOME do aluno: ");
        frequencia.setNome(in.nextLine());

        System.out.print("Informe a hora de entrada do aluno: ");
        frequencia.setHoraEntrada(in.nextLine());

        System.out.println("Informe o horario de saida: ");
        frequencia.setHoraSaida(in.nextLine());

        if (dao.create(frequencia)) {
            System.out.println("Aluno adicionado ao banco de Dados");
        } else {
            System.out.println("Ops: problema ao adicionar o aluno");
        }
    }

    private void read() {
        List<Frequencia> frequencias = dao.read();

        System.out.println("\n***********************************");
        System.out.println("*** Lista de Alunos Cadastrados ***");
        System.out.println("***********************************");
        for(Frequencia frequencia : frequencias) {
            System.out.println(frequencia);
        }
    }
}
