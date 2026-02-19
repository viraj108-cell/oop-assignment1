import java.util.Scanner;

/**
 * GroceryManager - A grocery management system using parallel arrays.
 * Manages item names, prices, and stock levels.
 *
 * @author Biraj Ghimire, Alok Parajuli, John Nichols
 */
public class GroceryManager {

    /**
     * Main method - runs the user menu.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        // Starter inventory (index-aligned parallel arrays)
            itemNames[0] = "Apple";   itemPrices[0] = 0.99;  itemStocks[0] = 10;
            itemNames[1] = "Milk";    itemPrices[1] = 2.49;  itemStocks[1] = 5;
            itemNames[2] = "Bread";   itemPrices[2] = 1.99;  itemStocks[2] = 8;
            itemNames[3] = "Eggs";    itemPrices[3] = 3.49;  itemStocks[3] = 12;
            itemNames[4] = "Rice";    itemPrices[4] = 4.99;  itemStocks[4] = 20;
            itemNames[5] = "Chicken"; itemPrices[5] = 6.99;  itemStocks[5] = 7;
            itemNames[6] = "Cheese";  itemPrices[6] = 2.99;  itemStocks[6] = 9;
            itemNames[7] = "Orange";  itemPrices[7] = 1.29;  itemStocks[7] = 15;
            itemNames[8] = "Banana";  itemPrices[8] = 0.59;  itemStocks[8] = 25;
            itemNames[9] = "Yogurt";  itemPrices[9] = 1.49;  itemStocks[9] = 6;


        Scanner Myscanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("\n1. View\n2. Restock\n3. Exit");
            int num = Myscanner.nextInt();
            Myscanner.nextLine();

            if(num == 1)
            {
                printInventory(itemNames, itemPrices, itemStocks);
            }
            else if(num ==2)
            {
                System.out.println("What Item: ");
                String Item = Myscanner.nextLine();
                System.out.println("How many to Restock: ");
                int amount = Myscanner.nextInt();
                restockItem(itemNames, itemStocks, Item, amount);
            }
            else if(num ==3)
            {
                System.out.println("Exiting");
                break;
            }
            else
            {
                System.out.println("Invalid Option");
            }
        }
        Myscanner.close();
    }

    /**
     * Prints all items in the inventory.
     * @param names array of item names
     * @param prices array of item prices
     * @param stocks array of item stock levels
     */
    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        // TODO (Alok): implement this method
        for (int i = 0; i < names.length; i++) {

            if (names[i] != null) {

                System.out.println("Item: " + names[i]
                + " | Price: $" + prices[i]
                + " | Stock: " + stocks[i]);

            } else {
                // Slot is empty, do nothing
            }
        }

    }

    /**
     * Restocks an item by name.
     * @param names array of item names
     * @param stocks array of item stock levels
     * @param target the item name to restock
     * @param amount the amount to add to stock
     */
    public static void restockItem(String[] names, int[] stocks, String target, int amount) {
    if (target == null || target.trim().isEmpty()) {
        System.out.println("Invalid item name.");
        return;
    }
    if (amount <= 0) {
        System.out.println("Amount must be positive.");
        return;
    }

    for (int i = 0; i < names.length; i++) {
        if (names[i] != null && names[i].equalsIgnoreCase(target.trim())) {
            stocks[i] += amount;
            System.out.println("Restocked " + names[i] + ". New stock: " + stocks[i]);
            return;
        }
    }

    System.out.println("Item not found: " + target);
}

}