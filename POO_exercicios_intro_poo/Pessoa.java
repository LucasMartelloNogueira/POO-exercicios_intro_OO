package POO_exercicios_intro_poo;

public class Pessoa {
    public String nome;
    public int idade;

    public Pessoa(String _nome, int _idade){
        nome = _nome;
        idade = _idade;
    }

    public void aniversario(){
        idade++;
    }

    public void printNomeIdade(){
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
    }
}
