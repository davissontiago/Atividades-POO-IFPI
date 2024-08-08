package Atividade02EntradaDados;

import javax.swing.JOptionPane;

public class EntradaSaida {
    public static void main(String[] args) {
        // Questão 01
        String nome1 = JOptionPane.showInputDialog(null,"Digite seu nome:","Q-1",1);
        JOptionPane.showMessageDialog(null,"nome: "+nome1);
        // Questão 02
        String nome2 = JOptionPane.showInputDialog(null,"Digite seu nome:","Q-2",1);
        String idade2 = JOptionPane.showInputDialog(null,"Digite sua idade:","Q-2",1);
        JOptionPane.showMessageDialog(null,"nome: "+nome2+"\n"+"idade: "+idade2);
        // Questão 03
        String nome3 = JOptionPane.showInputDialog(null,"Digite seu nome:","Q-3",1);
        String idade3 = JOptionPane.showInputDialog(null,"Digite sua idade:","Q-3",1);
        String salario3 = JOptionPane.showInputDialog(null,"Digite sua salario:","Q-3",1);
        JOptionPane.showMessageDialog(null,"nome: "+nome3+"\n"+"idade: "+idade3+"\n"+"salario: "+salario3);
        // Questão 04
        String altura4 = JOptionPane.showInputDialog(null,"Digite a altura:","Q-4",1);
        String base4 = JOptionPane.showInputDialog(null,"Digite a base:","Q-4",1);
        double area4 = (Double.valueOf(altura4)*Double.valueOf(base4))/2;
        JOptionPane.showMessageDialog(null,"Area: "+area4);
        // Questão 05
        String altura5 = JOptionPane.showInputDialog(null,"Digite a altura:","Q-5",1);
        String largura5 = JOptionPane.showInputDialog(null,"Digite a largura:","Q-5",1);
        double area5 = Double.valueOf(altura5)*Double.valueOf(largura5);
        double perimetro5 = (2*Double.valueOf(altura5))+(2*Double.valueOf(largura5));
        JOptionPane.showMessageDialog(null,"Area: "+area5+"\n"+"Perimetro: "+perimetro5);
        // Questão 06
        String celsius6 = JOptionPane.showInputDialog(null,"Digite a temperatura em ºC:","Q-6",1);
        double fahrenheit6 = Double.valueOf(celsius6)*1.8+32;
        double kelvin6 = (fahrenheit6+459.67)/1.8;
        JOptionPane.showMessageDialog(null,"Fahrenheit: "+fahrenheit6+"\n"+"kelvin: "+kelvin6);
        // Questão 07
        String salario7 = JOptionPane.showInputDialog(null,"Digite sua salario:","Q-7",1);
        double imposto7 = Double.valueOf(salario7)*0.10;
        JOptionPane.showMessageDialog(null,"Salário: "+salario7+"\n"+"Imposto: "+imposto7);
        // Questão 08
        String salario8 = JOptionPane.showInputDialog(null,"Digite sua salario:","Q-8",1);
        double imposto8 = Double.valueOf(salario8)*0.10;
        double salarioFinal8 = Double.valueOf(salario8)-imposto8;
        JOptionPane.showMessageDialog(null,"Salário: "+salario8+"\n"+"Imposto: "+imposto8+"\n"+"Salário Final: "+salarioFinal8);
        // Questão 09
        String tempo9 = JOptionPane.showInputDialog(null,"Tempo de duração viagem:","Q-9",1);
        String velocidade9 = JOptionPane.showInputDialog(null,"Velocidade média km/h:","Q-9",1);
        double distancia9 = Double.valueOf(tempo9)*Double.valueOf(velocidade9);
        double litros9 = distancia9/12;
        JOptionPane.showMessageDialog(null,"Litros gastos: "+litros9);
        // Questão 10
        String segundosInt = JOptionPane.showInputDialog(null, "Digite o valor em segundos:","Q-10",1);
        int totalSegundos = Integer.parseInt(segundosInt);
        int horas10 = totalSegundos / 3600;
        int minutos10 = (totalSegundos % 3600) / 60;
        int segundos10 = totalSegundos % 60;
        String mensagem = String.format("%d segundos equivalem a %d horas, %d minutos e %d segundos.", totalSegundos, horas10, minutos10, segundos10);
        JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
