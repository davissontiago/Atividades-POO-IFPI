package q2;

public class Exemplo {
    public static void main(String[] args) {
        Lampada l1 = new Lampada();
        System.err.println("--------------- LampadaComum ---------------");
        System.out.println(l1.getEstado());
        System.out.println(l1.acender());
        System.out.println(l1.getEstado());
        System.out.println(l1.apagar());
        System.out.println(l1.getEstado());

        LampadaPisca l2 = new LampadaPisca();
        System.err.println("--------------- LampadaPisca ---------------");
        System.out.println(l2.getEstado());
        System.out.println(l2.acender());
        System.out.println(l2.getEstado());
        System.out.println(l2.apagar());
        System.out.println(l2.getEstado());
        System.out.println(l2.piscar());
        System.out.println(l2.acender());
        System.out.println(l2.piscar());
        System.out.println(l2.getEstado());

    }
}
