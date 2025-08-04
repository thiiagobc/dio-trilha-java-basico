public class SudokuGame {
    private Tabuleiro tabuleiro;
    private ValidadorSudoku validador;

    public SudokuGame(String[] args) {
        this.tabuleiro = new Tabuleiro(args);
        this.validador = new ValidadorSudoku();
    }

    public void inserirNumero(int numero, int linha, int coluna) {
        tabuleiro.inserir(numero, linha, coluna);
    }

    public void removerNumero(int linha, int coluna) {
        tabuleiro.remover(linha, coluna);
    }

    public void reiniciarJogo() {
        tabuleiro.reiniciar();
    }

    public void limparTabuleiro() {
        reiniciarJogo();
    }

    public void exibirTabuleiro() {
        tabuleiro.exibir();
    }

    public void verificarStatus() {
        if (tabuleiro.estaVazio()) {
            System.out.println("Status do jogo: NÃO INICIADO.");
        } else {
            boolean completo = tabuleiro.estaCompleto();
            boolean erros = validador.temErros(tabuleiro);

            if (completo && !erros) {
                System.out.println("Status do jogo: COMPLETO E SEM ERROS!");
            } else if (completo && erros) {
                System.out.println("Status do jogo: COMPLETO E COM ERROS!");
            } else if (!completo && erros) {
                System.out.println("Status do jogo: INCOMPLETO E COM ERROS.");
            } else {
                System.out.println("Status do jogo: INCOMPLETO E SEM ERROS.");
            }
        }
    }

    public boolean podeFinalizar() {
        return tabuleiro.estaCompleto() && !validador.temErros(tabuleiro);
    }

    public void novoJogo(int quantidadeFixos) {
        tabuleiro.limparTudo();
        GeradorSudoku.gerarFixosAleatorios(tabuleiro, quantidadeFixos);
    }

    public Tabuleiro getTabuleiro() {
        return this.tabuleiro;
    }
}
