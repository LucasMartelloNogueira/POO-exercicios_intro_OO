package POO_exercicios_intro_poo;

public class ContaBancaria {
    String nomeTitular;
    int numeroConta;
    int agencia;
    int saldo;
    int dataAbertura;

    public ContaBancaria(String _nomeTitular, int _numeroConta, int _agencia, int _saldo, int _dataAbertura){
        nomeTitular = _nomeTitular;
        numeroConta = _numeroConta;
        agencia = _agencia;
        saldo = _saldo;
        dataAbertura = _dataAbertura;
    }

    public int saque(int valor){
        saldo -= valor;
        return valor;
    }

    public void deposito(int valor){
        saldo += valor;
    }

    public void rendimentoMensal(double jurosRendimento){
        double rendimento = saldo * jurosRendimento;
        System.out.println("rendimento mensal: " + rendimento);
    }
}
