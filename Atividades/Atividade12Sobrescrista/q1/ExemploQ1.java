package q1;

public class ExemploQ1 {
    public static void main(String[] args) {
        Lampada l1 = new Lampada();
        LampadaQueimada l2 = new LampadaQueimada();

        l1.acender();
        l1.getEstado();
        l1.apagar();
        l1.getEstado();
        System.out.println("---------LampQueimada");
        l2.acender();
    }
}
