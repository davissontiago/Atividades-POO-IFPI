package q1;

public class LampadaQueimada extends Lampada {
    // Métodos
    @Override
    public void acender(){
        super.acender();
        super.apagar();
        super.acender();
        super.apagar();
        super.acender();
        super.apagar();
    }
}
