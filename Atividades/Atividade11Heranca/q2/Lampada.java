package q2;

public class Lampada {
    // Atributos
    protected boolean estado = false;

    // Métodos
    public String acender(){
        this.estado = true;
        return "Lâmpada foi Acesa";
    }

    public String apagar(){
        this.estado = false;
        return "Lâmpada foi Apagada";
    }

    public String getEstado() {
        if (estado == true) {
            return "Lâmpada está Acesa";
        } else {
            return "Lâmpada está Apagada";
        }
    }
    
}
