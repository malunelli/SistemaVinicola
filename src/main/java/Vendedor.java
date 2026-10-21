// Aluna: Maria Eduarda Feliciano Lunelli
// RA: 2768410

public class Vendedor extends Pessoa {
    private String matricula;
    private double salarioBase;
    private double percentualComissao;

    public Vendedor() { 
        super(); 
        this.matricula = "";
        this.salarioBase = 0.0;
        this.percentualComissao = 0.0;
    }

    // Sobrecarga 
    public Vendedor(String nome, String cpf, String telefone, String email, String dataNascimento, String matricula, double salarioBase, double percentualComissao) throws CpfInvalidoException, SalarioInvalidoException, ComissaoInvalidaException {
        super(nome, cpf, telefone, email, dataNascimento);
        this.matricula = matricula;
        this.setSalarioBase(salarioBase);
        this.setPercentualComissao(percentualComissao);
    }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public double getSalarioBase() { return salarioBase; }
    
    public void setSalarioBase(double salarioBase) throws SalarioInvalidoException {
        if (salarioBase < 0) {
            throw new SalarioInvalidoException();
        }
        this.salarioBase = salarioBase; 
    }

    public double getPercentualComissao() { return percentualComissao; }
    
    public void setPercentualComissao(double percentualComissao) throws ComissaoInvalidaException {
        if (percentualComissao < 0 || percentualComissao > 100) {
            throw new ComissaoInvalidaException();
        }
        this.percentualComissao = percentualComissao; 
    }

    //Sobrescrita
    public String gerarResumo() {
        return "Vendedor [Matricula: " + this.matricula + "] | Comissao: " + String.format("%.1f", this.percentualComissao) + "%";
    }
}