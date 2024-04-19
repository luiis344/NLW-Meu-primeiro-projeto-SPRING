package Ex4DevOps;

import java.util.ArrayList;

public class CadastroCliente extends Cliente {
    ArrayList<Cliente> clientes;

    public CadastroCliente(String nome, String email, int telefone) {
        super(nome, email,telefone);
        this.clientes = new ArrayList<>();
    }

    void visualizarClientes() {
        for (int i = 0; i < this.clientes.size(); i++) {
            Cliente cliente = this.clientes.get(i);
            System.out
                    .println("Nome: " + cliente.nome + ", Email: " + cliente.email + ", Telefone: " + cliente.telefone);
        }
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void removerClientes(int index) {
        this.clientes.remove(index);
    }

    public void atualizarCliente(int index, Cliente clienteAtualizado) {
        this.clientes.set(index, clienteAtualizado);
    }
}