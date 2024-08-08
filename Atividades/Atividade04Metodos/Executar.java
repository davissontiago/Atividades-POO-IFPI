package Atividade04Metodos;

public class Executar {
    public static void main(String[] args) {
        // Circulo
        Circulo c1 = new Circulo();

        c1.raio = 4;
        System.out.println(c1.calcArea());

        // Empregado
        Empregado e1 = new Empregado();

        System.out.println(e1.hrsTrabalhadas);
        e1.adicionarHrs(8);
        System.out.println(e1.hrsTrabalhadas);

        // Empregado2
        Empregado2 e2 = new Empregado2();

        e2.adicionarHrs(6);
        System.out.println(e2.calcSalario());

        // Lampada
        Lampada l1 = new Lampada();

        System.out.println(l1.estado);
        l1.acender();
        System.out.println(l1.estado);
        l1.apagar();
        System.out.println(l1.estado);

        // Carro
        Carro car = new Carro();

        System.out.println(car.velocidade);
        car.acelerar();
        System.out.println(car.velocidade);
        car.acelerar();
        System.out.println(car.velocidade);
        car.frear();
        System.out.println(car.velocidade);
        car.acelerar();
        System.out.println(car.velocidade);
    }
}
