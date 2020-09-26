package POO_exercicios_intro_poo;

public class Lampada {
    boolean apagada;
    boolean acesa;
    boolean meiaLuz;

    public Lampada(boolean _apagada, boolean _acesa, boolean _meiaLuz){
        apagada = _apagada;
        acesa = _acesa;
        meiaLuz = _meiaLuz;
    }

    public boolean estaLigada(){
        if (acesa == true){
            return true;
        }
        else{
            return false;
        }
    }
}
