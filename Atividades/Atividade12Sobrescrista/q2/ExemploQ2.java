package q2;

public class ExemploQ2 {
    public static void main(String[] args) {
        // Animal
        Animal a1 = new Animal();
        System.out.println(a1.getEnergia());
        a1.comer();
        a1.andar();
        a1.andar();
        a1.andar();
        a1.andar();
        a1.andar();
        a1.andar();
        a1.andar();
        a1.andar();
        a1.andar();
        a1.andar();
        a1.andar();
        System.out.println(a1.getEnergia());
        // BeijaFlor
        Animal a2 = new BeijaFlor();
        System.out.println(a2.getEnergia());
        a2.comer();
        a2.andar();
        a2.andar();
        a2.andar();
        a2.andar();
        a2.andar();
        a2.andar();
        a2.andar();
        a2.andar();
        a2.andar();
        a2.andar();
        a2.andar();
        System.out.println(a2.getEnergia());
    }
}
