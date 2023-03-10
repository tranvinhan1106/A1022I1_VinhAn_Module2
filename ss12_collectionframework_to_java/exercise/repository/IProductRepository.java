package ss12_collectionframework_to_java.exercise.repository;

import ss12_collectionframework_to_java.exercise.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void setProduct(int id, String productName);

    Product removeProduct(int id);

    void findProductName(String productName);

    void sortAscending();

    void sortDescending();

    void addProduct(Product product);

    void sortDescending(Product product);
}
