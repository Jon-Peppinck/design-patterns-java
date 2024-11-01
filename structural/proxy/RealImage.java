package structural.proxy;

public class RealImage implements IImage {
  private final String filename;

  public RealImage(String filename) {
    this.filename = filename;
    loadImageFromDisk();
  }

  private void loadImageFromDisk() {
    System.out.println("Loading " + filename);
  }

  @Override
  public void display() {
    System.out.println("Displaying " + filename);
  }
}