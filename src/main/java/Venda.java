// Versão do NetBeans: 24
// Aluna: Maria Eduarda Feliciano Lunelli - RA: 2768410

public class Venda {

    private Cliente cliente;
    private Vendedor vendedor;
    private Bebida bebidaVendida;
    private int quantidade;
    private String formaPagamento;
    private double desconto;

    public Venda() {
        this.cliente = new Cliente();
        this.vendedor = new Vendedor();
        this.bebidaVendida = null;
        this.quantidade = 0;
        this.formaPagamento = "";
        this.desconto = 0.0;
    }

    // Sobrecarga
    public Venda(Cliente cliente, Vendedor vendedor, Bebida bebidaVendida, int quantidade) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.bebidaVendida = bebidaVendida;
        this.quantidade = quantidade;
        this.formaPagamento = "";
        this.desconto = 0.0;
    }

    // Sobrecarga
    public Venda(Cliente cliente, Vendedor vendedor, Bebida bebidaVendida, int quantidade, String formaPagamento) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.bebidaVendida = bebidaVendida;
        this.quantidade = quantidade;
        this.formaPagamento = formaPagamento;
        this.desconto = 0.0;
    }

    // Sobrecarga
    public Venda(Cliente cliente, Vendedor vendedor, Bebida bebidaVendida, int quantidade, String formaPagamento, double desconto) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.bebidaVendida = bebidaVendida;
        this.quantidade = quantidade;
        this.formaPagamento = formaPagamento;
        this.desconto = desconto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Bebida getBebidaVendida() {
        return bebidaVendida;
    }

    public void setBebidaVendida(Bebida bebidaVendida) {
        this.bebidaVendida = bebidaVendida;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        if (desconto < 0) {
            this.desconto = 0.0;
        } else {
            this.desconto = desconto;
        }
    }

    public double calcularTotalVenda() {
        return calcularTotalVenda(this.desconto);
    }

    // Sobrecarga
    public double calcularTotalVenda(double desconto) {
        if (this.bebidaVendida != null) {
            double totalSemDesconto = this.bebidaVendida.calcularPrecoFinal() * this.quantidade;
            double totalComDesconto = totalSemDesconto - desconto;

            if (totalComDesconto < 0) {
                return 0.0;
            }

            return totalComDesconto;
        }

        return 0.0;
    }
}