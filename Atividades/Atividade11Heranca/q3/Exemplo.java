package q3;

public class Exemplo {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();

        c1.nome = "Pit";
        c1.raça = "PitBul";
        
        System.out.println(c1.comer());
        System.out.println(c1.caminhar());
        System.out.println(c1.latir());

        Gato g1 = new Gato();

        g1.nome = "Tanja";
        g1.raça = "Laranja";

        System.err.println(g1.comer());
        System.err.println(g1.caminhar());
        System.err.println(g1.miar());

    
    }
}
