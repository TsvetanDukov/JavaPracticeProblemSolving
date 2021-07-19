import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String flowers = scanner.nextLine();
        int flowersCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        int rose = 5;
        double dahlia = 3.80;
        double tulip = 2.80;
        int narcissus = 3;
        double gladiolus = 2.50;

        double totalPrice;
        double finalPrice;
        double moneyLeft;
        double moneyNeeded;

        switch (flowers) {
            case "Roses":
                if (flowersCount > 80) {
                    totalPrice = rose * flowersCount;
                    finalPrice = totalPrice - (totalPrice * 0.1);
                    moneyLeft = budget - finalPrice;
                    if (finalPrice <= budget) {
                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left."
                                , flowersCount, flowers, moneyLeft);
                    } else if (finalPrice > budget) {
                        moneyNeeded = finalPrice - budget;
                        System.out.printf("Not enough money, you need %.2f leva more.", moneyNeeded);
                    }
                } else if (flowersCount < 80) {
                    finalPrice = rose * flowersCount;
                    moneyLeft = budget - finalPrice;
                    if (finalPrice <= budget) {
                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left."
                                , flowersCount, flowers, moneyLeft);
                    } else if (finalPrice > budget) {
                        moneyNeeded = finalPrice - budget;
                        System.out.printf("Not enough money, you need %.2f leva more.", moneyNeeded);
                    }
                }
                if (flowersCount == 80) {
                    totalPrice = rose * flowersCount;
                    moneyLeft = budget - totalPrice;
                    if (totalPrice <= budget) {
                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left."
                                , flowersCount, flowers, moneyLeft);
                    } else if (totalPrice > budget) {
                        moneyNeeded = totalPrice - budget;
                        System.out.printf("Not enough money, you need %.2f leva more.", moneyNeeded);
                    }
                }
                break;
            case "Dahlias":
                if (flowersCount > 90) {
                    totalPrice = dahlia * flowersCount;
                    finalPrice = totalPrice - (totalPrice * 0.15);
                    moneyLeft = budget - finalPrice;
                    if (finalPrice <= budget) {
                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left."
                                , flowersCount, flowers, moneyLeft);
                    } else if (finalPrice > budget) {
                        moneyNeeded = finalPrice - budget;
                        System.out.printf("Not enough money, you need %.2f leva more.", moneyNeeded);
                    }
                } else if (flowersCount < 90) {
                    finalPrice = dahlia * flowersCount;
                    moneyLeft = budget - finalPrice;
                    if (finalPrice <= budget) {
                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left."
                                , flowersCount, flowers, moneyLeft);
                    } else if (finalPrice > budget) {
                        moneyNeeded = finalPrice - budget;
                        System.out.printf("Not enough money, you need %.2f leva more.", moneyNeeded);
                    }
                }
                if (flowersCount == 90) {
                    totalPrice = dahlia * flowersCount;
                    moneyLeft = budget - totalPrice;
                    if (totalPrice <= budget) {
                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left."
                                , flowersCount, flowers, moneyLeft);
                    } else if (totalPrice > budget) {
                        moneyNeeded = totalPrice - budget;
                        System.out.printf("Not enough money, you need %.2f leva more.", moneyNeeded);
                    }
                }
                break;
            case "Tulips":
                if (flowersCount > 80) {
                    totalPrice = tulip * flowersCount;
                    finalPrice = totalPrice - (totalPrice * 0.15);
                    moneyLeft = budget - finalPrice;
                    if (finalPrice <= budget) {
                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left."
                                , flowersCount, flowers, moneyLeft);
                    } else if (finalPrice > budget) {
                        moneyNeeded = finalPrice - budget;
                        System.out.printf("Not enough money, you need %.2f leva more.", moneyNeeded);
                    }
                } else if (flowersCount < 80) {
                    finalPrice = tulip * flowersCount;
                    moneyLeft = budget - finalPrice;
                    if (finalPrice <= budget) {
                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left."
                                , flowersCount, flowers, moneyLeft);
                    } else if (finalPrice > budget) {
                        moneyNeeded = finalPrice - budget;
                        System.out.printf("Not enough money, you need %.2f leva more.", moneyNeeded);
                    }
                }
                if (flowersCount == 80) {
                    totalPrice = tulip * flowersCount;
                    moneyLeft = budget - totalPrice;
                    if (totalPrice <= budget) {
                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left."
                                , flowersCount, flowers, moneyLeft);
                    } else if (totalPrice > budget) {
                        moneyNeeded = totalPrice - budget;
                        System.out.printf("Not enough money, you need %.2f leva more.", moneyNeeded);
                    }
                }
                break;
            case "Narcissus":
                if (flowersCount < 120) {
                    totalPrice = narcissus * flowersCount;
                    finalPrice = totalPrice + (totalPrice * 0.15);
                    moneyLeft = budget - finalPrice;
                    if (finalPrice <= budget) {
                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left."
                                , flowersCount, flowers, moneyLeft);
                    } else if (finalPrice > budget) {
                        moneyNeeded = finalPrice - budget;
                        System.out.printf("Not enough money, you need %.2f leva more.", moneyNeeded);
                    }
                } else if (flowersCount > 120) {
                    finalPrice = narcissus * flowersCount;
                    moneyLeft = budget - finalPrice;
                    if (finalPrice <= budget) {
                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left."
                                , flowersCount, flowers, moneyLeft);
                    } else if (finalPrice > budget) {
                        moneyNeeded = finalPrice - budget;
                        System.out.printf("Not enough money, you need %.2f leva more.", moneyNeeded);
                    }
                }
                if (flowersCount == 120) {
                    totalPrice = narcissus * flowersCount;
                    moneyLeft = budget - totalPrice;
                    if (totalPrice <= budget) {
                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left."
                                , flowersCount, flowers, moneyLeft);
                    } else if (totalPrice > budget) {
                        moneyNeeded = totalPrice - budget;
                        System.out.printf("Not enough money, you need %.2f leva more.", moneyNeeded);
                    }
                }
                break;
            case "Gladiolus":
                if (flowersCount < 80) {
                    totalPrice = gladiolus * flowersCount;
                    finalPrice = totalPrice + (totalPrice * 0.20);
                    moneyLeft = budget - finalPrice;
                    if (finalPrice <= budget) {
                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left."
                                , flowersCount, flowers, moneyLeft);
                    } else if (finalPrice > budget) {
                        moneyNeeded = finalPrice - budget;
                        System.out.printf("Not enough money, you need %.2f leva more.", moneyNeeded);
                    }
                } else if (flowersCount > 80) {
                    finalPrice = gladiolus * flowersCount;
                    moneyLeft = budget - finalPrice;
                    if (finalPrice <= budget) {
                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left."
                                , flowersCount, flowers, moneyLeft);
                    } else if (finalPrice > budget) {
                        moneyNeeded = finalPrice - budget;
                        System.out.printf("Not enough money, you need %.2f leva more.", moneyNeeded);
                    }
                }
                if (flowersCount == 80) {
                    totalPrice = gladiolus * flowersCount;
                    moneyLeft = budget - totalPrice;
                    if (totalPrice <= budget) {
                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left."
                                , flowersCount, flowers, moneyLeft);
                    } else if (totalPrice > budget) {
                        moneyNeeded = totalPrice - budget;
                        System.out.printf("Not enough money, you need %.2f leva more.", moneyNeeded);
                    }
                }
                break;
        }
    }
}

