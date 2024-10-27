package structural.adapter;

public class ThirdPartyLogger {
  public void info(String message) {
    System.out.println("Third Party INFO: " + message);
  }

  public void error(String message) {
    System.err.println("Third Party ERROR: " + message);
  }
}
