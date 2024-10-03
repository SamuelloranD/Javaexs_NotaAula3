import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Gerente\n2. Programador");
        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("Digite o nome do gerente: ");
                String nomeGerente = sc.nextLine();
                System.out.println("Digite o ano de nascimento: ");
                int nascGerente = sc.nextInt();
                System.out.println("Digite o salário do gerente: ");
                double salarioGerente = sc.nextDouble();
                sc.nextLine();

                System.out.println("Digite o projeto do gerente: ");
                String projetoGerente = sc.nextLine();

                Gerente gerente = new Gerente(nomeGerente, nascGerente, salarioGerente, projetoGerente);

                System.out.println("Gerente: " + gerente.getNome());
                System.out.printf("Salário: R$ %.2f\n", gerente.informarSalario());
                System.out.println("Idade: " + gerente.calcularIdade() + " anos");
                System.out.println("Projeto: " + gerente.informarProjeto());
                break;
            case 2:
                System.out.println("\nDigite o nome do programador: ");
                String nomeProgramador = sc.nextLine();
                System.out.println("Digite o ano de nascimento: ");
                int nascProgramador = sc.nextInt();
                System.out.println("Digite o salário do programador: ");
                double salarioProgramador = sc.nextDouble();
                sc.nextLine();

                System.out.println("Digite a linguagem do programador: ");
                String linguagemProgramador = sc.nextLine();

                Programador programador = new Programador(nomeProgramador, nascProgramador, salarioProgramador, linguagemProgramador);

                System.out.println("Programador: " + programador.getNome());
                System.out.printf("Salário: R$ %.2f\n", programador.informarSalario());
                System.out.println("Idade: " + programador.calcularIdade() + " anos");
                System.out.println("Linguagem: " + programador.informarLinguagem());
                break;
        }

        sc.close();
    }
}
