public class condicionaisEncadeadas {
    public static void main(String[] args){
        int nota = 9;

        if( nota >= 7 )
            System.out.println("Voce foi aprovado");

        else if(nota >= 5 && nota <= 7)
            System.out.println(" Voce esta em recuperacao");

        else
            System.out.println("Voce foi reprovado!");

    }
}
