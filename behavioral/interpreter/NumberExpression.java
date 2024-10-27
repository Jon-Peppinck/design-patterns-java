package behavioral.interpreter;

public class NumberExpression implements IExpression {
  private final int number;

  public NumberExpression(int number) {
    this.number = number;
  }

  @Override
  public int interpret() {
    return number;
  }
}
