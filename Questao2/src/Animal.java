public class Animal {
    private String nome;
    private String raca;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void caminha() {
        System.out.println(nome + " está caminhando.");
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
