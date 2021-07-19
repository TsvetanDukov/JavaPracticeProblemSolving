import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int number;
        String percent = "%";
        double d2 = 0;
        double d3 = 0;
        double d4 = 0;

        for (int i = 1; i <= n; i++) {
            number = Integer.parseInt(scanner.nextLine());
            if (number % 2 == 0) {
                d2 += 1;
            }
            if (number % 3 == 0) {
                d3 += 1;
            }
            if (number % 4 == 0) {
                d4 += 1;
            }
        }
        double f2 = d2 / n * 100;
        double f3 = d3 / n * 100;
        double f4 = d4 / n * 100;
        System.out.printf("%.2f%s%n", f2, percent);
        System.out.printf("%.2f%s%n", f3, percent);
        System.out.printf("%.2f%s%n", f4, percent);
    }
}
