package creational.factorymethod;

/*
  Common use cases of the factory method design pattern in web development:

  1. Database Connection Factory: Creating connections for different databases (e.g., MySQL, PostgreSQL) based on configuration or environment.

  2. HTTP Response Factory: Generating responses in different formats (e.g., JSON, XML, HTML) depending on client requests.

  3. Logger Factory: Providing different logging mechanisms (e.g., console logger, file logger) based on environment settings.

  4. Request Handler Factory: Handling different HTTP methods (e.g., GET, POST, PUT, DELETE) with specific request handlers.

  5. Validator Factory: Dynamically creating validators for form fields (e.g., email, password) based on field type.
 */
public class FactoryMethod_validator {
  public static IValidator createValidator(String fieldType) {
    if ("email".equals(fieldType)) {
      return new EmailValidator();
    } else if ("password".equals(fieldType)) {
      return new PasswordValidator();
    }
    return null;
  }
}
