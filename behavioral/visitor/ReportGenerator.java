package behavioral.visitor;

public class ReportGenerator implements Visitor_report {
  @Override
  public void visit(UserActivity userActivity) {
    System.out.println("User Activity Report: Login Count = " + userActivity.getLoginCount());
  }

  @Override
  public void visit(SalesRecord salesRecord) {
    System.out.println("Sales Record Report: Total Sales = $" + salesRecord.getTotalSales());
  }

  @Override
  public void visit(SystemMetric systemMetric) {
    System.out.println("System Metric Report: CPU Usage = " + systemMetric.getCpuUsage() + "%");
  }
}
