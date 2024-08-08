package Trabalho01POO;

public class Execucao {
    public static void main(String[] args) {
        // LampadaTresEstados
        LampadaTresEstados l1 = new LampadaTresEstados();

        System.out.println(l1.getEstado());
        l1.acender();
        System.out.println(l1.getEstado());
        l1.meiaLuz();
        System.out.println(l1.getEstado());
        l1.apagar();
        System.out.println(l1.getEstado());

        // Lampada Dimerizada
        LampadaDimerizada l2 = new LampadaDimerizada();

        System.out.println(l2.getLuminosidade());
        l2.acender();
        System.out.println(l2.getLuminosidade());
        l2.aumentarLuminosidade();
        System.out.println(l2.getLuminosidade());
        l2.diminuirLuminosidade();
        System.out.println(l2.getLuminosidade());
        l2.aumentarLuminosidade();
        System.out.println(l2.getLuminosidade());
        l2.apagar();
        System.out.println(l2.getLuminosidade());
        l2.diminuirLuminosidade();
        System.out.println(l2.getLuminosidade());
        l2.aumentarLuminosidade();
        System.out.println(l2.getLuminosidade());
        l2.diminuirLuminosidade();
        System.out.println(l2.getLuminosidade());

        // Empregado
        Empregado e1 = new Empregado("EMP0017", 50);

        System.out.println(e1.getTotalHorasMes());
        e1.registrarPonto(7, 16);
        System.out.println(e1.getTotalHorasMes());
        e1.registrarPonto(7, 18);
        System.out.println(e1.getTotalHorasMes());
        System.out.println(e1.calcularSalario());
        System.out.println(e1.getTotalHorasMes());
        System.out.println(e1.calcularSalario());
        System.out.println(e1.getTotalHorasMes());














    }
}
