package Atividade10CampMetEstaticos;

public class Aluno {
    // Atributos
    private String nome;
    private double media;
    private static double maiorMedia = 0;

    // Construtor
    public Aluno(double mediaNormal, String nome){
        this.media = mediaNormal;
        this.nome = nome;
        if (mediaNormal > Aluno.maiorMedia) {
            Aluno.maiorMedia = mediaNormal;
        }
    }

    public double calcularMediaFinal(){
        return (this.media/Aluno.maiorMedia) * 10;
    }

    public String getNome() {
        return nome;
    }
    public double getMedia() {
        return media;
    }


}
