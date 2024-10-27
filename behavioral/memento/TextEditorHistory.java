package behavioral.momento;

import java.util.ArrayList;
import java.util.List;

public class TextEditorHistory {
  private final List<Memento_textEditor> history = new ArrayList<>();
  private int current = -1;

  public void save(TextEditor editor) {
    // Clear the history if we are not at the end
    if (current < history.size() - 1) {
      history.subList(current + 1, history.size()).clear();
    }
    history.add(editor.save());
    current++;
  }

  public void undo(TextEditor editor) {
    if (current > 0) {
      current--;
      editor.restore(history.get(current));
    }
  }

  public void redo(TextEditor editor) {
    if (current < history.size() - 1) {
      current++;
      editor.restore(history.get(current));
    }
  }
}
