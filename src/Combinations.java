import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int count = 0;

        for (int i = 0; i <= userInput; i++) {
            for (int j = 0; j <= userInput; j++) {
                for (int k = 0; k <= userInput; k++) {
                    sum = i + k + j;
                    if (sum == userInput) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
