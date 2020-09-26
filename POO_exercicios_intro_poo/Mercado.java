package POO_exercicios_intro_poo;

import java.util.LinkedList;

public class Mercado {
    LinkedList<Produto> listaProdutos = new LinkedList<Produto>();

    public void addProdutoLista(Produto p){
        listaProdutos.addLast(p);
    }

    public void realizarCompra(PedidoCliente pedido){
        for (Produto produto: listaProdutos){
            if (produto.nome == pedido.nomeProdutoPedido){
                if (produto.qntEstoque - pedido.qntPodutoPedido < 0){
                    System.out.println("o mercaddo n tem capacidade de realizar esse pedido");
                }
                else{
                    System.out.println("Compra realizda com sucesso!");
                    System.out.println("nome produto pedido: " + pedido.nomeProdutoPedido);
                    System.out.println("qnt produto pedido: " + pedido.qntPodutoPedido);
                    System.out.println("forma de pagamento: " + pedido.formaPagamento);

                    produto.qntEstoque -= pedido.qntPodutoPedido;

                    System.out.printf("qnt do estoque de %s: %d\n", produto.nome, produto.qntEstoque);


                }
            }
        }
    }


}
