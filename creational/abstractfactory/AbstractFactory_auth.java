package creational.abstractfactory;

/*
  Common use cases of the abstract factory design pattern in web development:

  1. Authentication Mechanism Factory: Producing different authentication providers (e.g. OAuth/ JWT) depending on security requirements or third-party integrations.

  2. Cloud Service Factory: Generating factories for different cloud services (e.g. AWS, GCP, Azure) for various resources like storage, compute, or databases.

  3. Message Queue Factory: Creating factories for different message brokers (e.g. Kafka, RabbitMQ) to support diverse messaging systems across environments.
 */

/*
 Flexibility: Factory Method allows subclasses to override the method to create different objects, whereas Abstract Factory provides a way to create a suite of related objects through its multiple factory methods.

 Use Cases: Use Factory Method when the system needs to be flexible regarding the instantiation of a particular product, and use Abstract Factory when the system needs to ensure the products it creates are compatible with one another.
 */

public interface AbstractFactory_auth {
  IAuthenticator createAuthenticator();
}
