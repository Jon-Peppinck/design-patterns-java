package creational.abstractfactory;

public interface IAuthenticator {
  boolean authenticate(String id, String secret);

  boolean authenticate(String token);
}
