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

        // TODO (John): implement user menu here
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