// Aluna: Maria Eduarda Feliciano Lunelli
// RA: 2768410

public class ComissaoInvalidaException extends Exception {
    public ComissaoInvalidaException() {
        super("Erro: O percentual de comissao deve estar entre 0 e 100%!");
    }
}