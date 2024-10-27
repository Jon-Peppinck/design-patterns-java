package behavioral.templatemethod;

public class CsvDataProcessor extends TemplateMethod_dataProcessor {

  @Override
  protected void readData() {
    System.out.println("Reading data from a CSV file.");
  }

  @Override
  protected void validateData() {
    System.out.println("Validating CSV data.");
  }

  @Override
  protected void transformData() {
    System.out.println("Transforming CSV data.");
  }

  @Override
  protected void saveData() {
    System.out.println("Saving CSV data to a database.");
  }
}