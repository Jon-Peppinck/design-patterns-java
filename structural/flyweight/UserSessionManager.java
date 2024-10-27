package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class UserSessionManager {
  private final Map<String, ISessionFlyweight> sessions = new HashMap<>();
  private final Map<ISessionFlyweight, String> userRoles = new HashMap<>();

  public ISessionFlyweight getSession(String commonData) {
    return sessions.computeIfAbsent(commonData, Flyweight_concreteSession::new);
  }

  public void setUserRole(ISessionFlyweight session, String role) {
    userRoles.put(session, role);
    session.setUserRole(role); // Set role in session object
  }

  public String getUserRole(ISessionFlyweight session) {
    return userRoles.get(session);
  }
}
