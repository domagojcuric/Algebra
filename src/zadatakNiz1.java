import java.util.Scanner;

public class zadatakNiz1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String noviString = input.nextLine();

        int nOLetters = 0;
        int nODigits = 0;
        int nOOthers = 0;

        for (int i = 0 ; i < noviString.length(); i++){
            char znak = noviString.charAt(i);

            if(Character.isAlphabetic(znak)){
                nOLetters ++;
            } else if (Character.isDigit(znak)) {
                nODigits ++;
            }else {
                nOOthers ++;
            }
        }

        System.out.println("slova " + nOLetters);
        System.out.println("brojevi " + nODigits);
        System.out.println(("ostalo " + nOOthers));



    }

}
