public class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }

    public void mia() {
        System.out.println(getNome() + " está miando.");
    }
}
