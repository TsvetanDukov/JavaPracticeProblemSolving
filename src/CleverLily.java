import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double laundryPrice = Double.parseDouble(scanner.nextLine());
        int toysPrice = Integer.parseInt(scanner.nextLine());
        int toysCash = 0;
        int pureCash = 9;
        int finalCash = 0;
        double total;

        for (int i = 1; i <= age; i+=2) {
            toysCash += toysPrice;
        }
        for (int i = 2; i <= age; i+=2){
            finalCash += pureCash;
            pureCash += 10;
        }
        total = finalCash + toysCash;
        if (total >= laundryPrice) {
            double moneyLeft = total -laundryPrice;
            System.out.printf("Yes! %.2f", moneyLeft);
        } else if (total < laundryPrice) {
            double moneyNeeded = laundryPrice - total;
            System.out.printf("No! %.2f", moneyNeeded);
        }
    }
}