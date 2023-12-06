package servicos;

    import java.util.ArrayList;
import java.util.List;

// Classe Pedido
class Pedido {
    private int id;
    private String descricao;
    private Endereco enderecoEntrega;
    private Rastreamento rastreamento;

    public Pedido(int id, String descricao, Endereco enderecoEntrega) {
        this.id = id;
        this.descricao = descricao;
        this.enderecoEntrega = enderecoEntrega;
        this.rastreamento = new Rastreamento();
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Endereco getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public Rastreamento getRastreamento() {
        return rastreamento;
    }

    public void cancelarPedido() {
        // Lógica para cancelar o pedido
        System.out.println("Pedido " + id + " foi cancelado.");
    }
}

// Classe Rastreamento
class Rastreamento {
    private List<String> status;

    public Rastreamento() {
        this.status = new ArrayList<>();
        status.add("Pedido foi recebido");
    }

    public List<String> getStatus() {
        return status;
    }

    public void adicionarStatus(String novoStatus) {
        status.add(novoStatus);
    }
}

// Classe Endereco
class Endereco {
    private String rua;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco(String rua, String cidade, String estado, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }


// Exemplo de utilização

    public void pedido () {
        Endereco endereco = new Endereco("Rua Exemplo", "Cidade Exemplo", "Estado Exemplo", "12345-678");
        Pedido pedido1 = new Pedido(1, "Livro", endereco);

        // Adicionando status ao rastreamento
        pedido1.getRastreamento().adicionarStatus("Pedido em transporte");
        pedido1.getRastreamento().adicionarStatus("Pedido entregue");

        // Exibindo informações do pedido e rastreamento
        System.out.println("Pedido #" + pedido1.getId() + ": " + pedido1.getDescricao());
        System.out.println("Endereço de entrega: " + pedido1.getEnderecoEntrega().getRua() + ", " +
                pedido1.getEnderecoEntrega().getCidade() + ", " + pedido1.getEnderecoEntrega().getEstado() + ", " +
                pedido1.getEnderecoEntrega().getCep());

        System.out.println("Rastreamento do pedido:");
        for (String status : pedido1.getRastreamento().getStatus()) {
            System.out.println("- " + status);
        }

        
    }
}

