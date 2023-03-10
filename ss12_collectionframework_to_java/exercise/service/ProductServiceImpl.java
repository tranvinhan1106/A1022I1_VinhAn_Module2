package ss12_collectionframework_to_java.exercise.service;

import ss12_collectionframework_to_java.exercise.model.Product;
import ss12_collectionframework_to_java.exercise.repository.IProductRepository;
import ss12_collectionframework_to_java.exercise.repository.ProductRepositoryImpl;

import java.util.List;

public class ProductServiceImpl implements IProductService{
    private IProductRepository repository = new ProductRepositoryImpl();
    @Override
    public void setProduct(int id ,String productName){
        repository.setProduct(id,productName);
    }
    @Override
    public void removeProduct(int id){
        repository.removeProduct(id);
    }

    @Override
    public void findProductName(String productName){
        repository.findProductName(productName);
    }

    @Override
    public void sortAscending(){
        repository.sortAscending();
    }

    @Override
    public void sortDescending(){
        repository.sortDescending();
    }

    @Override
    public void addProduct(Product product){
        repository.sortDescending(product);
    }

    @Override
    public List<Product> findAll(){
        return repository.findAll();
    }
}
