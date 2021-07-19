import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double n1 = Integer.parseInt(scanner.nextLine());
        double n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double result;

        switch (operator) {
            case "+":
                result = n1 + n2;
                if (result % 2 == 0) {
                    System.out.printf("%.0f %s %.0f = %.0f - even", n1, operator, n2, result);
                } else if (result % 2 == 1) {
                    System.out.printf("%.0f %s %.0f = %.0f - odd", n1, operator, n2, result);
                }
                break;
            case "-":
                result = n1 - n2;
                if (result % 2 == 0) {
                    System.out.printf("%.0f %s %.0f = %.0f - even", n1, operator, n2, result);
                } else if (result % 2 == 1) {
                    System.out.printf("%.0f %s %.0f = %.0f - odd", n1, operator, n2, result);
                }
                break;
            case "*":
                result = n1 * n2;
                if (result % 2 == 0) {
                    System.out.printf("%.0f %s %.0f = %.0f - even", n1, operator, n2, result);
                } else if (result % 2 == 1) {
                    System.out.printf("%.0f %s %.0f = %.0f - odd", n1, operator, n2, result);
                }
                break;
            case "/":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %.0f by zero", n1);
                } else if (n2 != 0) {
                    result = n1 / n2;
                    System.out.printf("%.0f %s %.0f = %.2f", n1, operator, n2, result);
                }
                break;
            case "%":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %.0f by zero", n1);
                } else if (n2 != 0) {
                    result = n1 % n2;
                    System.out.printf("%.0f %s %.0f = %.0f", n1, operator, n2, result);
                }
        }
    }
}

