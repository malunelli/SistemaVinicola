// Versão do NetBeans: 24
// Aluna: Maria Eduarda Feliciano Lunelli - RA: 2768410

import java.util.ArrayList;
import java.util.List;

public class BDVendedor {

    private final List<Vendedor> vendedores;
    private static BDVendedor instancia;

    private BDVendedor() {
        vendedores = new ArrayList<>();
    }

    // MÉTODO SINGLETON
    public static BDVendedor getInstancia() {
        if (instancia == null) {
            instancia = new BDVendedor();
        }
        return instancia;
    }

    public void adicionarVendedor(Vendedor v) { 
        vendedores.add(v); 
    }

    public List<Vendedor> getVendedores() { 
        return vendedores; 
    }
    
    public Vendedor consultarVendedorPorCpf(String cpf) {
        for (Vendedor v : vendedores) {
            if (v.getCpf().equalsIgnoreCase(cpf)) {
                return v;
            }
        }
        return null;
    }

    public boolean alterarVendedor(String cpf, Vendedor vendedorAtualizado) {
        for (int i = 0; i < vendedores.size(); i++) {
            if (vendedores.get(i).getCpf().equalsIgnoreCase(cpf)) {
                vendedores.set(i, vendedorAtualizado);
                return true;
            }
        }
        return false;
    }

    public boolean excluirVendedor(String cpf) {
        Vendedor v = consultarVendedorPorCpf(cpf);

        if (v != null) {
            vendedores.remove(v);
            return true;
        }

        return false;
    }
}