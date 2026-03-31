import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Item> items;

    public Inventory() {
        items = new HashMap<>();
    }

    // Add item
    public void addItem(Item item) {
        items.put(item.getItemId(), item);
        System.out.println("Item added successfully.");
    }

    // Remove item
    public void removeItem(String itemId) {
        if (items.containsKey(itemId)) {
            items.remove(itemId);
            System.out.println("Item removed.");
        } else {
            System.out.println("Item not found.");
        }
    }

    // Update quantity
    public void updateQuantity(String itemId, int quantity) {
        if (items.containsKey(itemId)) {
            items.get(itemId).setQuantity(quantity);
            System.out.println("Quantity updated.");
        } else {
            System.out.println("Item not found.");
        }
    }

    // Search by ID
    public void searchById(String itemId) {
        if (items.containsKey(itemId)) {
            System.out.println(items.get(itemId));
        } else {
            System.out.println("Item not found.");
        }
    }

    // Search by name
    public void searchByName(String name) {
        boolean found = false;
        for (Item item : items.values()) {
            if (item.getItemName().equalsIgnoreCase(name)) {
                System.out.println(item);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Item not found.");
        }
    }

    // Display all items
    public void displayAll() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Item item : items.values()) {
                System.out.println(item);
            }
        }
    }
}
