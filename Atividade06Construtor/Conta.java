package Atividade06Construtor;

public class Conta {
    // Atributos
    private double saldo;

    // Contrutor
    public Conta(){
        this.saldo = 50;
    }

    // Métodos
    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        this.saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
    
}
