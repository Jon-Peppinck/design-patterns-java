package creational.abstractfactory;

public class UsernamePasswordAuthFactory implements AbstractFactory_auth {
  @Override
  public IAuthenticator createAuthenticator() {
    return new UsernamePasswordAuthenticator();
  }
}
