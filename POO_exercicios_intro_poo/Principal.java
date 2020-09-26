package POO_exercicios_intro_poo;

public class Principal {

    static void questao2(){
        Pessoa pessoa1 = new Pessoa("Lucas", 22);
        pessoa1.aniversario();
        pessoa1.aniversario();
        pessoa1.printNomeIdade();
    }
    
    static void questao3(){
        ContaBancaria conta = new ContaBancaria("Lucas", 1, 2, 0, 21092020);
        
        int valorRetirado = conta.saque(10);
        System.out.println("valor retirado: " + valorRetirado);
        System.out.println("saldo: " + conta.saldo);

        int valordeposito = 20;
        conta.deposito(valordeposito);
        System.out.println("valor depositado: " + valordeposito);
        System.out.println("saldo: " + conta.saldo);

        double juros = 0.002;
        conta.rendimentoMensal(juros);

    }

    static void questao4(){
        Porta porta = new Porta(2, 1, "azul", true);
        porta.abrirOuFechar();
        porta.abrirOuFechar();
        porta.mudarCor("verde");
        porta.mudarCor("vermelho");
        System.out.println("a porta esta aberta? r: " + porta.estaAberta());

    }

    static void questao5(){
        Casa casa = new Casa();
        casa.porta2.aberta = false;
        casa.quantasPortasEstaoAbertas();
    }

    static void questao7(){
        // istanciando um mercado
        Mercado mercado = new Mercado();

        // istanciando um pedido e adicionando a lista de produtos do mercado
        Produto produto1 = new Produto("bananas", 10);
        mercado.addProdutoLista(produto1);

        // criando um pedido de cliente
        PedidoCliente pedido1 = new PedidoCliente("bananas", 6, "debito");

        // atualizando a lista de produtos do mercado
        mercado.realizarCompra(pedido1);

    }
    public static void main(String[] args){
        //questao2();
        //questao3();
        //questao4();
        //questao5();
        // questao 6 esta implementada no arquivo "TesteLampada.java"
        //questao7();
    }
}