package behavioral.command;

/*
  Common use cases of the command design pattern in web development:
    1. Task Queuing in Job Processing Systems
    2. User Permissions and Role Management
    3. Undo Operations in Data Management
*/

public interface Command_cart {
  public void execute();

  public void undo();
}
