import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;

        if (city.equals("Sofia") && product.equals("coffee")) {
            price = quantity * 0.50;
            System.out.println(price);
        } else if (city.equals("Sofia") && product.equals("water")) {
            price = quantity * 0.80;
            System.out.println(price);
        } else if (city.equals("Sofia") && product.equals("beer")) {
            price = quantity * 1.20;
            System.out.println(price);
        } else if (city.equals("Sofia") && product.equals("sweets")) {
            price = quantity * 1.45;
            System.out.println(price);
        } else if (city.equals("Sofia") && product.equals("peanuts")) {
            price = quantity * 1.60;
            System.out.println(price);
        }

        if (city.equals("Plovdiv") && product.equals("coffee")) {
            price = quantity * 0.40;
            System.out.println(price);
        } else if (city.equals("Plovdiv") && product.equals("water")) {
            price = quantity * 0.70;
            System.out.println(price);
        } else if (city.equals("Plovdiv") && product.equals("beer")) {
            price = quantity * 1.15;
            System.out.println(price);
        } else if (city.equals("Plovdiv") && product.equals("sweets")) {
            price = quantity * 1.30;
            System.out.println(price);
        } else if (city.equals("Plovdiv") && product.equals("peanuts")) {
            price = quantity * 1.50;
            System.out.println(price);
        }

        if (city.equals("Varna") && product.equals("coffee")) {
            price = quantity * 0.45;
            System.out.println(price);
        } else if (city.equals("Varna") && product.equals("water")) {
            price = quantity * 0.70;
            System.out.println(price);
        } else if (city.equals("Varna") && product.equals("beer")) {
            price = quantity * 1.10;
            System.out.println(price);
        } else if (city.equals("Varna") && product.equals("sweets")) {
            price = quantity * 1.35;
            System.out.println(price);
        } else if (city.equals("Varna") && product.equals("peanuts")) {
            price = quantity * 1.55;
            System.out.println(price);
        }
    }
}
