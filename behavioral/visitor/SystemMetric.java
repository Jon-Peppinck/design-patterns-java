package behavioral.visitor;

public class SystemMetric implements DataSource {
  private double cpuUsage;

  public SystemMetric(double cpuUsage) {
    this.cpuUsage = cpuUsage;
  }

  public double getCpuUsage() {
    return cpuUsage;
  }

  @Override
  public void accept(Visitor_report visitor) {
    visitor.visit(this);
  }
}
