import java.util.Scanner;

public class zadatakNiz2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String novaRecenica = input.nextLine();

        String[] poljeRijeci = novaRecenica.split("\\s");

        StringBuilder obrnuto = new StringBuilder();



        for(int i = poljeRijeci.length - 1; i >= 0; i-- ){

            obrnuto.append(poljeRijeci[i] + " ");


        }

        System.out.println(obrnuto);

    }


}
