package behavioral.command;

// Concrete Command for Removing an Item
public class RemoveItemCommand implements Command_cart {
  private final ShoppingCart cart;
  private final String item;

  public RemoveItemCommand(ShoppingCart cart, String item) {
    this.cart = cart;
    this.item = item;
  }

  @Override
  public void execute() {
    cart.removeItem(item);
  }

  @Override
  public void undo() {
    cart.addItem(item);
  }
}