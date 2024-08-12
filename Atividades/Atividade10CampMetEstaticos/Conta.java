package Atividade10CampMetEstaticos;

public class Conta{
    // Atributos
    private double saldo;
    private static double imposto = 0.01;
    private int numero;
    private static int ultimoNumero = 1000;


    // Construtor
    public Conta(){
        this.saldo = 0;
        Conta.ultimoNumero +=1;
        this.numero = Conta.ultimoNumero;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        this.saldo -= valor + (valor * Conta.imposto);
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}