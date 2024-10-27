package creational.prototype;

public class Book implements Prototype_cloneObject {
  private String title;
  private String author;
  private int pages;

  public Book(String title, String author, int pages) {
    this.title = title;
    this.author = author;
    this.pages = pages;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getPages() {
    return pages;
  }

  @Override
  public Prototype_cloneObject clone() {
    return new Book(this.title, this.author, this.pages);
  }

  @Override
  public String toString() {
    return "Book{" +
        "title='" + title + '\'' +
        ", author='" + author + '\'' +
        ", pages=" + pages +
        '}';
  }
}
