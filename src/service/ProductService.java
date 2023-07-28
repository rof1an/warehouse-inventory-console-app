package service;

import models.Product;
import repository.ProductRepository;

import java.util.List;
import java.util.Optional;

public class ProductService {
    private ProductRepository productRepository = new ProductRepository();

    public void getById(String strId) {
        int id = Integer.parseInt(strId);
        Optional<Product> product = productRepository.getById(id);
        if (product.isPresent()) {
            System.out.println(product.get());
        } else {
            System.out.printf("Not found with id: %d", id);
        }
    }

    public List<Product> getAllProducts() {
        return productRepository.getAll();
    }

    public void create() {
    }
}
