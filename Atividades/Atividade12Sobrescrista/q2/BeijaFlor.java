package q2;

public class BeijaFlor extends Animal{
    // Métodos
    @Override
    public void comer(){
        this.energia += 100;
        System.out.println("Comeu flor +100 energia");
    }

    @Override
    public void andar(){
        if (energia >= 10) {
            this.energia -= 10;
            System.out.println("Voou -10 energia");
        } else {
            System.out.println("Sem energia");
        }
    }
}
