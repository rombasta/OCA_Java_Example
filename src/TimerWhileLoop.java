import java.util.Date;
import java.util.Scanner;
//test
public class TimerWhileLoop {
    private static void startTimer(int chosenSek) throws InterruptedException {
        Date now = new Date();
        int x = 0;
        Date now2 = null; /*hier musste die now2 Date Var mit null initialisiert werden. In der DoWhileLoop, war das nicht notwendig.*/
        while (x < chosenSek) {
            Thread.sleep(1000);
            x++;
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
