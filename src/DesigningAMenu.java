import java.util.Scanner;
/**
 * Problem: Designing a Menu
 * Ask user for input. Enter two numbers and choose an operation.
 * Possible operation - add, multiply, divide, subtract. Publish result.
 * */
public class DesigningAMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        System.out.println("Enter first number: ");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter second number: ");
        int secondNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("1 - Add\n2 - Subtract\n3 - Divide\n4 - Multiply");
        System.out.print("Choose an operation: ");
        int operation = Integer.parseInt(scanner.next());

        if (operation == 1) {
            result = firstNumber + secondNumber;
        } else if (operation == 2) {
            result = firstNumber - secondNumber;
        } else if (operation == 3) {
            result = firstNumber / secondNumber;
        } else if (operation == 4) {
            result = firstNumber * secondNumber;
        }
        System.out.printf("Result is - %d", result);
    }
}
