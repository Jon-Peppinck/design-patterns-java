package behavioral.state;

/*
  Common use cases of the state design pattern in web development:
    1. Workflow Management
    2. Order Processing System
    3. User Authentication
*/

public interface State_document {
  void edit(TheDocument document);

  void review(TheDocument document);

  void publish(TheDocument document);
}
