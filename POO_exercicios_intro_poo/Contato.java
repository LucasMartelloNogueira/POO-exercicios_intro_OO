package POO_exercicios_intro_poo;

public class Contato {
    private String nome;
    private int numero;

    // construtor
    public Contato(String _nome, int _numero){
        nome = _nome;
        numero = _numero;
    }

    // getter nome
    public String getNome(){
        return nome;
    }

    // setter nome
    public void setNome(String novoNome){
        nome = novoNome;
    }

    // getter numero
    public int getNumero(){
        return numero;
    }

    // setter numero
    public void setNumero(int novoNumero){
        numero = novoNumero;
    }

}
