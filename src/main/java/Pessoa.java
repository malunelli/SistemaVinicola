// Aluna: Maria Eduarda Feliciano Lunelli
// RA: 2768410

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String dataNascimento;
	
    public Pessoa() {
        this.nome = "";
        this.cpf = "";
        this.telefone = "";
        this.email = "";
        this.dataNascimento = "";
    }

    // Sobrecarga 
    public Pessoa(String nome, String cpf, String telefone, String email, String dataNascimento) throws CpfInvalidoException {
        this.nome = nome;
        this.setCpf(cpf);
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    
    public void setCpf(String cpf) throws CpfInvalidoException {
        try {
            long cpfNumerico = Long.parseLong(cpf);
            if (cpfNumerico <= 1) {
                throw new CpfInvalidoException();
            }
        } catch (NumberFormatException e) {
            throw new CpfInvalidoException();
        }
        this.cpf = cpf;
    }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(String dataNascimento) { this.dataNascimento = dataNascimento; }

    public abstract String gerarResumo(); 
}