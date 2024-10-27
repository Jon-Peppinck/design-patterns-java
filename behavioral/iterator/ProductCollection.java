package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
  private List<Product> products;

  public ProductCollection() {
    this.products = new ArrayList<>();
  }

  public void addProduct(Product product) {
    products.add(product);
  }

  public Iterator_product iterator() {
    return new ProductCollectionIterator(products);
  }
}