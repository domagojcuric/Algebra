import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //imao sam nekoliko pokusaja, al sam probao sa integerom samo, jel mi je malo sa doublom bili previse, ovo je sto sam napravio
        Scanner unos = new Scanner(System.in);
        System.out.println("iznos za vratiti : ");

        String kusur = unos.nextLine();

        int iznos = Integer.parseInt(kusur);

        int[] novcanice = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        //

        System.out.println("Potrebne novčanice:");

        for (int novcanica : novcanice) {
            int brojNovcanica = iznos / novcanica;
            if (brojNovcanica > 0) {
                System.out.println(novcanica + "$: " + brojNovcanica);
                iznos = iznos - (brojNovcanica * novcanica);
            }


        }
    }
}