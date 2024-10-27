package behavioral.state;

public class TheDocument {
  private State_document state;

  public TheDocument() {
    // Initial state is Draft
    this.state = new DraftState();
  }

  public void setState(State_document state) {
    this.state = state;
  }

  public void edit() {
    state.edit(this);
  }

  public void review() {
    state.review(this);
  }

  public void publish() {
    state.publish(this);
  }
}
