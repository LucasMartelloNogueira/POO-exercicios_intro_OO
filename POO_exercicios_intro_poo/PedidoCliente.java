package POO_exercicios_intro_poo;

public class PedidoCliente {
    String nomeProdutoPedido;
    int qntPodutoPedido;
    String formaPagamento;

    public PedidoCliente(String _nomeProdutoPedido, int _qntPodutoPedido, String _formaPagamento){
        nomeProdutoPedido = _nomeProdutoPedido;
        qntPodutoPedido = _qntPodutoPedido;
        formaPagamento = _formaPagamento;
    }
}
