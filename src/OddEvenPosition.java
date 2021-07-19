import java.text.DecimalFormat;
import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        double OddSum = 0.00;
        double EvenSum = 0.00;
        double OddMin = 1000000000.0;
        double EvenMin = 1000000000.0;
        double OddMax = -1000000000.0;
        double EvenMax = -1000000000.0;

        for (int i = 1; i <= number; i++) {
            double digit = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0) {    //Even numbers
                EvenSum += digit;
                if (digit > EvenMax) {
                    EvenMax = digit;
                }
                if (digit < EvenMin) {
                    EvenMin = digit;
                }

            } else { //Odd numbers
                OddSum += digit;
                if (digit > OddMax) {
                    OddMax = digit;
                }
                if (digit < OddMin) {
                    OddMin = digit;
                }
            }

        }


        System.out.printf("OddSum=%.2f,%n", OddSum);

        if (OddMin == 1000000000.0) {
            System.out.println("OddMin=No,");
        } else {
            System.out.printf("OddMin=%.2f,%n", OddMin);
        }
        if (OddMax == -1000000000.0) {
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddMax=%.2f,%n", OddMax);
        }

        System.out.printf("EvenSum=%.2f,%n", EvenSum);

        if (EvenMin == 1000000000.0) {
            System.out.println("EvenMin=No,");
        } else {
            System.out.printf("EvenMin=%.2f,%n", EvenMin);
        }

        if (EvenMax == -1000000000.0) {
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenMax=%.2f%n", EvenMax);
        }


    }
}
