// Aluna: Maria Eduarda Feliciano Lunelli
// RA: 2768410

public class SalarioInvalidoException extends Exception {
    public SalarioInvalidoException() {
        super("Erro: O salario base do vendedor nao pode ser negativo!");
    }
}