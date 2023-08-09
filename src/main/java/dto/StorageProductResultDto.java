package dto;

import models.Product;
import models.Storage;

public class StorageProductResultDto {
    private Storage storage;
    private Product product;
    private int count;

    public StorageProductResultDto(Storage storage, Product product, int count) {
        this.storage = storage;
        this.product = product;
        this.count = count;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

