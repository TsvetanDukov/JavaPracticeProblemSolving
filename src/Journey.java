import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination;
        String vacation;
        double tripPrice;


        if (budget <= 100 && season.equals("summer")) {
            tripPrice = budget * 0.30;
            destination = "Bulgaria";
            vacation = "Camp";
            System.out.printf("Somewhere in %s", destination);
            System.out.printf("\n%s - %.2f", vacation, tripPrice);
        } else if (budget <=100 && season.equals("winter")) {
            tripPrice = budget * 0.70;
            destination = "Bulgaria";
            vacation = "Hotel";
            System.out.printf("Somewhere in %s", destination);
            System.out.printf("\n%s - %.2f", vacation, tripPrice);
        }
        if (budget > 100 && budget <= 1000 && season.equals("summer")) {
            tripPrice = budget * 0.40;
            destination = "Balkans";
            vacation = "Camp";
            System.out.printf("Somewhere in %s", destination);
            System.out.printf("\n%s - %.2f", vacation, tripPrice);
        } else if (budget > 100 && budget <= 1000 && season.equals("winter")) {
            tripPrice = budget * 0.80;
            destination = "Balkans";
            vacation = "Hotel";
            System.out.printf("Somewhere in %s", destination);
            System.out.printf("\n%s - %.2f", vacation, tripPrice);
        }
        if (budget > 1000) {
            tripPrice = budget * 0.90;
            destination = "Europe";
            vacation = "Hotel";
            System.out.printf("Somewhere in %s", destination);
            System.out.printf("\n%s - %.2f", vacation, tripPrice);
        }
    }
}

