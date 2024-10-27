package creational.factorymethod;

public class EmailValidator implements IValidator {
  @Override
  public boolean validate(String value) {
    return value.contains("@");
  }
}
