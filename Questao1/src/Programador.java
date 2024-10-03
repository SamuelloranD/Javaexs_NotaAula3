public class Programador extends Funcionario {
    private String linguagem;

    public Programador(String nome, int nasc, double salario, String linguagem) {
        super(nome, nasc, salario);
        this.linguagem = linguagem;
    }

    public String informarLinguagem() {
        return linguagem;
    }
}
