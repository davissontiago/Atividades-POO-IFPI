package q2;

public class Animal {
    // Atributos
    protected int energia;

    // Métodos
    public void comer(){
        this.energia += 10;
        System.out.println("Comeu +10 energia");
    }

    public void andar(){
        if (energia >= 1) {
            this.energia -= 1;
            System.out.println("Andou -1 energia");
        } else {
            System.out.println("Sem energia");
        }
    }

    public int getEnergia() {
        return energia;
    }
}
