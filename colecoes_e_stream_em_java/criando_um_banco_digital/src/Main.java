import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        // Boas vindas
        Banco banco = new Banco();
        banco.setNome("Banco Digital Santander-DIO");
        System.out.println("=== Bem-vindo ao " + banco.getNome() + " ===\n");


        // Criando cliente
        Cliente thiago = new Cliente();
        thiago.setNome("Thiago");
        
        // Criando contas
        ContaCorrente cc = new ContaCorrente(thiago);
        Conta poupanca = new ContaPoupanca(thiago);

        // Adicionando contas ao banco
        banco.getContas().add(cc);
        banco.getContas().add(poupanca);

        // Listando as contas
        System.out.println("Lista de Contas no banco: ");
        banco.listarContas();
        System.out.println();

        // Operações
        System.out.println("\n--- Depósito na Conta Corrente ---\n");
        cc.depositar(100);
        cc.imprimirExtrato();

        System.out.println("\n--- Transferência da Conta corrente para Poupança ---");
        cc.transferir(100, poupanca);
        System.out.println();
        
        

        System.out.println("\nEmpréstimo disponível, gostaria de solicitar? (s/n): ");
        String resposta = scan.nextLine();
        if (resposta.equalsIgnoreCase(("s"))){
            System.out.println("Digite o valor do empréstimo: ");    
            double valor = scan.nextDouble();
            cc.solicitarEmprestimo(valor);
        }

        // Extratos finais
        System.out.println("\n--- Resumo das contas ---\n");  
        cc.imprimirExtrato();
        System.out.println();
        poupanca.imprimirExtrato();

        scan.close();
    }
}
