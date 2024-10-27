package structural.adapter;

public class SimpleLogger implements ICustomLogger {
  @Override
  public void logInfo(String message) {
    System.out.println("INFO: " + message);
  }

  @Override
  public void logError(String message) {
    System.err.println("ERROR: " + message);
  }
}