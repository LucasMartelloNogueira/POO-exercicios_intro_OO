package POO_exercicios_intro_poo;

public class TesteLampada {

    static void printarStatusLampada(Lampada l){
        if (l.estaLigada() == true){
            System.out.println("a lampada esta ligada");
        }
        else{
            System.out.println("a lampada esta desligada");
        }
    }
    public static void main(String[] args){
        //insatanciando uma lampada ligada e outra desligada
        // lampada1 = apagada
        // lampada2 = acesa
        Lampada lampada1 = new Lampada(true, false, false);
        Lampada lampada2 = new Lampada(false, true, true);

        printarStatusLampada(lampada1);
        printarStatusLampada(lampada2);

    }
}
