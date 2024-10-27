package behavioral.visitor;

public interface DataSource {
  void accept(Visitor_report visitor);
}
