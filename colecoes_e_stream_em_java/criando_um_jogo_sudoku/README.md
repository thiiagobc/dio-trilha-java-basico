🧩 **Desafio: Jogo Sudoku - Santander Bootcamp DIO**

Este projeto simula um jogo de Sudoku interativo via terminal. O jogador pode inserir e remover números, visualizar o tabuleiro, verificar o status e reiniciar o jogo com novos números fixos aleatórios.

---

🧠 **Conceitos Aplicados**

Este desafio foi realizado após estudar os seguintes tópicos na trilha do bootcamp:

✅ Vetores e Matrizes em Java
✅ Programação Orientada a Objetos
✅ Composição de Classes
✅ Validação de dados e lógica de negócio

---

🏗️ **Estrutura do Projeto**

O projeto é dividido em 5 componentes principais:

* `Main`: classe com o menu principal e entrada do usuário.
* `SudokuGame`: gerencia o fluxo do jogo, status e reinicialização.
* `Tabuleiro`: representa o tabuleiro 9x9 com números e posições fixas.
* `ValidadorSudoku`: valida as regras do jogo (linhas, colunas e subgrades).
* `GeradorSudoku`: gera os números fixos aleatórios válidos.

---

🧾 **Regras do Jogo**

1. Iniciar novo jogo: reinicia o tabuleiro com novos números fixos aleatórios.
2. Inserir número: só permite inserir se a posição estiver vazia e não for fixa.
3. Remover número: só remove se o número não for fixo.
4. Ver tabuleiro: exibe a situação atual do jogo.
5. Verificar status: verifica se o jogo está completo e se há erros.
6. Limpar jogadas: remove apenas os números inseridos pelo jogador.
7. Finalizar: encerra o jogo se o tabuleiro estiver completo e correto.

---

🖥️ **Execução**

Para compilar e executar:

```bash
# Acesse a pasta 'src'
cd src

# Compile todos os arquivos para a pasta 'bin'
javac -d ../bin *.java

# Acesse a pasta bin
cd ../bin

# Execute a aplicação (inicializando vazio)
java Main

# Ou execute com argumentos fixos via linha de comando
java Main 0,0;4,true 0,1;5,true 1,1;6,true
```

---

📌 **Observações**

* Números fixos aparecem como: `[4]`
* Números inseridos pelo jogador aparecem como: `4`
* Posições vazias aparecem como: `   `

---

✍️ **Autor**

Desenvolvido por **Thiago de Brito Corteis** no Santander Bootcamp DIO.
