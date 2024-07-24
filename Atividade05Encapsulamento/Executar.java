package Atividade05Encapsulamento;

public class Executar {
    public static void main(String[] args) {
        // Aluno
        Aluno a1 = new Aluno();

        a1.setNome("Tiago");
        a1.setMedia(7);
        System.out.println(a1.calcSituacao());
        a1.setMedia(9);
        System.out.println(a1.calcSituacao());
        a1.setMedia(6);
        System.out.println(a1.calcSituacao());

        // Lampada
        Lampada l1 = new Lampada();

        System.out.println(l1.getEstado());
        l1.acender();
        System.out.println(l1.getEstado());
        l1.apagar();
        System.out.println(l1.getEstado());
        l1.setEstado(true);
        System.out.println(l1.getEstado());

        // Retangulo
        Retangulo r1 = new Retangulo();

        r1.setBase(4);
        r1.setAltura(2);
        System.out.println(r1.calcArea());

        // Funcionario
        Funcionario f1 = new Funcionario();

        f1.setNome("Davisson Tiago");
        f1.setSalario(1500);
        System.out.println(f1.calcIR());
        System.out.println(f1.calcINSS());
    }
}
