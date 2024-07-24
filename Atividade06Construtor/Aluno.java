package Atividade06Construtor;

public class Aluno {
    // Atributos
    private float qualitativo;
    private int faltas;
    private float media;

    // Contrutor
    public Aluno(){
        this.qualitativo = 2;
        this.media = 0;
        this.faltas = 0;
    }

    // Métodos
    public void acionarFaltas(int quant){
        this.faltas += quant;
        this.qualitativo -= 0.10*quant;
    }

    public String calcSituacao(){
        if (this.faltas < 10 && this.qualitativo+this.media >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public float getMedia() {
        return media;
    }
    
    public float getQualitativo() {
        return qualitativo;
    }


}
