public class ContaCorrente extends Conta {
    
    private Emprestimo emprestimo;
    
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void solicitarEmprestimo(double valor) {
        Emprestimo emprestimo = new Emprestimo(valor);
        emprestimo.aprovar();
        this.depositar(valor); 
        System.out.println("Empréstimo aprovado e disponível na conta. ");
        emprestimo.exibirEmprestimo();
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
        if (emprestimo != null) {
            emprestimo.exibirEmprestimo();
        }
    }
}
