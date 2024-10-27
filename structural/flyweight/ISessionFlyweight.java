package structural.flyweight;

public interface ISessionFlyweight {
  public void setUserRole(String role);

  public String getUserRole();

  public String getCommonData();
}
