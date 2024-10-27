package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// Create a factory to manage the flyweight objects
public class SessionFactory {
  private final Map<String, ISessionFlyweight> sessions = new HashMap<>();

  public ISessionFlyweight getSession(String commonData) {
    // Reuse existing session if it exists, otherwise create a new one
    return sessions.computeIfAbsent(commonData, Flyweight_concreteSession::new);
  }
}
