package q6;

public class AnimalAquatico extends Animal {

    @Override
    public void locomover() {
        if (energia >= 10) {
            this.energia -= 10;
            System.out.println("O animal está nadando, -10 energia");
        } else {
            System.out.println("O animal está fraco demais para nadar.");
        }
    }
}

