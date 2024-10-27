package behavioral.chainofresponsibility;

public class ValidationHandler implements ChainOfResponsibility_requestHandler {
  private ChainOfResponsibility_requestHandler nextHandler;

  public ValidationHandler(ChainOfResponsibility_requestHandler nextHandler) {
    this.nextHandler = nextHandler;
  }

  @Override
  public void handle(ExampleRequest request) {
    if (request.isValid()) {
      System.out.println("Data validation passed.");
      if (nextHandler != null) {
        nextHandler.handle(request);
      }
    } else {
      System.out.println("Data validation failed.");
    }
  }
}
