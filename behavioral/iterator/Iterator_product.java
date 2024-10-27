package behavioral.iterator;

/*
  Common use cases of the iterator design pattern in web development:
    1. Pagination in APIs
    2. Database Query Results
    3. User Sessions in a Web Application
*/

public interface Iterator_product {
  boolean hasNext();

  Product next();
}
