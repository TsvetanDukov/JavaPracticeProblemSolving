import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        String inputMetric = scanner.nextLine();
        String outputMetric = scanner.nextLine();

        if (inputMetric.equals("m") && outputMetric.equals("cm")) {
            double result = number * 100;
            System.out.printf("%.3f", result);
        } else if (inputMetric.equals("m") && outputMetric.equals("mm")) {
            double result = number * 1000;
            System.out.printf("%.3f", result);
        }
        if (inputMetric.equals("cm") && outputMetric.equals("m")) {
            double result = number / 100;
            System.out.printf("%.3f", result);
        } else if (inputMetric.equals("cm") && outputMetric.equals("mm")) {
            double result = number * 10;
            System.out.printf("%.3f", result);
        }
        if (inputMetric.equals("mm") && outputMetric.equals("m")) {
            double result = number / 1000;
            System.out.printf("%.3f", result);
        } else if (inputMetric.equals("mm") && outputMetric.equals("cm")) {
            double result = number / 10;
            System.out.printf("%.3f", result);
        }
    }
}
