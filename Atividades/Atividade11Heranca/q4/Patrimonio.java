package q4;

public class Patrimonio {
    // Atributos
    protected double valor;
    protected String nome;

    // Métodos
    public double valorPatrimonio() {
        System.out.println(this.nome+ "tem R$ "+this.valor);
        return valor;
    }
}
