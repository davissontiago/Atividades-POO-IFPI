package q5;

public class Tecnico extends Alunos {
    // Atributos
    protected String localEstagio;

    // Construtor
    public Tecnico(String nome, float media, String localEstagio){
        this.nome = nome;
        this.media = media;
        this.localEstagio = localEstagio;
    }
    
    // Métodos
    @Override
    public void boletim(){
        System.out.println("Nome = "+nome+"\n"+
                            "Média ="+media+"\n"+
                            "Local Estágio = "+localEstagio);
    }
}
