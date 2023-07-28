package repository;

import models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProductRepository {
    private static List<Product> productList = initializeData();

    public static List<Product> initializeData(){
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(new Product("Молоко", 450, 1));
        productList.add(new Product("Сахар", 250, 2));
        productList.add(new Product("Печенья", 550, 3));

        return productList;
    }

    public List<Product> getAll() {
        return productList;
    }

    public Optional<Product> getById(int id) {
        return productList
                .stream()
                .filter(p -> p.getProductId() == id)
                .findFirst();
    }

    public void add() {
    }

    public static List<Product> filterPriceMore(int price) {
        return productList
                .stream()
                .filter(p -> p.getProductCost() > price)
                .collect(Collectors.toList());
    }
}
