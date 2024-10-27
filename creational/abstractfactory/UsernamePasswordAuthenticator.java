package creational.abstractfactory;

public class UsernamePasswordAuthenticator implements IAuthenticator {
  @Override
  public boolean authenticate(String username, String password) {
    return "admin".equals(username) && "password123".equals(password);
  }

  @Override
  public boolean authenticate(String token) {
    return false; // Not used for username/password
  }
}
