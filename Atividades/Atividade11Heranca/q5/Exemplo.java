package q5;

public class Exemplo {
    public static void main(String[] args) {
        Medio m1 = new Medio("Lucas", 8, "Maria");
        Tecnico t1 = new Tecnico("Eduardo", 7, "MedImagem");
        Superior s1 = new Superior("Anna", 9);

        m1.boletim();
        t1.boletim();
        s1.boletim();
        s1.concluirTCC();
        s1.boletim();
    }
}
