package Trabalho01POO;

public class LampadaTresEstados{
    // Atributos
    private String estado;

    // Construtor
    public LampadaTresEstados(){
        this.estado = "apagada";
    }
    // Métodos
    public void apagar(){
        this.estado = "apagada";
    }

    public void acender(){
        this.estado = "acesa";
    }

    public void meiaLuz(){
        this.estado = "meia luz";
    }

    public String getEstado() {
        return estado;
    }

}