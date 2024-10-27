package structural.facade;

/*
  Common use cases of the facade design pattern in web development:
    1. API Gateway in Microservices
    2. Authentication and Authorization Management (Multiple methods)
    3. Messaging System Integration (e.g. emails, SMS, push notifications)
*/
public class Facade_apiGateway {
  private final UserService userService;
  private final ProductService productService;
  private final OrderService orderService;

  public Facade_apiGateway() {
    this.userService = new UserService();
    this.productService = new ProductService();
    this.orderService = new OrderService();
  }

  // Facade method to get all details at once
  public String getFullDetails(int userId, int productId, int orderId) {
    String userDetails = userService.getUserDetails(userId);
    String productDetails = productService.getProductDetails(productId);
    String orderDetails = orderService.getOrderDetails(orderId);

    return String.format("%s\n%s\n%s", userDetails, productDetails, orderDetails);
  }
}
