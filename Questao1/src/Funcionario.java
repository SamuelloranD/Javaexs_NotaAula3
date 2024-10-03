public class Funcionario {
    private String nome;
    private int nasc;
    private double salario;

    public Funcionario(String nome, int nasc, double salario) {
        this.nome = nome;
        this.nasc = nasc;
        this.salario = salario;
    }

    public double informarSalario() {
        return salario;
    }

    public int calcularIdade() {
        return 2024 - nasc;
    }

    public String getNome() {
        return nome;
    }
}
