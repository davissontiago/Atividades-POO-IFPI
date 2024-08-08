package Trabalho01POO;

public class LampadaDimerizada {
    // Atributos
    private int luminosidade;

    // Construtor
    public LampadaDimerizada(){
        this.luminosidade = 0;
    }
    
    // Métodos
    public void apagar(){
        this.luminosidade = 0;
    }

    public void acender(){
        this.luminosidade = 100;
    }

    public void aumentarLuminosidade(){
        if (luminosidade <= 90) {
            this.luminosidade += 10;
        } else {
            System.out.println("Luminosidade no máximo");
        }
    }

    public void diminuirLuminosidade(){
        if (luminosidade >=10) {
            this.luminosidade -= 10;
        } else {
            System.out.println("Luminosidade no mínimo");
        }
    }

    public int getLuminosidade() {
        return luminosidade;
    }
}
