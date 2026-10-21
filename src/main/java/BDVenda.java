// Versão do NetBeans: 24
// Aluna: Maria Eduarda Feliciano Lunelli - RA: 2768410

import java.util.ArrayList;
import java.util.List;

public class BDVenda {

    private final List<Venda> vendas;
    private static BDVenda instancia;

    private BDVenda() {
        vendas = new ArrayList<>();
    }

    // MÉTODO SINGLETON
    public static BDVenda getInstancia() {
        if (instancia == null) {
            instancia = new BDVenda();
        }
        return instancia;
    }

    public void adicionarVenda(Venda v) {
        vendas.add(v);
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public Venda consultarVendaPorIndice(int indice) {
        if (indice >= 0 && indice < vendas.size()) {
            return vendas.get(indice);
        }
        return null;
    }

    public boolean alterarVenda(int indice, Venda vendaAtualizada) {
        if (indice >= 0 && indice < vendas.size()) {
            vendas.set(indice, vendaAtualizada);
            return true;
        }
        return false;
    }

    public boolean excluirVenda(int indice) {
        if (indice >= 0 && indice < vendas.size()) {
            vendas.remove(indice);
            return true;
        }
        return false;
    }
}