package structural.composite;

// Leaf (Individual permission)
public class Permission extends PermissionComponent {
  private final String name;

  public Permission(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public boolean checkPermission(String permission) {
    return name.equalsIgnoreCase(permission);
  }
}