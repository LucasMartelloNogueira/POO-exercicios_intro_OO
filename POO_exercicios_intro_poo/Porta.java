package POO_exercicios_intro_poo;

public class Porta {
    int altura;
    int largura;
    String cor;
    boolean aberta;

    public Porta(int _altura, int _largura, String _cor, boolean _aberta){
        altura = _altura;
        largura = _largura;
        cor = _cor;
        aberta = _aberta;
    }

    public void redimensionar(int novaAltura, int novaLargura){
        System.out.printf("dimensoes antigas: %d x %d\n", altura, largura);
        altura = novaAltura;
        largura = novaLargura;
        System.out.printf("dimensoes novas: %d x %d\n", altura, largura);
    }

    public void abrirOuFechar(){
        if (aberta == true){
            aberta = false;
        }
        else{
            aberta = true;
        }
    }

    public void mudarCor(String novaCor){
        System.out.println("cor antiga da porta " + cor);
        cor = novaCor;
        System.out.println("cor nova da porta: " + cor);
    }

    public boolean estaAberta(){
        if (aberta == true){
            return true;
        }
        else{
            return false;
        }
    }

}

