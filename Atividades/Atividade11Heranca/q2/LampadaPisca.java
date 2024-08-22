package q2;

public class LampadaPisca extends Lampada{
    // Métodos
    public String piscar(){
        if (estado == true) {
            this.estado = false;
            return "Lâmpada Piscou 1x e apagou";
        } else {
            return "Lâmpada está Apagada";
        }
    }
}
