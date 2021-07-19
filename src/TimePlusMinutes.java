import java.util.Scanner;

public class TimePlusMinutes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int hours = in.nextInt();
        int minutes = in.nextInt();

        minutes=minutes+15;
        if (minutes > 59) {
            hours++;
        }

        minutes = minutes % 60;
        hours = hours % 24;

        System.out.printf("%d:%02d", hours, minutes);
    }
}