package repository;

import models.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProductRepository {
    private static List<Product> productList = initializeData();

    public static List<Product> initializeData() {
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(new Product("Молоко", 450, 1));
        productList.add(new Product("Сахар", 250, 2));
        productList.add(new Product("Печенья", 550, 3));

        return productList;
    }

    public List<Product> getProducts() {
        return productList;
    }

    public Optional<Product> getById(int id) {
        return productList
                .stream()
                .filter(p -> p.getProductId() == id)
                .findFirst();
    }

    public int getMaxProductId(){
        return productList.stream()
                .mapToInt(Product::getProductId)
                .max()
                .orElse(0);
    };

    public Product addProduct(String name, int cost) {
        int id = getMaxProductId() + 1;
        Product newProduct = new Product(name, cost, id);
        productList.add(newProduct);
        return newProduct;
    };

    public static List<Product> filterPriceMore(int price) {
        return productList
                .stream()
                .filter(p -> p.getProductCost() > price)
                .collect(Collectors.toList());
    }
}
