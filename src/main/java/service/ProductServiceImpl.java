package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> productMap;

    static {
        productMap = new HashMap<>();
        productMap.put(1, new Product(1, "MouseTP01", 149000, "Trung Quốc"));
        productMap.put(2, new Product(2, "MouseTP02", 249000, "Mỹ"));
        productMap.put(3, new Product(3, "Display 14inch", 1439000, "Viet Nam"));
        productMap.put(4, new Product(4, "Ram 1366 4GB", 549000, "Indonesia"));
        productMap.put(5, new Product(5, "HDD 500G", 499000, "Hàn Quốc"));
        productMap.put(6, new Product(6, "SSD 256GB", 949000, "Nhật Bản" ));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void delete(int id) {
        productMap.remove(id);
    }

    @Override
    public void upDate(int id, Product product) {
        productMap.put(id, product);
    }
    public Product findByName(String name){
        return productMap.get(name);
    }
}
