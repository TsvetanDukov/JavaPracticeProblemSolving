import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double num = 1;
        double result;

        for (double i = 0; i <= n; i +=2) {
            num *= 2;
            result = Math.pow(2, i);
            System.out.printf("%.0f\n", result);
        }
    }
}
