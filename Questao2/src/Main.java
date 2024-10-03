import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolhe um animal: \n1. Cachorro\n2. Gato" );
        int escolha = sc.nextInt();
        sc.nextLine();

        switch (escolha) {
            case 1:
                System.out.println("Digite o nome do cachorro: ");
                String nomeCachorro = sc.nextLine();
                Cachorro cachorro = new Cachorro(nomeCachorro);

                cachorro.caminha();
                cachorro.late();
                break;
            case 2:
                System.out.println("\nDigite o nome do gato: ");
                String nomeGato = sc.nextLine();
                Gato gato = new Gato(nomeGato);

                gato.caminha();
                gato.mia();
        }

        sc.close();
    }
}
