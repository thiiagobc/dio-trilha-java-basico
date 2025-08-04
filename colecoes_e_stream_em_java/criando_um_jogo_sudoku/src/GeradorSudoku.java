import java.util.Random;

public class GeradorSudoku {

    public static void gerarFixosAleatorios(Tabuleiro tabuleiro, int quantidade) {
        Random random = new Random();
        int gerados = 0;
        int tentativas = 0;
        int limiteTentativas = 200;

        while (gerados < quantidade && tentativas < limiteTentativas) {
            int linha = random.nextInt(9);
            int coluna = random.nextInt(9);
            int numero = 1 + random.nextInt(9);

            if (tabuleiro.getValor(linha, coluna) == 0 && !tabuleiro.isFixo(linha, coluna)) {
                if (valido(tabuleiro, linha, coluna, numero)) {
                    inserirFixo(tabuleiro, linha, coluna, numero);
                    gerados++;
                }
            }
            tentativas++;
        }

        System.out.println("Foram inseridos " + gerados + " números fixos aleatórios no tabuleiro.");
    }

    private static void inserirFixo(Tabuleiro tabuleiro, int linha, int coluna, int numero) {
        try {
            var matrizField = Tabuleiro.class.getDeclaredField("matriz");
            var fixosField = Tabuleiro.class.getDeclaredField("fixos");

            matrizField.setAccessible(true);
            fixosField.setAccessible(true);

            int[][] matriz = (int[][]) matrizField.get(tabuleiro);
            boolean[][] fixos = (boolean[][]) fixosField.get(tabuleiro);

            matriz[linha][coluna] = numero;
            fixos[linha][coluna] = true;
        } catch (Exception e) {
            System.out.println("Erro ao inserir número fixo aleatório: " + e.getMessage());
        }
    }

    private static boolean valido(Tabuleiro tabuleiro, int linha, int coluna, int numero) {
        for (int j = 0; j < 9; j++)
            if (tabuleiro.getValor(linha, j) == numero) return false;

        for (int i = 0; i < 9; i++)
            if (tabuleiro.getValor(i, coluna) == numero) return false;

        int linBase = (linha / 3) * 3;
        int colBase = (coluna / 3) * 3;
        for (int i = linBase; i < linBase + 3; i++)
            for (int j = colBase; j < colBase + 3; j++)
                if (tabuleiro.getValor(i, j) == numero) return false;

        return true;
    }
}
