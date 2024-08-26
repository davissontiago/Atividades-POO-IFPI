package q4;

public class Trabalhadores extends Patrimonio {
    // Construtor
    public Trabalhadores(String nome){
        this.nome = nome;
    }

    // Métodos
    public void trabalhar(){
        this.valor += 1500;
        System.out.println(this.nome+" ganhou R$ 1.500,00 de Trabalhando");

    }
}
