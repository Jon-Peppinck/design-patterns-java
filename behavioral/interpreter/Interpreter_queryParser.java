package behavioral.interpreter;

import java.util.ArrayList;
import java.util.List;

/*
  Common use cases of the interpreter design pattern in web development:
    1. Query Language Parsing
    2. Expression Evaluation in Configuration Files
    3. Template Engines
*/

public class Interpreter_queryParser {
  private final String query;

  public Interpreter_queryParser(String query) {
    this.query = query;
  }

  public IExpression parse() {
    String[] tokens = query.split(" ");
    List<IExpression> expressions = new ArrayList<>();
    List<String> operators = new ArrayList<>();

    // Separate numbers and operators
    for (String token : tokens) {
      if (token.matches("\\d+")) { // If the token is a number
        expressions.add(new NumberExpression(Integer.parseInt(token)));
      } else if (token.equals("+") || token.equals("-")) {
        operators.add(token);
      }
    }

    // Build the expression tree
    IExpression result = expressions.get(0);
    for (int i = 0; i < operators.size(); i++) {
      String operator = operators.get(i);
      IExpression nextExpression = expressions.get(i + 1); // Get the next number
      if ("+".equals(operator)) {
        result = new AddExpression(result, nextExpression);
      } else if ("-".equals(operator)) {
        result = new SubtractExpression(result, nextExpression);
      }
    }

    return result; // Return the final expression
  }
}
