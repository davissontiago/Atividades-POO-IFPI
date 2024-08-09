package Trabalho01POO;

public class EmpregadoTransfer {
    // Atributos
    private String matricula;
    private double valorHoraTrabalho;
    private int totalHorasMes;
    private int totalHorasExtrasMes;
    
    // Construtor
    public EmpregadoTransfer(String matricula, double valorHoraTrabalho){
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

    public void adicionarHoras(int horas){
        this.totalHorasMes += horas;
    }

    public void retirarHoras(int horas){
        this.totalHorasMes -= horas;
    }

    public void transferirHoras(int horas, EmpregadoTransfer empregado){
        retirarHoras(horas);
        empregado.adicionarHoras(horas);
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
