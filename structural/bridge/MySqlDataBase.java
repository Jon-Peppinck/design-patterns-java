package structural.bridge;

public class MySqlDataBase implements Bridge_DataBase {
  @Override
  public void connect() {
    System.out.println("Connecting to MySQL database...");
  }

  @Override
  public void executeQuery(String query) {
    System.out.println("Executing query on MySQL: " + query);
  }

  @Override
  public void disconnect() {
    System.out.println("Disconnecting from MySQL database.");
  }
}
