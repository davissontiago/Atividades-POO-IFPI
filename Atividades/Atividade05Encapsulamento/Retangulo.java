package Atividade05Encapsulamento;

public class Retangulo {
    // Atributos
    private double base;
    private double altura;

    // Métodos
    public double calcArea(){
        return base * altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
