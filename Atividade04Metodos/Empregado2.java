package Atividade04Metodos;

public class Empregado2 {
    // Atributos
    public int hrsTrabalhadas;
    public double valorHr = 70.5;

    // Métodos
    public void adicionarHrs(int quant){
        hrsTrabalhadas += quant;
    }

    public double calcSalario(){
        return hrsTrabalhadas * valorHr;
    }
}
