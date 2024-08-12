package Atividade10CampMetEstaticos;

public class Executar {
    public static void main(String[] args) {
        // Conta Q-1 e Q-2
        Conta cA = new Conta();
        Conta cB = new Conta();
        System.out.println(cA.getNumero()); 
        System.out.println(cB.getNumero());
        System.out.println(cA.getSaldo());
        System.out.println(cB.getSaldo());

        cA.depositar(1000);
        cB.depositar(100);
        System.out.println(cA.getSaldo());
        System.out.println(cB.getSaldo());
        cA.sacar(100);
        cB.sacar(20);
        System.out.println(cA.getSaldo());
        System.out.println(cB.getSaldo());

        // Aluno Q-3
        Aluno a1 = new Aluno(6.0, "José");
        Aluno a2 = new Aluno(7.0, "Pedro");
        Aluno a3 = new Aluno(8.0, "Maria");
        System.out.println("Nome: "+ a1.getNome());
        System.out.println("Media: "+ a1.getMedia());
        System.out.println("Media Final: "+ a1.calcularMediaFinal());
        System.out.println("Nome: "+ a2.getNome());
        System.out.println("Media: "+ a2.getMedia());
        System.out.println("Media Final: "+ a2.calcularMediaFinal());
        System.out.println("Nome: "+ a3.getNome());
        System.out.println("Media: "+ a3.getMedia());
        System.out.println("Media Final: "+ a3.calcularMediaFinal());
    }
}
