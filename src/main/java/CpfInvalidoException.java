// Aluna: Maria Eduarda Feliciano Lunelli
// RA: 2768410

public class CpfInvalidoException extends Exception {
    
    public CpfInvalidoException() {
        super("Erro: O CPF e invalido! Deve conter apenas numeros e ser maior que 1.");
    }
}