package POO_exercicios_intro_poo;

public class Casa {
    Porta porta1 = new Porta(2, 1, "azul", true);
    Porta porta2 = new Porta(2, 1, "verde", true);
    Porta porta3 = new Porta(2, 1, "vermelho", true);

    public void quantasPortasEstaoAbertas(){
        int contador = 0;
        if (porta1.estaAberta() == true){ contador += 1;}
        if (porta2.estaAberta() == true){ contador += 1;}
        if (porta3.estaAberta() == true){ contador += 1;}
    
        System.out.println("a casa tem " + contador + " portas abertas");
    }
}
