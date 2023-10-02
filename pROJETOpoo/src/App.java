import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
            
        Cadastrar cadastro = new Cadastrar();
        Scanner scanner = new Scanner(System.in);

        int escolha;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Time");
            System.out.println("2. Cadastrar Jogador");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine();  // Limpa o buffer do teclado

            switch (escolha) {
                case 1:
                    System.out.print("\nNome do Time: ");
                    String nomeTime = scanner.nextLine();
                    System.out.print("Cidade do Time: ");
                    String cidadeTime = scanner.nextLine();
                    Time time = new Time(nomeTime, cidadeTime);
                    cadastro.cadastrarTime(time);
                    System.out.println("\nTime cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.print("\nNome do Time do Jogador: ");
                    String nomeTimeJogador = scanner.nextLine();
                    System.out.print("Cidade do Time do Jogador: ");
                    String cidadeTimeJogador = scanner.nextLine();

                    // Verifica se o time existe
                    if (!cadastro.existeTime(nomeTimeJogador, cidadeTimeJogador)) {
                        System.out.println("\nTime inexistente. Tente novamente.");
                        break;
                    }

                    System.out.print("Nome do Jogador: ");
                    String nomeJogador = scanner.nextLine();
                    System.out.print("Idade do Jogador: ");
                    int idadeJogador = scanner.nextInt();
                    scanner.nextLine();  // Limpa o buffer do teclado

                    Jogador jogador = new Jogador(nomeTimeJogador, cidadeTimeJogador, nomeJogador, idadeJogador);
                    cadastro.cadastrarJogador(jogador);
                    System.out.println("\nJogador cadastrado com sucesso!");
                    break;
                case 3:
                    System.out.println("\nSaindo...");
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
                    break;
            }

        } while (escolha != 3);
    }
}







