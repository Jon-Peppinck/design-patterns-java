package creational.abstractfactory;

public class OAuthAuthFactory implements AbstractFactory_auth {
  @Override
  public IAuthenticator createAuthenticator() {
    return new OAuthAuthenticator();
  }
}
