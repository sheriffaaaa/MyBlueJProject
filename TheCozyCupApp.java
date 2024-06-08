import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class TheCozyCupApp {
    public static void main(String[] args) {
        CoffeDrink espresso = new CoffeDrink("Espresso", 2.50);
        CoffeDrink cappuccino = new CoffeDrink("Cappuccino", 3.50);
        CoffeDrink latte = new CoffeDrink("Latte", 4.00);
        CoffeDrink mocha = new CoffeDrink("Mocha", 4.50);

        Pastry croissant = new Pastry("Croissant", 1.50);
        Pastry muffin = new Pastry("Muffin", 2.00);
        Pastry scone = new Pastry("Scone", 2.50);
        Pastry cake = new Pastry("Cake", 3.00);

        CoffeDrink[] coffeDrinks = {espresso, cappuccino, latte, mocha};
        Pastry[] pastries = {croissant, muffin, scone, cake};

        TheCozyCup cozycup = new TheCozyCup(coffeDrinks, pastries);

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> orders = new ArrayList<>();
        double totalCost = 0.0;

        while (true) {
            System.out.print("Welcome to the Coffe Shop Menu!\n\n");
            for (int i = 0; i < coffeDrinks.length; i++) {
                System.out.println((i + 1) + ". " + coffeDrinks[i].getName() + " - $" + coffeDrinks[i].getPrice());
            }

            for (int i = 0; i < pastries.length; i++) {
                System.out.println((coffeDrinks.length + i + 1) + ". " + pastries[i].getName() + " - $" + pastries[i].getPrice());
            }
            System.out.print("\nEnter the number of your selection (or 0 to finish the ordering ) : ");
            try {
                int choice = scanner.nextInt();
                if (choice == 0) {
                    break;
                } else if (choice >= 1 && choice <= coffeDrinks.length) {
                    CoffeDrink selectedDrink = coffeDrinks[choice - 1];
                    System.out.print("\nYou selected: " + selectedDrink.getName() + "\nEnter the quantity: ");
                    int quantity = scanner.nextInt();
                    totalCost += selectedDrink.getPrice() * quantity;
                    System.out.println("You ordered " + quantity + " " + selectedDrink.getName() + "(s)");
                    orders.add(quantity + " x " + selectedDrink.getName() + " = $" + String.format("%.2f", selectedDrink.getPrice() * quantity));
                } else if (choice > coffeDrinks.length && choice <= coffeDrinks.length + pastries.length) {
                    Pastry selectedPastry = pastries[choice - coffeDrinks.length - 1];
                    System.out.print("\nYou selected: " + selectedPastry.getName() + "\nEnter the quantity: ");
                    int quantity = scanner.nextInt();
                    totalCost += selectedPastry.getPrice() * quantity;
                    System.out.println("You ordered " + quantity + " " + selectedPastry.getName() + "(s)");
                    orders.add(quantity + " x " + selectedPastry.getName() + " = $" + String.format("%.2f", selectedPastry.getPrice() * quantity));
                } else {
                    System.out.println("Invalid selection. Please try again. ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input.Please enter a valid selection. ");
                scanner.next();
            }
        }

        System.out.println("\nOrder Summary: ");
        for (String order : orders) {
            System.out.println("- " + order);
        }
        System.out.println("Total Cost: $" + String.format("%.2f", totalCost));
    }
}
