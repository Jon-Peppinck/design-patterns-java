package behavioral.mediator;

public class ConcreteChatUser extends ChatUser {
  public ConcreteChatUser(Mediator_chat mediator, String name) {
    super(mediator, name);
  }

  @Override
  public void send(String message) {
    System.out.println(name + " sending: " + message);
    mediator.sendMessage(message, this);
  }

  @Override
  public void receive(String message) {
    System.out.println(name + " received: " + message);
  }
}
