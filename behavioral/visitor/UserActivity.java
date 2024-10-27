package behavioral.visitor;

public class UserActivity implements DataSource {
  private int loginCount;

  public UserActivity(int loginCount) {
    this.loginCount = loginCount;
  }

  public int getLoginCount() {
    return loginCount;
  }

  @Override
  public void accept(Visitor_report visitor) {
    visitor.visit(this);
  }
}