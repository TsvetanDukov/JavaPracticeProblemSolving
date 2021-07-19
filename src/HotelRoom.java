import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double studioPrice;
        double apartmentPrice;
        double initialStudioPrice;
        double initialApartmentPrice;


        switch (month) {
            case "May":
            case "October":
                if (days > 7 && days <= 14) {
                    initialStudioPrice = days * 50;
                    studioPrice = initialStudioPrice - (initialStudioPrice * 0.05);
                    initialApartmentPrice = days * 65;
                    apartmentPrice = initialApartmentPrice;
                    System.out.printf("Apartment: %.2f lv.", apartmentPrice);
                    System.out.printf("\nStudio: %.2f lv.", studioPrice);
                } else if (days > 14) {
                    initialStudioPrice = days * 50;
                    studioPrice = initialStudioPrice - (initialStudioPrice * 0.30);
                    initialApartmentPrice = days * 65;
                    apartmentPrice = initialApartmentPrice - (initialApartmentPrice * 0.1);
                    System.out.printf("Apartment: %.2f lv.", apartmentPrice);
                    System.out.printf("\nStudio: %.2f lv.", studioPrice);
                }
                break;

            case "June":
            case "September":
                if (days <= 14) {
                    initialStudioPrice = days * 75.20;
                    studioPrice = initialStudioPrice;
                    initialApartmentPrice = days * 68.70;
                    apartmentPrice = initialApartmentPrice;
                    System.out.printf("Apartment: %.2f lv.", apartmentPrice);
                    System.out.printf("\nStudio: %.2f lv.", studioPrice);
                }
                if (days > 14) {
                    initialStudioPrice = days * 75.20;
                    studioPrice = initialStudioPrice - (initialStudioPrice * 0.20);
                    initialApartmentPrice = days * 68.70;
                    apartmentPrice = initialApartmentPrice - (initialApartmentPrice * 0.1);
                    System.out.printf("Apartment: %.2f lv.", apartmentPrice);
                    System.out.printf("\nStudio: %.2f lv.", studioPrice);
                }
                break;
            case "July":
            case "August":
                if (days <= 14) {
                    initialStudioPrice = days * 76;
                    studioPrice = initialStudioPrice;
                    initialApartmentPrice = days * 77;
                    apartmentPrice = initialApartmentPrice;
                    System.out.printf("Apartment: %.2f lv.", apartmentPrice);
                    System.out.printf("\nStudio: %.2f lv.", studioPrice);
                }
                if (days > 14) {
                    initialStudioPrice = days * 76;
                    studioPrice = initialStudioPrice;
                    initialApartmentPrice = days * 77;
                    apartmentPrice = initialApartmentPrice - (initialApartmentPrice * 0.1);
                    System.out.printf("Apartment: %.2f lv.", apartmentPrice);
                    System.out.printf("\nStudio: %.2f lv.", studioPrice);
                }
                break;
        }
    }
}

