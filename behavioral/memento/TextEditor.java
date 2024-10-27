package behavioral.memento;

public class TextEditor {
  private String content;

  public TextEditor() {
    this.content = "";
  }

  public void addText(String text) {
    content += text;
  }

  public String getContent() {
    return content;
  }

  // Create a memento to save the current state
  public Memento_textEditor save() {
    return new Memento_textEditor(content);
  }

  // Restore the state from a memento
  public void restore(Memento_textEditor memento) {
    this.content = memento.getContent();
  }
}
