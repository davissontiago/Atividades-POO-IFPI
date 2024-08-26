package q6;

public class Animal {
    // Atributos
    protected int energia = 10;


    public void comer() {
        this.energia += 10;
        System.out.println("Animal comeu, +10 de energia.");
    }

    // Métodos
    public void locomover() {
        if (energia >= 10) {
            this.energia -= 10;
            System.out.println("O animal está se movendo, -10 energia");
        } else {
            System.out.println("Animal está fraco");
        }
    }
}
