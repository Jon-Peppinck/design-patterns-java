package structural.decorator;

public class RealController implements IController {
  @Override
  public void handleRequest(String userRole) {
    System.out.println("Request is being handled. User Role: " + userRole);
  }
}
