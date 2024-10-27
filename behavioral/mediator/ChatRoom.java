package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements Mediator_chat {
  private List<ChatUser> users;

  public ChatRoom() {
    this.users = new ArrayList<>();
  }

  @Override
  public void sendMessage(String message, ChatUser user) {
    for (ChatUser u : users) {
      // Message should not be sent to the user sending it
      if (u != user) {
        u.receive(message);
      }
    }
  }

  @Override
  public void addUser(ChatUser user) {
    users.add(user);
  }
}