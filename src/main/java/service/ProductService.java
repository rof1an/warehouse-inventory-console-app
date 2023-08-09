package service;

import models.Product;
import repository.ProductRepository;
import java.util.List;
import java.util.Optional;

public class ProductService {
    private ProductRepository productRepository = new ProductRepository();

    public Optional<Product> getById(int id) {
        Optional<Product> product = productRepository.getById(id);
        return product;
    }

    public List<Product> getAllProducts() {
        return productRepository.getProducts();
    }

    public void addProduct(String name, int cost) {
        productRepository.addProduct(name, cost);
    }
}
