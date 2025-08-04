## 🏦 Desafio Banco Digital com Java e Orientação a Objetos

Este projeto faz parte do Bootcamp Santander da DIO, na etapa de **Programação Orientada a Objetos com Java**.  
Aqui, simulamos as funcionalidades básicas de um banco digital, utilizando os pilares de POO: **abstração, encapsulamento, herança e polimorfismo**.

---

### 🧠 Conceitos Aplicados

Este desafio foi realizado após estudar os seguintes tópicos:

- 🧱 Abstração com classe `Conta` *(classe abstrata base)*
- 🔒 Encapsulamento dos atributos (`private` + `getters` / `setters`)
- 🧬 Herança com `ContaCorrente` e `ContaPoupanca`
- 🧪 Polimorfismo com método `imprimirExtrato()`
- 🧩 Composição com classe `Cliente`
- 🧰 Interface `FuncoesConta` para padronizar operações
- 💳 Criação de empréstimo via classe `Emprestimo`
- 🧑‍💻 Uso da classe `Scanner` para interação com o usuário
- 🗂️ Organização do projeto com separação de `src` e `bin`

---

### ⚙️ Funcionalidades

- Criar cliente e contas (corrente e poupança)
- Depósito e transferência entre contas
- Solicitação de empréstimo com validação de valor
- Exibição de extrato completo
- Listagem de contas criadas no banco

---

### 💻 Execução

Para compilar e executar:

```bash
# Compilar todos os arquivos .java da pasta 'src'
javac -d bin src/*.java

# Executar a aplicação principal
java -cp bin Main
