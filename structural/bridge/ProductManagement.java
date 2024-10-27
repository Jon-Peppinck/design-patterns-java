package structural.bridge;

public class ProductManagement extends BusinessLogic {
  public ProductManagement(Bridge_DataBase database) {
    super(database);
  }

  @Override
  public void performOperation(String query) {
    database.connect();
    database.executeQuery(query);
    database.disconnect();
  }
}
