public class Emprestimo {

    private double valorSolicitado;
    private double taxaJuros = 0.05;
    private boolean aprovado;

    public Emprestimo(double valorSolicitado) {
        this.valorSolicitado = valorSolicitado;
        this.aprovado = false;
    }

    public double getValorSolicitado() {
        return valorSolicitado;
    }

    public void setValorSolicitado(double valorSolicitado) {
        this.valorSolicitado = valorSolicitado;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public double getValorComJuros() {
        return valorSolicitado * (1 + taxaJuros);
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void aprovar() {
        this.aprovado = true;
    }

    public void exibirEmprestimo() {
        System.out.println("=== Detalhes do Empréstimo ===");
        System.out.println("Valor solicitado: R$ " + valorSolicitado);
        System.out.println("Taxa de juros: " + (taxaJuros * 100) + "%");
        System.out.println("Valor total a pagar: " + getValorComJuros());
        System.out.println("Status: " + (aprovado ? "Aprovado" : "Pendente"));

    }    
}
