package q5;

public class Superior extends Alunos {
    // Atributos
    protected boolean tcc = false;

    // Construtor
    public Superior(String nome, float media){
        this.nome = nome;
        this.media = media;
    }

    // Métodos
    @Override
    public void boletim(){
        if (tcc == true) {
            System.out.println("Nome = "+nome+"\n"+
                            "Média ="+media+"\n"+
                            "TCC = Concluido");
        } else {
            System.out.println("Nome = "+nome+"\n"+
                            "Média ="+media+"\n"+
                            "TCC = Não Concluido");
        }
    }

    public void concluirTCC(){
        this.tcc = true;
        System.out.println(this.nome+" concluiu seu TCC");
    }

}
