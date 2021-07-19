import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String placement = scanner.nextLine();
        String rating = scanner.nextLine();

        double room = 18.00;
        double apartment = 25.00;
        double presidentApartment = 35.00;
        double tripPrice;
        double finalPrice;
        double discountPrice;

        switch (placement) {
            case "room for one person":
                if (rating.equals("positive")) {
                    tripPrice = (days - 1) * room;
                    finalPrice = tripPrice + (tripPrice * 0.25);
                    System.out.printf("%.2f", finalPrice);
                } else if (rating.equals("negative")) {
                    tripPrice = (days - 1) * room;
                    finalPrice = tripPrice - (tripPrice * 0.1);
                    System.out.printf("%.2f", finalPrice);
                }
                break;
            case "apartment":
                if (rating.equals("positive") && days < 10) {
                    tripPrice = (days - 1) * apartment;
                    discountPrice = tripPrice - (tripPrice * 0.3);
                    finalPrice = discountPrice + (discountPrice * 0.25);
                    System.out.printf("%.2f", finalPrice);
                } else if (rating.equals("negative") && days < 10) {
                    tripPrice = (days - 1) * apartment;
                    discountPrice = tripPrice - (tripPrice * 0.3);
                    finalPrice = discountPrice - (discountPrice * 0.1);
                    System.out.printf("%.2f", finalPrice);
                }
                if (rating.equals("positive") && days >= 10 && days <= 15) {
                    tripPrice = (days - 1) * apartment;
                    discountPrice = tripPrice - (tripPrice * 0.35);
                    finalPrice = discountPrice + (discountPrice * 0.25);
                    System.out.printf("%.2f", finalPrice);
                } else if (rating.equals("negative") && days >= 10 && days <= 15) {
                    tripPrice = (days - 1) * apartment;
                    discountPrice = tripPrice - (tripPrice * 0.35);
                    finalPrice = discountPrice - (discountPrice * 0.1);
                    System.out.printf("%.2f", finalPrice);
                }
                if (rating.equals("positive") && days > 15) {
                    tripPrice = (days - 1) * apartment;
                    discountPrice = tripPrice - (tripPrice * 0.5);
                    finalPrice = discountPrice + (discountPrice * 0.25);
                    System.out.printf("%.2f", finalPrice);
                } else if (rating.equals("negative") && days > 15) {
                    tripPrice = (days - 1) * apartment;
                    discountPrice = tripPrice - (tripPrice * 0.5);
                    finalPrice = discountPrice - (discountPrice * 0.1);
                    System.out.printf("%.2f", finalPrice);
                }
                break;
            case "president apartment":
                if (rating.equals("positive") && days < 10) {
                    tripPrice = (days - 1) * presidentApartment;
                    discountPrice = tripPrice - (tripPrice * 0.1);
                    finalPrice = discountPrice + (discountPrice * 0.25);
                    System.out.printf("%.2f", finalPrice);
                } else if (rating.equals("negative") && days < 10) {
                    tripPrice = (days - 1) * presidentApartment;
                    discountPrice = tripPrice - (tripPrice * 0.1);
                    finalPrice = discountPrice - (discountPrice * 0.1);
                    System.out.printf("%.2f", finalPrice);
                }
                if (rating.equals("positive") && days >= 10 && days <= 15) {
                    tripPrice = (days - 1) * presidentApartment;
                    discountPrice = tripPrice - (tripPrice * 0.15);
                    finalPrice = discountPrice + (discountPrice * 0.25);
                    System.out.printf("%.2f", finalPrice);
                } else if (rating.equals("negative") && days >= 10 && days <= 15) {
                    tripPrice = (days - 1) * presidentApartment;
                    discountPrice = tripPrice - (tripPrice * 0.15);
                    finalPrice = discountPrice - (discountPrice * 0.1);
                    System.out.printf("%.2f", finalPrice);
                }
                if (rating.equals("positive") && days > 15) {
                    tripPrice = (days - 1) * presidentApartment;
                    discountPrice = tripPrice - (tripPrice * 0.2);
                    finalPrice = discountPrice + (discountPrice * 0.25);
                    System.out.printf("%.2f", finalPrice);
                } else if (rating.equals("negative") && days > 15) {
                    tripPrice = (days - 1) * presidentApartment;
                    discountPrice = tripPrice - (tripPrice * 0.2);
                    finalPrice = discountPrice - (discountPrice * 0.1);
                    System.out.printf("%.2f", finalPrice);
                }
                break;
        }
    }
}

