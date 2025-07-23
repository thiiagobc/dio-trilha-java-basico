import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //Exibir as mensagens para nosso usuário

        //Obter pela classe scanner os valores digitados no terminal

        //Exibir a mensagem da conta criada
        

    Scanner scan = new Scanner(System.in);

        //Boas vindas
        System.out.println("Bem-vindo ao Banco Java!");


        //Número da conta em INTEIRO
        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = scan.nextInt();

        //Número da agência em STRING
        System.out.println("Por favor, digite o número da agência: ");
        String numeroAgencia = scan.next();

        //Nome do cliente em STRING
        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = scan.next();

        //Saldo da conta em DOUBLE
        System.out.println("Por favor, digite o saldo da conta: ");
        double saldoConta = scan.nextDouble();

        //Toda apresentação
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo R$ " + saldoConta + " já está disponível para saque.");
            
    scan.close();
    }
}
