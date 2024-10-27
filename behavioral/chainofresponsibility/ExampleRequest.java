package behavioral.chainofresponsibility;

public class ExampleRequest {
  private final String data;
  private final boolean authenticated;
  private final boolean valid;

  public ExampleRequest(String data, boolean authenticated, boolean valid) {
    this.data = data;
    this.authenticated = authenticated;
    this.valid = valid;
  }

  public String getData() {
    return data;
  }

  public boolean isAuthenticated() {
    return authenticated;
  }

  public boolean isValid() {
    return valid;
  }
}
