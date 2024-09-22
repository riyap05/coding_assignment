package structural.decorator;

import java.util.Scanner;

public class MainDecorator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Coffee coffee = new BasicCoffee();

        System.out.println("Choose your coffee options:");
        System.out.println("1. Milk (+$1.50)");
        System.out.println("2. Sugar (+$0.50)");
        System.out.println("3. No extras (just coffee)");
        System.out.println("Enter your choices (comma-separated for multiple options):");

        String input = scanner.nextLine();
        String[] choices = input.split(",");

        for (String choice : choices) {
            switch (choice.trim()) {
                case "1":
                    coffee = new MilkDecorator(coffee);
                    break;
                case "2":
                    coffee = new SugarDecorator(coffee);
                    break;
                case "3":
                    // No extra, just coffee
                    break;
                default:
                    System.out.println("Invalid choice: " + choice);
            }
        }

        System.out.println("Your coffee: " + coffee.getDescription());
        System.out.printf("Total cost: %.2f\n", coffee.cost());

        scanner.close();
    }
}
