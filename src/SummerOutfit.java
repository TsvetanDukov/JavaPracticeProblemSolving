import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int degree = Integer.parseInt(scanner.nextLine());
        String partOfTheDay = scanner.nextLine();

        switch (partOfTheDay) {
            case "Morning":
                if (degree >= 10 && degree <= 18) {
                    String outfit = "Sweatshirt";
                    String shoes = "Sneakers";
                    System.out.printf("It's %d degrees, get your %s and %s.", degree, outfit, shoes);
                } else if (degree > 18 && degree <= 24) {
                    String outfit = "Shirt";
                    String shoes = "Moccasins";
                    System.out.printf("It's %d degrees, get your %s and %s.", degree, outfit, shoes);
                } else if (degree >= 25) {
                    String outfit = "T-Shirt";
                    String shoes = "Sandals";
                    System.out.printf("It's %d degrees, get your %s and %s.", degree, outfit, shoes);
                }
                break;
            case "Afternoon":
                if (degree >= 10 && degree <= 18) {
                    String outfit = "Shirt";
                    String shoes = "Moccasins";
                    System.out.printf("It's %d degrees, get your %s and %s.", degree, outfit, shoes);
                } else if (degree > 18 && degree <= 24) {
                    String outfit = "T-Shirt";
                    String shoes = "Sandals";
                    System.out.printf("It's %d degrees, get your %s and %s.", degree, outfit, shoes);
                } else if (degree >= 25) {
                    String outfit = "Swim Suit";
                    String shoes = "Barefoot";
                    System.out.printf("It's %d degrees, get your %s and %s.", degree, outfit, shoes);
                }
                break;
            case "Evening":
                if (degree >= 10 && degree <= 18) {
                    String outfit = "Shirt";
                    String shoes = "Moccasins";
                    System.out.printf("It's %d degrees, get your %s and %s.", degree, outfit, shoes);
                } else if (degree > 18 && degree <= 24) {
                    String outfit = "Shirt";
                    String shoes = "Moccasins";
                    System.out.printf("It's %d degrees, get your %s and %s.", degree, outfit, shoes);
                } else if (degree >= 25) {
                    String outfit = "Shirt";
                    String shoes = "Moccasins";
                    System.out.printf("It's %d degrees, get your %s and %s.", degree, outfit, shoes);
                }
                break;
        }
    }
}
