import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeForOneMeter = Double.parseDouble(scanner.nextLine());

        double timeForDistance = distance * timeForOneMeter;
        double additionalTime = Math.floor((distance / 15)) * 12.5;
        double swimmerResult = timeForDistance + additionalTime;

        if (swimmerResult < worldRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", swimmerResult);
        } else if (swimmerResult >= worldRecord) {
            double overTime = swimmerResult - worldRecord;
            System.out.printf("No, he failed! He was %.2f seconds slower.", overTime);
        }
    }
}