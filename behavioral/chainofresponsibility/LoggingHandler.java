package behavioral.chainofresponsibility;

public class LoggingHandler implements ChainOfResponsibility_requestHandler {
  private ChainOfResponsibility_requestHandler nextHandler;

  public LoggingHandler(ChainOfResponsibility_requestHandler nextHandler) {
    this.nextHandler = nextHandler;
  }

  @Override
  public void handle(ExampleRequest request) {
    System.out.println("Logging request: " + request.getData());
    if (nextHandler != null) {
      nextHandler.handle(request);
    }
  }
}
