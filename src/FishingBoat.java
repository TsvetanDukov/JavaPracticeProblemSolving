import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int group = Integer.parseInt(scanner.nextLine());

        int boatSpring = 3000;
        int boatSummer = 4200;
        int boatAutumn = 4200;
        int boatWinter = 2600;

        double finalPrice;
        double moneyLeft;
        double moneyNeeded;

        switch (season) {
            case "Spring":
                if (group <= 6 && group % 2 == 0) {
                    finalPrice = boatSpring - (boatSpring * 0.15);
                    if (finalPrice <= budget) {
                        moneyLeft = budget - finalPrice;
                        System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                    } else if (finalPrice > budget) {
                        moneyNeeded = finalPrice - budget;
                        System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded);
                    }
                }
                if (group <= 6 && group % 2 == 1) {
                    finalPrice = boatSpring - (boatSpring * 0.1);
                    if (finalPrice <= budget) {
                        moneyLeft = budget - finalPrice;
                        System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                    } else if (finalPrice > budget) {
                        moneyNeeded = finalPrice - budget;
                        System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded);
                    }
                }
                if (group >= 7 && group <= 11 && group % 2 == 1) {
                    finalPrice = boatSpring - (boatSpring * 0.15);
                    if (finalPrice <= budget) {
                        moneyLeft = budget - finalPrice;
                        System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                    } else if (finalPrice > budget) {
                        moneyNeeded = finalPrice - budget;
                        System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded);
                    }
                } else if (group >= 7 && group <= 11 && group % 2 == 0) {
                    finalPrice = boatSpring - (boatSpring * 0.2);
                    if (finalPrice <= budget) {
                        moneyLeft = budget - finalPrice;
                        System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                    } else if (finalPrice > budget) {
                        moneyNeeded = finalPrice - budget;
                        System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded);
                    }
                }
                if (group > 12 && group % 2 == 1) {
                    finalPrice = boatSpring - (boatSpring * 0.25);
                    if (finalPrice <= budget) {
                        moneyLeft = budget - finalPrice;
                        System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                    } else if (finalPrice > budget) {
                        moneyNeeded = finalPrice - budget;
                        System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded);
                    }
                } else if (group > 12 && group % 2 == 0) {
                    finalPrice = boatSpring - (boatSpring * 0.30);
                    if (finalPrice <= budget) {
                        moneyLeft = budget - finalPrice;
                        System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                    } else if (finalPrice > budget) {
                        moneyNeeded = finalPrice - budget;
                        System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded);
                    }
                }
                break;
            case "Summer":
                if (group <= 6 && group % 2 == 0) {
                    finalPrice = boatSummer - (boatSummer * 0.15);
                    if (finalPrice <= budget) {
                        moneyLeft = budget - finalPrice;
                        System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                    } else if (finalPrice > budget) {
                        moneyNeeded = finalPrice - budget;
                        System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded);
                    }
                }
                if (group <= 6 && group % 2 == 1) {
                    finalPrice = boatSummer - (boatSummer * 0.1);
                    if (finalPrice <= budget) {
                        moneyLeft = budget - finalPrice;
                        System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                    } else if (finalPrice > budget) {
                        moneyNeeded = finalPrice - budget;
                        System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded);
                    }
                }
                if (group >= 7 && group <= 11 && group % 2 == 1) {
                    finalPrice = boatSummer - (boatSummer * 0.15);
                    if (finalPrice <= budget) {
                        moneyLeft = budget - finalPrice;
                        System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                    } else if (finalPrice > budget) {
                        moneyNeeded = finalPrice - budget;
                        System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded);
                    }
                } else if (group >= 7 && group <= 11 && group % 2 == 0) {
                    finalPrice = boatSummer - (boatSummer * 0.2);
                    if (finalPrice <= budget) {
                        moneyLeft = budget - finalPrice;
                        System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                    } else if (finalPrice > budget) {
                        moneyNeeded = finalPrice - budget;
                        System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded);
                    }
                }
                if (group > 12 && group % 2 == 1) {
                    finalPrice = boatSummer - (boatSummer * 0.25);
                    if (finalPrice <= budget) {
                        moneyLeft = budget - finalPrice;
                        System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                    } else if (finalPrice > budget) {
                        moneyNeeded = finalPrice - budget;
                        System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded);
                    }
                } else if (group > 12 && group % 2 == 0) {
                    finalPrice = boatSummer - (boatSummer * 0.30);
                    if (finalPrice <= budget) {
                        moneyLeft = budget - finalPrice;
                        System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                    } else if (finalPrice > budget) {
                        moneyNeeded = finalPrice - budget;
                        System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded);
                    }
                }
                break;
            case "Winter":
                if (group <= 6 && group % 2 == 0) {
                    finalPrice = boatWinter - (boatWinter * 0.15);
                    if (finalPrice <= budget) {
                        moneyLeft = budget - finalPrice;
                        System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                    } else if (finalPrice > budget) {
                        moneyNeeded = finalPrice - budget;
                        System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded);
                    }
                }
                if (group <= 6 && group % 2 == 1) {
                    finalPrice = boatWinter - (boatWinter * 0.1);
                    if (finalPrice <= budget) {
                        moneyLeft = budget - finalPrice;
                        System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                    } else if (finalPrice > budget) {
                        moneyNeeded = finalPrice - budget;
                        System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded);
                    }
                }
                if (group >= 7 && group <= 11 && group % 2 == 1) {
                    finalPrice = boatWinter - (boatWinter * 0.15);
                    if (finalPrice <= budget) {
                        moneyLeft = budget - finalPrice;
                        System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                    } else if (finalPrice > budget) {
                        moneyNeeded = finalPrice - budget;
                        System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded);
                    }
                } else if (group >= 7 && group <= 11 && group % 2 == 0) {
                    finalPrice = boatWinter - (boatWinter * 0.2);
                    if (finalPrice <= budget) {
                        moneyLeft = budget - finalPrice;
                        System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                    } else if (finalPrice > budget) {
                        moneyNeeded = finalPrice - budget;
                        System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded);
                    }
                }
                if (group > 12 && group % 2 == 1) {
                    finalPrice = boatWinter - (boatWinter * 0.25);
                    if (finalPrice <= budget) {
                        moneyLeft = budget - finalPrice;
                        System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                    } else if (finalPrice > budget) {
                        moneyNeeded = finalPrice - budget;
                        System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded);
                    }
                } else if (group > 12 && group % 2 == 0) {
                    finalPrice = boatWinter - (boatWinter * 0.30);
                    if (finalPrice <= budget) {
                        moneyLeft = budget - finalPrice;
                        System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                    } else if (finalPrice > budget) {
                        moneyNeeded = finalPrice - budget;
                        System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded);
                    }
                }
                break;
            case "Autumn":
                if (group <= 6) {
                    finalPrice = boatAutumn - (boatAutumn * 0.1);
                    if (finalPrice <= budget) {
                        moneyLeft = budget - finalPrice;
                        System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                    } else if (finalPrice > budget) {
                        moneyNeeded = finalPrice - budget;
                        System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded);
                    }
                }
                if (group >= 7 && group <= 11) {
                    finalPrice = boatAutumn - (boatAutumn * 0.15);
                    if (finalPrice <= budget) {
                        moneyLeft = budget - finalPrice;
                        System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                    } else if (finalPrice > budget) {
                        moneyNeeded = finalPrice - budget;
                        System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded);
                    }
                }
                if (group > 12) {
                    finalPrice = boatAutumn - (boatAutumn * 0.25);
                    if (finalPrice <= budget) {
                        moneyLeft = budget - finalPrice;
                        System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                    } else if (finalPrice > budget) {
                        moneyNeeded = finalPrice - budget;
                        System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded);
                    }
                }
                break;
        }
    }
}
