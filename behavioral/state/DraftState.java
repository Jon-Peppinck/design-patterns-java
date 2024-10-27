package behavioral.state;

public class DraftState implements State_document {
  @Override
  public void edit(TheDocument document) {
    System.out.println("Editing the draft...");
  }

  @Override
  public void review(TheDocument document) {
    System.out.println("Submitting draft for review...");
    document.setState(new ReviewState());
  }

  @Override
  public void publish(TheDocument document) {
    System.out.println("Draft must be reviewed before publishing.");
  }
}
