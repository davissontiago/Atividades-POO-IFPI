package q3;

public class ExemploQ3 {
    public static void main(String[] args) {
        // Funcionario
        Funcionario f1 = new Funcionario();
        System.out.println("Salário = "+f1.calcSalario());
        // Vendedor
        Vendedor f2 = new Vendedor();
        f2.cadastrarVenda(120.0);
        f2.cadastrarVenda(300.0);
        f2.cadastrarVenda(490.0);
        System.out.println(f2.getTotalVendas());
        System.out.println("Salário = "+f2.calcSalario());


    }
}
