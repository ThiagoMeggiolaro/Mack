package br.mack.ps2.entidades;

public class Frequencia {
    private long tia;
    private String nome;
    private String horaEntrada;
    private String horaSaida;

    public Frequencia() {}

    public Frequencia(long tia, String nome, String horaEntrada ,String horaSaida) {
        this.setTia(tia);
        this.setNome(nome);
        this.setHoraEntrada(horaEntrada);
        this.setHoraSaida(horaSaida);
    }

    public long getTia() {
        return tia;
    }

    public void setTia(long tia) {
        this.tia = tia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }
    @Override
    public String toString() {
        return getNome() + "[ Nome: "+ getNome()+
                ", Tia:" + getTia() +
                ", Horario de entrada: " + getHoraEntrada() + "]" +
                ", Horario de saída: " + getHoraSaida() + "]";
    }
}
