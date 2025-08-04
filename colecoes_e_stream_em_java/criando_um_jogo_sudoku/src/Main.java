import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SudokuGame jogo = new SudokuGame(args);
        Scanner scan = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n==== JOGO SUDOKU ====");
            jogo.exibirTabuleiro();
            System.out.println("\nMenu");
            System.out.println("1. Iniciar novo jogo");
            System.out.println("2. Inserir novo número");
            System.out.println("3. Remover número");
            System.out.println("4. Ver tabuleiro");
            System.out.println("5. Verificar status do jogo");
            System.out.println("6. Limpar tabuleiro (somente jogadas)");
            System.out.println("7. Finalizar jogo");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    jogo.novoJogo(20); // define quantos fixos aleatórios devem ser gerados
                    break;
                case 2:
                    System.out.print("Informe um número de (1-9): ");
                    int numero = scan.nextInt();
                    System.out.print("Informe a linha (0-8): ");
                    int linha = scan.nextInt();
                    System.out.print("Informe a coluna (0-8): ");
                    int coluna = scan.nextInt();
                    jogo.inserirNumero(numero, linha, coluna);
                    break;
                case 3:
                    System.out.print("Informe a linha (0-8): ");
                    linha = scan.nextInt();
                    System.out.print("Informe a coluna (0-8): ");
                    coluna = scan.nextInt();
                    jogo.removerNumero(linha, coluna);
                    break;
                case 4:
                    jogo.exibirTabuleiro();
                    break;
                case 5:
                    jogo.verificarStatus();
                    break;
                case 6:
                    jogo.limparTabuleiro();
                    break;
                case 7:
                    if (jogo.podeFinalizar()) {
                        System.out.println("Parabéns! Jogo finalizado com sucesso.");
                        opcao = 0;
                    } else {
                        System.out.println("O jogo ainda não está completo ou contém erros.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scan.close();
    }
}
