import java.util.Date;
import java.util.Scanner;
//test
public class TimerForLoop {
    private static void startTimer(int chosenSek) throws InterruptedException {
        Date now = new Date();
        Date now2 = null; /*hier musste die now2 Date Var mit null initialisiert werden. In der DoWhileLoop, war das nicht notwendig.*/
        for (int x=0; x < chosenSek;x++) {
            Thread.sleep(1000);
            now2 = new Date();
            System.out.println(now2);
        }

        System.out.println("Die Anfangszeit: " + now);
        System.out.println("Der Timer betrug: " + chosenSek);
        System.out.println("Der Endzeit: " + now2);
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Bitte geben Sie ihren Timer in Sekunden ein: ");
        Scanner in = new Scanner(System.in);
        int ChosenSek = in.nextInt();
        startTimer(ChosenSek);
    }
}
