package behavioral.templatemethod;

public class JsonDataProcessor extends TemplateMethod_dataProcessor {

  @Override
  protected void readData() {
    System.out.println("Reading data from a JSON file.");
  }

  @Override
  protected void validateData() {
    System.out.println("Validating JSON data.");
  }

  @Override
  protected void transformData() {
    System.out.println("Transforming JSON data.");
  }

  // Uses the default saveData method
}
