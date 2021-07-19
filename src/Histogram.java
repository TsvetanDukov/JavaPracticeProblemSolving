import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int number;
        String percent = "%";
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;

        for (int i = 1; i <= n; i++) {
            number = Integer.parseInt(scanner.nextLine());
            if (number < 200) {
                p1 += 1;
            }
            if (number >= 200 && number <= 399) {
                p2 += 1;
            }
            if (number >= 400 && number <= 599) {
                p3 += 1;
            }
            if (number >= 600 && number <= 799) {
                p4 += 1;
            }
            if (number >= 800) {
                p5 += 1;
            }
        }
        double f1 = p1 / n * 100;
        double f2 = p2 / n * 100;
        double f3 = p3 / n * 100;
        double f4 = p4 / n * 100;
        double f5 = p5 / n * 100;

        System.out.printf("%.2f%s%n", f1, percent);
        System.out.printf("%.2f%s%n", f2, percent);
        System.out.printf("%.2f%s%n", f3, percent);
        System.out.printf("%.2f%s%n", f4, percent);
        System.out.printf("%.2f%s%n", f5, percent);
    }
}
