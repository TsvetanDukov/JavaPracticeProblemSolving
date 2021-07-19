import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicN = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int sum;
        boolean flag = false;


        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                count++;
                sum = i + j;
                if (sum == magicN) {
                    System.out.printf("Combination N:%d%n(%d + %d = %d)", count, i, j, magicN);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.printf("%d combination - neither equals %d", count, magicN);
                break;
            }
        }
    }
}
