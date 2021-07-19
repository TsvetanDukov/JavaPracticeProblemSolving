import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int column = Integer.parseInt(scanner.nextLine());

        double premiere = 12.00;
        double normal = 7.50;
        double discount = 5.00;
        double income = 0;

        if (projection.equals("Premiere")) {
            income = rows * column * premiere;
            System.out.printf("%.2f leva", income);
        }else if (projection.equals("Normal")) {
            income = rows * column * normal;
            System.out.printf("%.2f leva", income);
        } else if (projection.equals("Discount")) {
            income = rows * column * discount;
            System.out.printf("%.2f leva", income);
        }
    }
}
