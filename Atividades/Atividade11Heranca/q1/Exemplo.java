package q1;

public class Exemplo {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        
        a1.nome = "Lucas";
        a1.cpf = "36485483489";
        a1.matricula = "alun001";
        a1.nivel = 1;

        Professor p1 = new Professor();

        p1.nome = "João";
        p1.cpf = "532567483497";
        p1.matricula = "prof005";
        p1.saldo = 20;

        Tecnico t1 = new Tecnico();

        t1.nome = "Julio";
        t1.cpf = "985485385387";
        t1.matricula = "tecn002";
        t1.saldo = 25;

        Usuario u1 = new Usuario();

        u1.nome = "Maria";
        u1.cpf = "263876957463";
        u1.matricula = "usu000";

    }
}
