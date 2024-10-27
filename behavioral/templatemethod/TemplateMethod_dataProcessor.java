package behavioral.templatemethod;

/*
  Common use cases of the template method design pattern in web development:
    1. Data Processing Pipelines
    2. API Request Handling
    3. User Authentication Flows
*/

public abstract class TemplateMethod_dataProcessor {
  public final void process() {
    readData();
    validateData();
    transformData();
    saveData();
  }

  protected abstract void readData();

  protected abstract void validateData();

  protected abstract void transformData();

  protected void saveData() {
    System.out.println("Saving data to the default storage.");
  }
}