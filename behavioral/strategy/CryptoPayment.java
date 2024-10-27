package behavioral.strategy;

// Concrete Strategy for Cryptocurrency Payment
public class CryptoPayment implements Strategy_payment {
  private final String walletAddress;

  public CryptoPayment(String walletAddress) {
    this.walletAddress = walletAddress;
  }

  @Override
  public void pay(int amount) {
    System.out.println("Paid " + amount + " using Cryptocurrency: " + walletAddress);
  }
}
