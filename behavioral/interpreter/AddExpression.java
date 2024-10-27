package behavioral.interpreter;

public class AddExpression implements IExpression {
  private final IExpression leftExpression;
  private final IExpression rightExpression;

  public AddExpression(IExpression left, IExpression right) {
    this.leftExpression = left;
    this.rightExpression = right;
  }

  @Override
  public int interpret() {
    return leftExpression.interpret() + rightExpression.interpret();
  }
}