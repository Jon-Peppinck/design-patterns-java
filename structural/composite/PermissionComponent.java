package structural.composite;

// Component (abstract base class)
public abstract class PermissionComponent {
  public void add(PermissionComponent permissionComponent) {
    throw new UnsupportedOperationException();
  }

  public void remove(PermissionComponent permissionComponent) {
    throw new UnsupportedOperationException();
  }

  public String getName() {
    throw new UnsupportedOperationException();
  }

  public boolean checkPermission(String permission) {
    throw new UnsupportedOperationException();
  }
}
