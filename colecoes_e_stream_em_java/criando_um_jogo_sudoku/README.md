🧩 Projeto Sudoku em Java - Santander Bootcamp DIO

Este projeto simula um jogo de Sudoku interativo via terminal. O usuário pode inserir/remover números, visualizar o tabuleiro, verificar o status do jogo e reiniciar com novos números fixos aleatórios.

🧠 Conceitos Aplicados

Este projeto foi desenvolvido após estudar os seguintes tópicos:

✅ Vetores e Matrizes em Java✅ Programação Orientada a Objetos✅ Composição de Classes✅ Validação de dados e lógica de negócio

🏗️ Estrutura do Projeto

O projeto é composto por 5 classes principais:

Main: classe com o menu principal e entrada do usuário.

SudokuGame: gerencia o fluxo do jogo, status e reinicialização.

Tabuleiro: representa o tabuleiro 9x9 com números e fixos.

ValidadorSudoku: valida regras do jogo (linhas, colunas e subgrades).

GeradorSudoku: gera números fixos aleatórios válidos para o jogo.

🧾 Regras do Jogo

Iniciar novo jogo: limpa o tabuleiro e insere números fixos aleatórios automaticamente.

Inserir novo número: usuário escolhe número, linha e coluna. Não pode sobrescrever fixos ou números existentes.

Remover número: só remove números inseridos pelo jogador. Fixos não podem ser removidos.

Ver tabuleiro: mostra o estado atual do tabuleiro.

Verificar status: informa se o jogo está: não iniciado, incompleto ou completo, com ou sem erros.

Limpar jogadas: remove todos os números inseridos, mantendo os fixos.

Finalizar jogo: permite finalizar apenas se o tabuleiro estiver completo e sem erros.

🖥️ Execução

Para compilar e executar:

# Acesse a pasta 'src'
cd src

# Compile todos os arquivos para a pasta 'bin'
javac -d ../bin *.java

# Acesse a pasta bin
tcd ../bin

# Execute a aplicação (inicializando vazio)
java Main

# Ou execute com argumentos fixos via linha de comando
java Main 0,0;4,true 0,1;5,true 1,1;6,true

📌 Observações

Números fixos aparecem como: [4]

Números inseridos pelo jogador aparecem como: 4

Posições vazias aparecem como:    

🔖 Autor
Desenvolvido por Thiago de Brito Corteis no Santander Bootcamp DIO.

