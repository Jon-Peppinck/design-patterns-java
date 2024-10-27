package behavioral.observer;

/*
  Common use cases of the observer design pattern in web development:
    1. Subscription model (e.g. YouTube)
    2. Event notification system (e.g. Microservices - notifying multiple services)
    3. WebSocket message broadcasting (e.g. chat application)
*/

// Observer (Subscriber)
public class Observer_subscriber {
  private final String name;

  public Observer_subscriber(String name) {
    this.name = name;
  }

  public void update(String videoTitle) {
    System.out.println(name + ", new video uploaded: " + videoTitle);
  }
}
