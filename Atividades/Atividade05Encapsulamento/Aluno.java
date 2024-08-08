package Atividade05Encapsulamento;

public class Aluno {
    // Atributos
    private String nome;
    private float media;
    
    // Métodos
    public String calcSituacao(){
        if (media >=7 ) {
            return this.nome + " Aprovado";
        } else {
            return this.nome + " Reprovado";
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getMedia() {
        return media;
    }
    public void setMedia(float media) {
        this.media = media;
    }
}
