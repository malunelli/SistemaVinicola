// Aluna: Maria Eduarda Feliciano Lunelli
// RA: 2768410

public class PrecoInvalidoException extends Exception {
    
    public PrecoInvalidoException() {
        super("Erro: O preço base da bebida não pode ser negativo!");
    }
}