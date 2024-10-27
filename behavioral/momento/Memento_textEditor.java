package behavioral.momento;

/*
  Common use cases of the memento design pattern in web development:
    1. Text Editor Undo Functionality
    2. Game State Saving
    3. Form Data Persistence
*/

// Memento class that stores the state of the text editor
public class Memento_textEditor {
  private final String content;

  public Memento_textEditor(String content) {
    this.content = content;
  }

  public String getContent() {
    return content;
  }
}
