package behavioral.strategy;

// Concrete Strategy for Credit Card Payment
public class CreditCardPayment implements Strategy_payment {
  private final String cardNumber;
  private final String cardHolder;

  public CreditCardPayment(String cardNumber, String cardHolder) {
    this.cardNumber = cardNumber;
    this.cardHolder = cardHolder;
  }

  @Override
  public void pay(int amount) {
    System.out.println("Paid " + amount + " using Credit Card: " + cardHolder);
  }
}