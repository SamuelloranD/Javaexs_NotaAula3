public class Gerente extends Funcionario {
    private String projeto;

    public Gerente(String nome, int nasc, double salario, String projeto) {
        super(nome, nasc, salario);
        this.projeto = projeto;
    }

    public String informarProjeto() {
        return projeto;
    }
}
