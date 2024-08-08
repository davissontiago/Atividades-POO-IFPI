package Trabalho01POO;

public class Empregado {
    // Atributos
    private String matricula;
    private double valorHoraTrabalho;
    private int totalHorasMes;

    // Construtor
    public Empregado(String matricula, double valorHoraTrabalho){
        this.matricula = matricula;
        this.valorHoraTrabalho = valorHoraTrabalho;
        this.totalHorasMes = 0;
    }

    // Métodos
    public void registrarPonto(int horaChegada, int horaSaida){
        int horasTrabalhadasDia = horaSaida - horaChegada;
        this.totalHorasMes += horasTrabalhadasDia;
    }

    public double calcularSalario(){
        double salario = this.totalHorasMes * this.valorHoraTrabalho;
        this.totalHorasMes = 0;
        return salario;
    }

    public int getTotalHorasMes() {
        return totalHorasMes;
    }

}
