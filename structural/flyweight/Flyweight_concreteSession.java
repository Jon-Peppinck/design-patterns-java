package structural.flyweight;

/*
  Common use cases of the flyweight design pattern in web development:
    1. Caching of HTTP Responses
    2. Text Rendering in Document Processing Systems
*/

public class Flyweight_concreteSession implements ISessionFlyweight {
  private final String commonData; // Common data shared among sessions
  private String userRole; // Unique data for each session

  public Flyweight_concreteSession(String commonData) {
    this.commonData = commonData;
  }

  @Override
  public void setUserRole(String role) {
    this.userRole = role;
  }

  @Override
  public String getUserRole() {
    return userRole;
  }

  @Override
  public String getCommonData() {
    return commonData;
  }
}
