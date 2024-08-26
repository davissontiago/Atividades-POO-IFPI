package q6;

public class AnimalTerrestre extends Animal {
    // Métodos
    @Override
    public void locomover() {
        if (energia >= 10) {
            this.energia -= 10;
            System.out.println("O animal está andando, -10 energia");
        } else {
            System.out.println("O animal está fraco demais para andar.");
        }
    }
}

