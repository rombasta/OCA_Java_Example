import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
//test
public class TimerIfCheck {
    private static void TimeCheck(String time) {

        Calendar now = Calendar.getInstance();

        if (time.equals("Jahr")) {
            System.out.println("Das Jahr ist: " + now.get(Calendar.YEAR));
            }
        if (time.equals("Monat")) {
            System.out.println("Der Monat ist: " + new SimpleDateFormat("MMMM").format(now.getTime()));
        }
        else
            System.out.println("Derzeit kann ich nur Jahr und Monat ausgeben.");
    }

    public static void main(String[] args) {
        System.out.println("Welche Zeiteinheit möchtest du von der aktuellen zeit wissen? (z.B. Jahr, Monat, Stunde, etc): ");
        Scanner in = new Scanner(System.in);
        String time = in.next();
        TimeCheck(time);
    }
}