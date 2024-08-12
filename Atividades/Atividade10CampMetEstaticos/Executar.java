package Atividade10CampMetEstaticos;

public class Executar {
    public static void main(String[] args) {
        // Conta Q-1 e Q-2
        System.out.println("--------------- Q-1 ---------------");
        Conta cA = new Conta();
        Conta cB = new Conta();
        System.out.println("Número conta = "+cA.getNumero()); 
        System.out.println("Número conta = "+cB.getNumero());

        System.out.println("--------------- Q-2 ---------------");
        System.out.println("Saldo = "+cA.getSaldo());
        System.out.println("Saldo = "+cB.getSaldo());
        cA.depositar(1000);
        cB.depositar(100);
        System.out.println("Saldo = "+cA.getSaldo());
        System.out.println("Saldo = "+cB.getSaldo());
        cA.sacar(100);
        cB.sacar(20);
        System.out.println("Saldo = "+cA.getSaldo());
        System.out.println("Saldo = "+cB.getSaldo());

        // Aluno Q-3
        System.out.println("--------------- Q-3 ---------------");
        Aluno a1 = new Aluno(6.0, "José");
        Aluno a2 = new Aluno(7.0, "Pedro");
        Aluno a3 = new Aluno(8.0, "Maria");
        System.out.println("Nome: "+ a1.getNome());
        System.out.println("Media: "+ a1.getMedia());
        System.out.println("Media Final: "+ a1.calcularMediaFinal());
        System.out.println("Nome: "+ a2.getNome());
        System.out.println("Media: "+ a2.getMedia());
        System.out.println("Media Final: "+ a2.calcularMediaFinal());
        System.out.println("Nome: "+ a3.getNome());
        System.out.println("Media: "+ a3.getMedia());
        System.out.println("Media Final: "+ a3.calcularMediaFinal());

        // Conversor Q-4
        System.out.println("--------------- Q-4 ---------------");
        double celsius = 25.0;
        double fahrenheit = 77.0;
        double kelvin = 298.15;

        System.out.println(celsius+"°C = " + Conversor.celsiusFahrenheit(celsius)+"°F");
        System.out.println(fahrenheit+"°F = " + Conversor.fahrenheitCelsius(fahrenheit)+"°C");
        System.out.println(celsius+"°C = " + Conversor.celsiusKelvin(celsius)+"K");
        System.out.println(kelvin +"K = " + Conversor.kelvinCelsius(kelvin)+"°C");
        System.out.println(fahrenheit + "°F = " + Conversor.fahrenheitKelvin(fahrenheit)+"K");
        System.out.println(kelvin +"K = " + Conversor.kelvinFahrenheit(kelvin)+"°F");
    }
}
