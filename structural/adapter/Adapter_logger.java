package structural.adapter;

/*
  Common use cases of the adapter design pattern in web development:
    1. Integrating Third-Party APIs
    2. Database Abstraction
    3. Legacy System Integration
*/
public class Adapter_logger implements ICustomLogger {
  private final ThirdPartyLogger thirdPartyLogger;

  public Adapter_logger(ThirdPartyLogger thirdPartyLogger) {
    this.thirdPartyLogger = thirdPartyLogger;
  }

  @Override
  public void logInfo(String message) {
    thirdPartyLogger.info(message);
  }

  @Override
  public void logError(String message) {
    thirdPartyLogger.error(message);
  }
}
