package structural.bridge;

public class UserManagement extends BusinessLogic {
  public UserManagement(Bridge_DataBase database) {
    super(database);
  }

  @Override
  public void performOperation(String query) {
    database.connect();
    database.executeQuery(query);
    database.disconnect();
  }
}