package service;

import model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    void save(Product product);

    Product findById(int id);

    void delete(int id);

    void upDate(int id, Product product);

    Product findByName(String name);
}
