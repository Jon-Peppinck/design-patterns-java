package behavioral.chainofresponsibility;

/*
  Common use cases of the chain of responsibility design pattern in web development:
    1. Logging Frameworks
    2. Error Handling and Recovery
    3. Request Handling in Web Servers
*/

public interface ChainOfResponsibility_requestHandler {
  public void handle(ExampleRequest request);
}
