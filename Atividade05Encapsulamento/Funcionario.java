package Atividade05Encapsulamento;

public class Funcionario {
    // Atributos
    private double salario;
    private String nome;

    // Métodos
    public double calcIR(){
        return this.salario*0.15;
    }

    public double calcINSS(){
        return this.salario*0.10;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
