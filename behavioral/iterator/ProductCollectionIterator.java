package behavioral.iterator;

import java.util.List;

public class ProductCollectionIterator implements Iterator_product {
  private List<Product> products;
  private int currentIndex = 0;

  public ProductCollectionIterator(List<Product> products) {
    this.products = products;
  }

  @Override
  public boolean hasNext() {
    return currentIndex < products.size();
  }

  @Override
  public Product next() {
    if (hasNext()) {
      return products.get(currentIndex++);
    }
    return null; // Or throw an exception
  }
}
