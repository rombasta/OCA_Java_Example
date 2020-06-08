import java.util.Date;
import java.util.Scanner;
//test
public class TimerDoWhileLoop {
    private static void startTimer(int chosenSek) throws InterruptedException {
        Date now = new Date();
        int x = 0;
        Date now2;
        do {
            Thread.sleep(1000);
            x++;
            now2 = new Date();
            System.out.println(now2);
        }
        while (x < chosenSek);
        System.out.println("Die Anfangszeit: " + now);
        System.out.println("Der Timer betrug: " + chosenSek);
        System.out.println("Der Endzeit: " + now2);
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Bitte geben Sie ihren Timer in Sekunden ein:");
        Scanner in = new Scanner(System.in);
        int ChosenSek = in.nextInt();
        //int ChosenSek = 20;
        startTimer(ChosenSek);
    }
}
