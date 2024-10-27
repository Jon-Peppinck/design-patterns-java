package structural.decorator;

/*
  Common use cases of the decorator design pattern in web development:
    1. Request and Response Wrapping (Middleware)
      i. Authentication and Authorization
      ii. Logging
      iii. Error Handling
    2. Decorating Views in Templating Engines e.g. caching  
    3. Enhancing Validation Logic
*/

public class Decorator_authController implements IController {
  private final IController controller;

  public Decorator_authController(IController controller) {
    this.controller = controller;
  }

  @Override
  public void handleRequest(String userRole) {
    if (isAuthenticated(userRole)) {
      System.out.println("User is authenticated. Proceeding...");
      // Delegate the request to the real controller
      controller.handleRequest(userRole);
    } else {
      System.out.println("User is not authenticated. Access denied.");
    }
  }

  private boolean isAuthenticated(String userRole) {
    return "ADMIN".equals(userRole);
  }
}
