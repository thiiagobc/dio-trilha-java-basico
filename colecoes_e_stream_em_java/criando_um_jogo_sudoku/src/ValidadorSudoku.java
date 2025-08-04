import java.util.HashSet;
import java.util.Set;

public class ValidadorSudoku {

    public boolean temErros(Tabuleiro tabuleiro) {
        return temErroLinha(tabuleiro) ||
               temErroColuna(tabuleiro) ||
               temErroSubGrade(tabuleiro);
    }

    private boolean temErroLinha(Tabuleiro tabuleiro) {
        for (int i = 0; i < 9; i++) {
            Set<Integer> vistos = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                int valor = tabuleiro.getValor(i, j);
                if (valor != 0 && !vistos.add(valor)) return true;
            }
        }
        return false;
    }

    private boolean temErroColuna(Tabuleiro tabuleiro) {
        for (int j = 0; j < 9; j++) {
            Set<Integer> vistos = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                int valor = tabuleiro.getValor(i, j);
                if (valor != 0 && !vistos.add(valor)) return true;
            }
        }
        return false;
    }

    private boolean temErroSubGrade(Tabuleiro tabuleiro) {
        for (int linhaBase = 0; linhaBase < 9; linhaBase += 3) {
            for (int colunaBase = 0; colunaBase < 9; colunaBase += 3) {
                Set<Integer> vistos = new HashSet<>();
                for (int i = linhaBase; i < linhaBase + 3; i++) {
                    for (int j = colunaBase; j < colunaBase + 3; j++) {
                        int valor = tabuleiro.getValor(i, j);
                        if (valor != 0 && !vistos.add(valor)) return true;
                    }
                }
            }
        }
        return false;
    }
}
