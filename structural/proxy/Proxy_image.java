package structural.proxy;

/*
  Common use cases of the proxy design pattern in web development:

    1. Virtual Proxy for Resource Management: 
        delay the creation of resource-intensive objects until they are actually needed.

    2. Protection Proxy for Access Control:
        control access to sensitive operations in a backend service

    3. Caching Proxy for Data Retrieval:
        In scenarios where data retrieval from a database or an external API is expensive or slow, a caching proxy can be employed
*/
public class Proxy_image implements IImage {
  private RealImage realImage;
  private final String filename;

  public Proxy_image(String filename) {
    this.filename = filename;
  }

  @Override
  public void display() {
    if (realImage == null) {
      realImage = new RealImage(filename); // Load image on demand
    }
    realImage.display();
  }
}
