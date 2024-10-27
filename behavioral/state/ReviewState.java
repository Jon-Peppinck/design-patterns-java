package behavioral.state;

public class ReviewState implements State_document {
  @Override
  public void edit(TheDocument document) {
    System.out.println("Document is under review; cannot edit.");
  }

  @Override
  public void review(TheDocument document) {
    System.out.println("Already in review.");
  }

  @Override
  public void publish(TheDocument document) {
    System.out.println("Publishing the document...");
    document.setState(new PublishedState());
  }
}
