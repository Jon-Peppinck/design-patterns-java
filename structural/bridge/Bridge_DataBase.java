package structural.bridge;

/*
  Common use cases of the bridge design pattern in web development:
  
    1. Database Abstraction: 
        Separate database logic from business logic
    
    2. Logging Framework:
        Separate the logging API from the actual logging implementation

    3. Messaging Systems:
        When integrating with different messaging systems (like RabbitMQ, Kafka, or ActiveMQ), the Bridge pattern can be leveraged to create a unified messaging interface.
*/
public interface Bridge_DataBase {
  void connect();

  void executeQuery(String query);

  void disconnect();
}
