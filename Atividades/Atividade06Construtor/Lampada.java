package Atividade06Construtor;

public class Lampada {
    // Atributos
    private boolean estado;
    
    // Construtor
    public Lampada(boolean estado){
        this.estado = estado;
    }
    // Métodos
    public void acender(){
        estado = true;
    }

    public void apagar(){
        estado = false;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
