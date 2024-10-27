package structural.bridge;

public abstract class BusinessLogic {
  protected Bridge_DataBase database;

  protected BusinessLogic(Bridge_DataBase database) {
    this.database = database;
  }

  public abstract void performOperation(String query);
}