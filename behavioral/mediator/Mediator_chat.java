package behavioral.mediator;

/*
  Common use cases of the mediator design pattern in web development:
    1. Chat Application
    2. User Interface Components
    3. Order Processing System
*/

public interface Mediator_chat {
  void sendMessage(String message, ChatUser user);

  void addUser(ChatUser user);
}
