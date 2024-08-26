package q4;

public class Herdeiros extends Patrimonio {
    // Construtor
    public Herdeiros(String nome){
        this.nome = nome;
    }

    // Métodos
    public void ganharHeranca(){
        this.valor += 1000000.0;
        System.out.println(this.nome+" ganhou R$ 1.000.000,00 de Herança");
    }

   

    
}