package behavioral.visitor;

/*
  Common use cases of the visitor design pattern in web development:
    1. Rendering Different Types of Content (CMS)
    2. Processing Different User Actions
    3. Reporting and Analytics
*/

public interface Visitor_report {
  void visit(UserActivity userActivity);

  void visit(SalesRecord salesRecord);

  void visit(SystemMetric systemMetric);
}
