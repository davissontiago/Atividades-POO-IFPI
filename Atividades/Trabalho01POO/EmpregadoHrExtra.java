package Trabalho01POO;

public class EmpregadoHrExtra {
    // Atributos
    private String matricula;
    private double valorHoraTrabalho;
    private int totalHorasMes;
    private int totalHorasExtrasMes;
    
    // Construtor
    public EmpregadoHrExtra(String matricula, double valorHoraTrabalho){
        this.matricula = matricula;
        this.valorHoraTrabalho = valorHoraTrabalho;
        this.totalHorasMes = 0;
        this.totalHorasExtrasMes = 0;
    }

    // Métodos
    public void registrarPonto(int horaChegada, int horaSaida){
        int horasTrabalhadasDia = horaSaida - horaChegada;
        if (horasTrabalhadasDia > 8) {
            this.totalHorasMes += 8;
            this.totalHorasExtrasMes += horasTrabalhadasDia - 8;
        } else {
            this.totalHorasMes += horasTrabalhadasDia;
        }
    }

    public double calcularSalario(){
        double salario = (this.valorHoraTrabalho * this.totalHorasMes) + ((this.valorHoraTrabalho*1.5) * this.totalHorasExtrasMes);
        this.totalHorasMes = 0;
        this.totalHorasExtrasMes = 0;
        return salario;
    }

    public int getTotalHorasMes() {
        return totalHorasMes;
    }

    public int getTotalHorasExtrasMes() {
        return totalHorasExtrasMes;
    }

    public String getMatricula() {
        return matricula;
    }

}
