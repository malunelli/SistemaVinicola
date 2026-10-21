// Aluna: Maria Eduarda Feliciano Lunelli
// RA: 2768410

public class Cliente extends Pessoa {
    private String enderecoEntrega;
    private double limiteCredito;

    public Cliente() { 
        super(); 
        this.enderecoEntrega = "";
        this.limiteCredito = 0.0;
    }

    // Sobrecarga
    public Cliente(String nome, String cpf, String telefone, String email, String dataNascimento, String enderecoEntrega, double limiteCredito) throws CpfInvalidoException, LimiteInvalidoException {
        super(nome, cpf, telefone, email, dataNascimento);
        this.enderecoEntrega = enderecoEntrega;
        this.setLimiteCredito(limiteCredito);
    }

    public String getEnderecoEntrega() { return enderecoEntrega; }
    public void setEnderecoEntrega(String enderecoEntrega) { this.enderecoEntrega = enderecoEntrega; }

    public double getLimiteCredito() { return limiteCredito; }
    
    public void setLimiteCredito(double limiteCredito) throws LimiteInvalidoException {
        if (limiteCredito < 0) {
            throw new LimiteInvalidoException();
        }
        this.limiteCredito = limiteCredito; 
    }

    //Sobrescrita
    public String gerarResumo() {
        return "Cliente | Limite Disp: R$ " + String.format("%.2f", this.limiteCredito);
    }
}