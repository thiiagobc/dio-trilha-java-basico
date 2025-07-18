# 🔁 Desafio: Controle de Fluxo – Santander Bootcamp DIO

Este projeto simula um contador numérico com base em parâmetros fornecidos via terminal. O programa utiliza estrutura de repetição e tratamento de exceção personalizados com base nos fundamentos da linguagem Java.

---

### 📚 Conceitos Aplicados

Este desafio foi realizado após estudar os seguintes tópicos na trilha do bootcamp:

- ✅ Sintaxe Básica em Java  
- ✅ Estruturas de Controle de Fluxo  
- ✅ Manipulação de Entrada com `Scanner`  
- ✅ Criação de Classes e Métodos  
- ✅ Lançamento e Captura de Exceções  
- ✅ Criação de Classes de Exceção Personalizadas  

---

### 🏗️ Estrutura do Projeto

- `Contador.java`: classe principal que realiza a leitura dos parâmetros e chama o método de contagem.  
- `ParametrosInvalidosException.java`: classe personalizada de exceção, utilizada quando os parâmetros são inválidos.

---

### 🖥️ Execução

Para compilar e executar:

```bash
# Compilar os arquivos e gerar os .class dentro de 'bin'
javac -d bin src/*.java

# Executar a aplicação principal
java -cp bin Contador
