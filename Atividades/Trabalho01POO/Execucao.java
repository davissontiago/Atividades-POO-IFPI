package Trabalho01POO;

public class Execucao {
    public static void main(String[] args) {
        System.out.println("------------------- Questão 01 -------------------");
        // LampadaTresEstados
        LampadaTresEstados l1 = new LampadaTresEstados();

        System.out.println("A lâmpada está = "+l1.getEstado());
        l1.acender();
        System.out.println("A lâmpada está = "+l1.getEstado());
        l1.meiaLuz();
        System.out.println("A lâmpada está = "+l1.getEstado());
        l1.apagar();
        System.out.println("A lâmpada está = "+l1.getEstado());

        System.out.println("------------------- Questão 02 -------------------");
        // LampadaDimerizada
        LampadaDimerizada l2 = new LampadaDimerizada();

        System.out.println(l2.getLuminosidade()+"% de luminosidade");
        l2.acender();
        System.out.println(l2.getLuminosidade()+"% de luminosidade");
        l2.aumentarLuminosidade();
        System.out.println(l2.getLuminosidade()+"% de luminosidade");
        l2.diminuirLuminosidade();
        System.out.println(l2.getLuminosidade()+"% de luminosidade");
        l2.aumentarLuminosidade();
        System.out.println(l2.getLuminosidade()+"% de luminosidade");
        l2.apagar();
        System.out.println(l2.getLuminosidade()+"% de luminosidade");
        l2.diminuirLuminosidade();
        System.out.println(l2.getLuminosidade()+"% de luminosidade");
        l2.aumentarLuminosidade();
        System.out.println(l2.getLuminosidade()+"% de luminosidade");
        l2.diminuirLuminosidade();
        System.out.println(l2.getLuminosidade()+"% de luminosidade");

        System.out.println("------------------- Questão 03 -------------------");
        // Empregado
        Empregado e1 = new Empregado("EMP0017", 50);

        System.out.println("Total Hrs Mês = "+e1.getTotalHorasMes());
        e1.registrarPonto(7, 15);
        System.out.println("Total Hrs Mês = "+e1.getTotalHorasMes());
        e1.registrarPonto(7, 15);
        System.out.println("Total Hrs Mês = "+e1.getTotalHorasMes());
        System.out.println("Salário do Mês = R$"+e1.calcularSalario());
        System.out.println("Total Hrs Mês = "+e1.getTotalHorasMes());
        System.out.println("Salário do Mês = R$"+e1.calcularSalario());
        System.out.println("Total Hrs Mês = "+e1.getTotalHorasMes());

        System.out.println("------------------- Questão 04 -------------------");
        // EmpregadoHrExtra
        EmpregadoHrExtra e2 = new EmpregadoHrExtra("EMP0017", 50);

        System.out.println("Total Hrs Mês = "+e2.getTotalHorasMes()+"\n"+
                           "Total HrsExtra Mês = "+e2.getTotalHorasExtrasMes());

        e2.registrarPonto(7, 17);
        System.out.println("Total Hrs Mês = "+e2.getTotalHorasMes()+"\n"+
        "Total HrsExtra Mês = "+e2.getTotalHorasExtrasMes());

        e2.registrarPonto(7, 17);
        System.out.println("Total Hrs Mês = "+e2.getTotalHorasMes()+"\n"+
                           "Total HrsExtra Mês = "+e2.getTotalHorasExtrasMes());

        System.out.println("Salário do Mês = R$"+e2.calcularSalario());
        System.out.println("Total Hrs Mês = "+e2.getTotalHorasMes()+"\n"+
                           "Total HrsExtra Mês = "+e2.getTotalHorasExtrasMes());

        System.out.println("Salário do Mês = R$"+e2.calcularSalario());
        System.out.println("Total Hrs Mês = "+e2.getTotalHorasMes()+"\n"+
                           "Total HrsExtra Mês = "+e2.getTotalHorasExtrasMes());

        System.out.println("------------------- Questão 05 -------------------");
        // EmpregadoTransfer
        EmpregadoTransfer e[] = new EmpregadoTransfer[2];

        e[0] = new EmpregadoTransfer("EMP0", 50);
        e[1] = new EmpregadoTransfer("EMP1", 50);

        e[0].registrarPonto(7, 17);
        e[0].registrarPonto(7, 17);
        e[1].registrarPonto(12, 17);
        e[1].registrarPonto(10, 17);
        System.out.println(e[0].getMatricula()+"|Total Hrs Mês = "+e[0].getTotalHorasMes()+"\n"+
                           e[0].getMatricula()+"|Total HrsExtra Mês = "+e[0].getTotalHorasExtrasMes());
        System.out.println(e[1].getMatricula()+"|Total Hrs Mês = "+e[1].getTotalHorasMes()+"\n"+
                           e[1].getMatricula()+"|Total HrsExtra Mês = "+e[1].getTotalHorasExtrasMes());
        e[0].transferirHoras(4, e[1]);
        System.out.println(e[0].getMatricula()+"|Total Hrs Mês = "+e[0].getTotalHorasMes()+"\n"+
                           e[0].getMatricula()+"|Total HrsExtra Mês = "+e[0].getTotalHorasExtrasMes());
        System.out.println(e[1].getMatricula()+"|Total Hrs Mês = "+e[1].getTotalHorasMes()+"\n"+
                           e[1].getMatricula()+"|Total HrsExtra Mês = "+e[1].getTotalHorasExtrasMes());
        System.out.println(e[0].getMatricula()+"|Salário do Mês = R$"+e[0].calcularSalario());
        System.out.println(e[1].getMatricula()+"|Salário do Mês = R$"+e[1].calcularSalario());
        System.out.println(e[0].getMatricula()+"|Total Hrs Mês = "+e[0].getTotalHorasMes()+"\n"+
                           e[0].getMatricula()+"|Total HrsExtra Mês = "+e[0].getTotalHorasExtrasMes());
        System.out.println(e[1].getMatricula()+"|Total Hrs Mês = "+e[1].getTotalHorasMes()+"\n"+
                           e[1].getMatricula()+"|Total HrsExtra Mês = "+e[1].getTotalHorasExtrasMes());
                           
    }
}
