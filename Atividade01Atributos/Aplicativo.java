public class Aplicativo {
    public static void main(String[] args) {
        // Pessoa
        Pessoa p1 = new Pessoa();

        p1.nome = "Tiago";
        p1.idade = 20;

        System.out.println(p1.nome);
        System.out.println(p1.idade);

        // Lampada
        Lampada l1 = new Lampada();

        l1.estado = true;
        System.out.println(l1.estado);

        // Aluno
        Aluno a1 = new Aluno();

        a1.nome = "Tiago";
        a1.nota1 = 7;
        a1.nota2 = 9;
        a1.nota3 = 5;

        System.out.println(a1.nome);
        System.out.println(a1.nota1);
        System.out.println(a1.nota2);
        System.out.println(a1.nota3);

        // Cliente
        Cliente c1 = new Cliente();

        c1.nome = "Tiago";
        c1.cpf = 1234567891;
        c1.codigo = 54321;

        System.out.println(c1.nome);
        System.out.println(c1.cpf);
        System.out.println(c1.codigo);

        // Funcionario
        Funcionario f1 = new Funcionario();

        f1.nome = "Tiago";
        f1.matricula = 52573;
        f1.salario = 1412.6;

        System.out.println(f1.nome);
        System.out.println(f1.matricula);
        System.out.println(f1.salario);

    }
}
