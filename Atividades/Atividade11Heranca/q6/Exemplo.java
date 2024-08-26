package q6;

public class Exemplo {
    public static void main(String[] args) {
        AnimalTerrestre leao = new AnimalTerrestre();
        leao.locomover();
        leao.locomover();
        leao.comer();
        leao.locomover();

        AnimalAquatico peixe = new AnimalAquatico();
        peixe.locomover();
        peixe.locomover();
        peixe.comer();
        peixe.locomover();

        AnimalAereo aguia = new AnimalAereo();
        aguia.locomover();
        aguia.locomover();
        aguia.comer();
        aguia.locomover();
    }
}
