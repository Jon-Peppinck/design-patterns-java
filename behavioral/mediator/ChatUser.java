package behavioral.mediator;

public abstract class ChatUser {
  protected Mediator_chat mediator;
  protected String name;

  public ChatUser(Mediator_chat mediator, String name) {
      this.mediator = mediator;
      this.name = name;
  }

  public abstract void send(String message);
  public abstract void receive(String message);
}
