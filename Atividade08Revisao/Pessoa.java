package Atividade08Revisao;

public class Pessoa {
    // Atributos
    private String nome;
    private int idade;

    // Construtor
    public Pessoa() {
        this("Fulano",0);
    }

    public Pessoa(String nome) {
        this(nome,0);
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos
    public String exibir(){
        return "Nome = "+getNome() +"\n"+ "Idade = "+getIdade();
    }

    // Gets&Sets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    
}
