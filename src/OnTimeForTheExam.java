import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int examHrs = Integer.parseInt(console.nextLine());
        int examMin = Integer.parseInt(console.nextLine());
        int arriveHrs = Integer.parseInt(console.nextLine());
        int arriveMin = Integer.parseInt(console.nextLine());

        int diffTotalMin = (arriveHrs * 60 + arriveMin) - (examHrs * 60 + examMin);
        int diffHrs = Math.abs(diffTotalMin / 60);
        int diffMin = Math.abs(diffTotalMin % 60);

        if (diffTotalMin > 0) {
            System.out.println("Late");
        } else if (diffTotalMin >= -30) {
            System.out.println("On time");
        } else {
            System.out.println("Early");
        }

        if (diffTotalMin >= 60) {
            System.out.printf("%d:%02d hours after the start", diffHrs, diffMin);
        } else if (diffTotalMin > 0) {
            System.out.printf("%d minutes after the start", diffMin);
        }

        if (diffTotalMin <= -60) {
            System.out.printf("%d:%02d hours before the start", diffHrs, diffMin);
        } else if (diffTotalMin < 0) {
            System.out.printf("%d minutes before the start", diffMin);
        }
    }
}