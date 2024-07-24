package Atividade06Construtor;

public class Executar {
    public static void main(String[] args) {
        // Conta
        Conta c1 = new Conta();

        System.out.println(c1.getSaldo());
        c1.sacar(25);
        System.out.println(c1.getSaldo());
        c1.depositar(100);
        System.out.println(c1.getSaldo());
        c1.sacar(50);
        System.out.println(c1.getSaldo());

        // Lampada
        Lampada l1 = new Lampada(false);

        System.out.println(l1.getEstado());
        l1.acender();
        System.out.println(l1.getEstado());
        l1.apagar();
        System.out.println(l1.getEstado());
        l1.setEstado(true);
        System.out.println(l1.getEstado());

         // Funcionario
         Funcionario f1 = new Funcionario(2000);

         System.out.println(f1.calcIR());
         System.out.println(f1.calcINSS());

         // Retangulo
        Retangulo r1 = new Retangulo(4,6);

        System.out.println(r1.calcArea());

        // Aluno
        Aluno a1 = new Aluno();

        a1.acionarFaltas(10);
        a1.setMedia(7f);
        System.out.println(a1.getMedia()+a1.getQualitativo());
        System.out.println(a1.calcSituacao());
    }
}
