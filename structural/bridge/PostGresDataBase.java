package structural.bridge;

public class PostGresDataBase implements Bridge_DataBase {
  @Override
  public void connect() {
    System.out.println("Connecting to PostgreSQL database...");
  }

  @Override
  public void executeQuery(String query) {
    System.out.println("Executing query on PostgreSQL: " + query);
  }

  @Override
  public void disconnect() {
    System.out.println("Disconnecting from PostgreSQL database.");
  }
}
