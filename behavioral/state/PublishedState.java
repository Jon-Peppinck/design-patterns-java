package behavioral.state;

public class PublishedState implements State_document {
  @Override
  public void edit(TheDocument document) {
    System.out.println("Cannot edit published document.");
  }

  @Override
  public void review(TheDocument document) {
    System.out.println("Published document cannot be reviewed.");
  }

  @Override
  public void publish(TheDocument document) {
    System.out.println("Document is already published.");
  }
}
