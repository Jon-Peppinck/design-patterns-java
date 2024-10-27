package structural.composite;

import java.util.ArrayList;
import java.util.List;

/*
  Common use cases of the composite design pattern in web development:
    1. File System Management (API for handling files and folders)
    2. Menu Systems in Content Management Systems (CMS)
    3. Permission or Role Management Systems
*/

// Composite (Composite_role containing multiple permissions and/or sub-roles)
public class Composite_role extends PermissionComponent {
  private final String name;
  private final List<PermissionComponent> components = new ArrayList<>();

  public Composite_role(String name) {
    this.name = name;
  }

  @Override
  public void add(PermissionComponent permissionComponent) {
    components.add(permissionComponent);
  }

  @Override
  public void remove(PermissionComponent permissionComponent) {
    components.remove(permissionComponent);
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public boolean checkPermission(String permission) {
    for (PermissionComponent component : components) {
      if (component.checkPermission(permission)) {
        return true;
      }
    }
    return false;
  }
}