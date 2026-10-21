// Versão do NetBeans: 24
// Aluna: Maria Eduarda Feliciano Lunelli - RA: 2768410

import java.util.ArrayList;
import java.util.List;

public class BDBebida {

    private final List<Bebida> bebidas;
    private static BDBebida instancia;

    private BDBebida() {
        bebidas = new ArrayList<>();
    }

    // MÉTODO SINGLETON
    public static BDBebida getInstancia() {
        if (instancia == null) {
            instancia = new BDBebida();
        }
        return instancia;
    }

    public void adicionarBebida(Bebida b) {
        bebidas.add(b);
    }

    public List<Bebida> getBebidas() {
        return bebidas;
    }

    public Bebida consultarBebidaPorNome(String nome) {
        for (Bebida b : bebidas) {
            if (b.getNome().equalsIgnoreCase(nome)) {
                return b;
            }
        }
        return null;
    }

    public boolean alterarBebida(String nome, Bebida bebidaAtualizada) {
        for (int i = 0; i < bebidas.size(); i++) {
            if (bebidas.get(i).getNome().equalsIgnoreCase(nome)) {
                bebidas.set(i, bebidaAtualizada);
                return true;
            }
        }
        return false;
    }

    public boolean excluirBebida(String nome) {
        Bebida b = consultarBebidaPorNome(nome);

        if (b != null) {
            bebidas.remove(b);
            return true;
        }

        return false;
    }
}