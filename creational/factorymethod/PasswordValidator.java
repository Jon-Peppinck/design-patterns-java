package creational.factorymethod;

public class PasswordValidator implements IValidator {
  @Override
  public boolean validate(String value) {
    return value.length() > 8;
  }
}