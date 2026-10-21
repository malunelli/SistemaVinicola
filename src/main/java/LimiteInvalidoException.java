// Aluna: Maria Eduarda Feliciano Lunelli
// RA: 2768410

public class LimiteInvalidoException extends Exception {
    
    public LimiteInvalidoException() {
        super("Erro: O limite de credito do cliente nao pode ser negativo!");
    }
}