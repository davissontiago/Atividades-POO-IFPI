package q3;

public class Vendedor extends Funcionario {
    // Atributos
    protected double totalVendas;

    // Métodos
    public void cadastrarVenda(double valor){
        this.totalVendas += valor;
    }
     
    @Override
    public double calcSalario(){
        return super.calcSalario() + totalVendas*0.10;
    }

    public double getTotalVendas() {
        return totalVendas;
    }
}
