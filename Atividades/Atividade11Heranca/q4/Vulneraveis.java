package q4;

public class Vulneraveis extends Patrimonio {
    // Construtor
    public Vulneraveis(String nome){
        this.nome = nome;
    }

    // Métodos
    public void pegarAuxilio(){
        this.valor += 600;
        System.out.println(this.nome+" ganhou R$ 800,00 com auxílio do governo");

    }
}
