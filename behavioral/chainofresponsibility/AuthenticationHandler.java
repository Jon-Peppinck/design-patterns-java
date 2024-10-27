package behavioral.chainofresponsibility;

public class AuthenticationHandler implements ChainOfResponsibility_requestHandler {
  private ChainOfResponsibility_requestHandler nextHandler;

  public AuthenticationHandler(ChainOfResponsibility_requestHandler nextHandler) {
    this.nextHandler = nextHandler;
  }

  @Override
  public void handle(ExampleRequest request) {
    if (request.isAuthenticated()) {
      System.out.println("Authentication successful.");
      if (nextHandler != null) {
        nextHandler.handle(request);
      }
    } else {
      System.out.println("Authentication failed.");
    }
  }
}
