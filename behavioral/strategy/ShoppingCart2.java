package behavioral.strategy;

// Context for Payment Processing
public class ShoppingCart2 {
    private Strategy_payment paymentStrategy;

    public void setPaymentStrategy(Strategy_payment paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Payment method not set.");
        }
        paymentStrategy.pay(amount);
    }
}
