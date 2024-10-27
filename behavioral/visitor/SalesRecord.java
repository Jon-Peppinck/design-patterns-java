package behavioral.visitor;

public class SalesRecord implements DataSource {
  private double totalSales;

  public SalesRecord(double totalSales) {
    this.totalSales = totalSales;
  }

  public double getTotalSales() {
    return totalSales;
  }

  @Override
  public void accept(Visitor_report visitor) {
    visitor.visit(this);
  }
}
