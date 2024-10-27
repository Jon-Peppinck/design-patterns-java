package behavioral.command;

import java.util.ArrayList;
import java.util.List;

// Receiver
public class ShoppingCart {
  private final List<String> items = new ArrayList<>();

  public void addItem(String item) {
    items.add(item);
    System.out.println("Item added: " + item);
  }

  public void removeItem(String item) {
    items.remove(item);
    System.out.println("Item removed: " + item);
  }

  public void showCart() {
    System.out.println("Current cart items: " + items);
  }
}
