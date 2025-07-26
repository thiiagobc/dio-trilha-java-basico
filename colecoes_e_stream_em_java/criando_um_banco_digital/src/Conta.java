public abstract class Conta implements FuncoesConta {
    
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    
    public Conta (Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }
    
     @Override
    public void sacar(double valor) {
        if (valor > saldo){
            System.out.println("Saldo insuficiente para saque de R$" + valor);
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }
        
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (valor > saldo){
            System.out.println("Saldo insuficiente para transferir R$" + valor);
        } else {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso.");
        }
        
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }
 
    public double getSaldo() {
        return saldo;
    }

   
    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: R$ %.2f", this.saldo));
    }

    

    
}
