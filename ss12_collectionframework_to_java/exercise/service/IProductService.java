package ss12_collectionframework_to_java.exercise.service;

import ss12_collectionframework_to_java.exercise.model.Product;

import java.util.List;

public interface IProductService {
    void setProduct(int id, String productName);

    void removeProduct(int id);

    void findProductName(String productName);

    void sortAscending();

    void sortDescending();

    void addProduct(Product product);

    List<Product> findAll();
}
