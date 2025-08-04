public class Tabuleiro {
    private int[][] matriz = new int[9][9];
    private boolean[][] fixos = new boolean[9][9];

    public Tabuleiro(String[] args) {
        for (String arg : args) {
            try {
                String[] partes = arg.split(";");
                String[] posicao = partes[0].split(",");
                int linha = Integer.parseInt(posicao[0]);
                int coluna = Integer.parseInt(posicao[1]);
                int valor = Integer.parseInt(partes[1]);
                boolean ehFixo = Boolean.parseBoolean(partes[2]);

                matriz[linha][coluna] = valor;
                fixos[linha][coluna] = ehFixo;
            } catch (Exception e) {
                System.out.println("Argumento mal formatado: " + arg);
            }
        }
    }

    public void exibir() {
        System.out.println("\n    0   1   2   3   4   5   6   7   8");
        System.out.println("  +-----------+-----------+-----------+");
        for (int i = 0; i < 9; i++) {
            System.out.print(i + " |");
            for (int j = 0; j < 9; j++) {
                int valor = matriz[i][j];
                String celula;

                if (valor == 0) {
                    celula = "   ";
                } else if (fixos[i][j]) {
                    celula = "[" + valor + "]";
                } else {
                    celula = " " + valor + " ";
                }

                System.out.print(celula);
                if ((j + 1) % 3 == 0) System.out.print("|");
            }
            System.out.println();
            if ((i + 1) % 3 == 0)
                System.out.println("  +-----------+-----------+-----------+");
        }
    }

    public void inserir(int numero, int linha, int coluna) {
        if (fixos[linha][coluna]) {
            System.out.println("Erro: Não é possível alterar um número fixo.");
        } else if (matriz[linha][coluna] != 0) {
            System.out.println("Erro: Essa posição já está preenchida.");
        } else if (numero < 1 || numero > 9) {
            System.out.println("Erro: Número inválido.");
        } else {
            matriz[linha][coluna] = numero;
            System.out.println("Número inserido com sucesso.");
        }
    }

    public void remover(int linha, int coluna) {
        if (fixos[linha][coluna]) {
            System.out.println("Erro: Não é possível remover um número fixo.");
        } else if (matriz[linha][coluna] == 0) {
            System.out.println("Erro: Essa posição já está vazia.");
        } else {
            matriz[linha][coluna] = 0;
            System.out.println("Número removido com sucesso.");
        }
    }

    public void reiniciar() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (!fixos[i][j]) matriz[i][j] = 0;
            }
        }
        System.out.println("Jogo reiniciado. Apenas números fixos mantidos.");
    }

    public void limparTudo() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                matriz[i][j] = 0;
                fixos[i][j] = false;
            }
        }
        System.out.println("Tabuleiro limpo. Todos os números apagados, incluindo os fixos.");
    }

    public boolean estaVazio() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (!fixos[i][j] && matriz[i][j] != 0) return false;
            }
        }
        return true;
    }

    public boolean estaCompleto() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (matriz[i][j] == 0) return false;
            }
        }
        return true;
    }

    public int getValor(int linha, int coluna) {
        return matriz[linha][coluna];
    }

    public boolean isFixo(int linha, int coluna) {
        return fixos[linha][coluna];
    }
}
