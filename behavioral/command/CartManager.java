package behavioral.command;

import java.util.Stack;

// Invoker (Cart Manager to Handle Commands)
public class CartManager {
  private final Stack<Command_cart> commandHistory = new Stack<>();

  public void executeCommand(Command_cart command) {
    command.execute();
    commandHistory.push(command);
  }

  public void undoLastCommand() {
    if (!commandHistory.isEmpty()) {
      Command_cart lastCommand = commandHistory.pop();
      lastCommand.undo();
    }
  }
}
