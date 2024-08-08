package Atividade08Revisao;

public class Executar {
    public static void main(String[] args) {
        // Pessoa
        Pessoa p[] = new Pessoa[3];

        p[0] = new Pessoa();
        p[1] = new Pessoa("João");
        p[2] = new Pessoa("Maria",19);

        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].exibir());
        }
    }
}
