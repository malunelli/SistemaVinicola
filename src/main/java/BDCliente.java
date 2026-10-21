// Versão do NetBeans: 24
// Aluna: Maria Eduarda Feliciano Lunelli - RA: 2768410

import java.util.ArrayList;
import java.util.List;

public class BDCliente {

    private final List<Cliente> clientes;
    private static BDCliente instancia;

    private BDCliente() {
        clientes = new ArrayList<>();
    }

    // MÉTODO SINGLETON
    public static BDCliente getInstancia() {
        if (instancia == null) {
            instancia = new BDCliente();
        }
        return instancia;
    }

    public void adicionarCliente(Cliente c) {
        clientes.add(c);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
    
    public Cliente consultarClientePorCpf(String cpf) {
        for (Cliente c : clientes) {
            if (c.getCpf().equalsIgnoreCase(cpf)) {
                return c;
            }
        }
        return null;
    }

    public boolean alterarCliente(String cpf, Cliente clienteAtualizado) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCpf().equalsIgnoreCase(cpf)) {
                clientes.set(i, clienteAtualizado);
                return true;
            }
        }
        return false;
    }

    public boolean excluirCliente(String cpf) {
        Cliente c = consultarClientePorCpf(cpf);

        if (c != null) {
            clientes.remove(c);
            return true;
        }

        return false;
    }
}