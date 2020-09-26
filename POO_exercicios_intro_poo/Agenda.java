package POO_exercicios_intro_poo;

import java.util.LinkedList;

public class Agenda {
    LinkedList<Contato> listaContatos = new LinkedList<Contato>();

    public void addContato(String nome, int numero){
        Contato novoContato = new Contato(nome, numero);
        listaContatos.addLast(novoContato);
    }

    public void printContatos(){
        for (Contato contato: listaContatos){
            System.out.println("nome: " + contato.getNome());
            System.out.println("numero: " + contato.getNumero());
            System.out.println("--------------");
        }
    }
}
