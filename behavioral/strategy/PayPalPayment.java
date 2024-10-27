package behavioral.strategy;

// Concrete Strategy for PayPal Payment
public class PayPalPayment implements Strategy_payment {
  private final String email;

  public PayPalPayment(String email) {
    this.email = email;
  }

  @Override
  public void pay(int amount) {
    System.out.println("Paid " + amount + " using PayPal: " + email);
  }
}
