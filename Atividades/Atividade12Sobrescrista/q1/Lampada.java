package q1;

public class Lampada {
    // Atributos
    private boolean estado;
    
    // Métodos
    public void acender(){
        this.estado = true;
    }

    public void apagar(){
        this.estado = false;
    }

    public boolean getEstado(){
        if (estado == true) {
            System.out.println("Acesa");
            return estado;
        } else {
            System.out.println("Apagada");
            return estado;
        }
    }
}
