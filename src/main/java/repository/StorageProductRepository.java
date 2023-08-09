package repository;

import models.StorageProduct;
import java.util.ArrayList;
import java.util.List;

public class StorageProductRepository {
    private static List<StorageProduct> storageProduct = initializeData();

    public static ArrayList<StorageProduct> initializeData() {
        ArrayList<StorageProduct> storageProductList = new ArrayList<>();
        storageProductList.add(new StorageProduct(1, 1, 500));
        storageProductList.add(new StorageProduct(1, 2, 300));
        storageProductList.add(new StorageProduct(2, 3, 470));

        return storageProductList;
    }

    public static List<StorageProduct> getProductsInStorages() {
        return storageProduct;
    }
}
