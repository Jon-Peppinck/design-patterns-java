package creational.abstractfactory;

public class OAuthAuthenticator implements IAuthenticator {
  @Override
  public boolean authenticate(String token) {
    return "valid_token".equals(token);
  }

  @Override
  public boolean authenticate(String username, String password) {
    return false; // Not used for OAuth
  }
}
