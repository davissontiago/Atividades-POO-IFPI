package q5;

public class Medio extends Alunos {
    // Atributos
    protected String responsavel;

    // Construtor
    public Medio(String nome, float media,String responsavel){
        this.nome = nome;
        this.media = media;
        this.responsavel = responsavel;
    }

    // Métodos
    @Override
    public void boletim(){
        System.out.println("Nome = "+nome+"\n"+
                            "Média ="+media+"\n"+
                            "Responsável = "+responsavel);
    }
}
