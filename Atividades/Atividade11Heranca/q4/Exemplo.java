package q4;

public class Exemplo {
    public static void main(String[] args) {
        Herdeiros h1 = new Herdeiros("Herdeiro");
        Trabalhadores t1 = new Trabalhadores("Trabalhador");
        Vulneraveis v1 = new Vulneraveis("Vulnerável");

        h1.ganharHeranca();
        t1.trabalhar();
        v1.pegarAuxilio();

        h1.valorPatrimonio();
        t1.valorPatrimonio();
        v1.valorPatrimonio();
    }
}
