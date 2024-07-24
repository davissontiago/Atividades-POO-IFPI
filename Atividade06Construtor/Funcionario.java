package Atividade06Construtor;

public class Funcionario {
    // Atributos
    private double salario;

    // Construtor
    public Funcionario(double salario){
        this.salario = salario;
    }
    
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

}
