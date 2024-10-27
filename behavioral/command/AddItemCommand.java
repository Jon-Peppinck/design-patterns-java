package behavioral.command;

// Concrete Command for Adding an Item
public class AddItemCommand implements Command_cart {
  private final ShoppingCart cart;
  private final String item;

  public AddItemCommand(ShoppingCart cart, String item) {
    this.cart = cart;
    this.item = item;
  }

  @Override
  public void execute() {
    cart.addItem(item);
  }

  @Override
  public void undo() {
    cart.removeItem(item);
  }
}
