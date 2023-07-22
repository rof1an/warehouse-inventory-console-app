import java.util.ArrayList;

public class Storage {
    String storageName;
    String storageLocation;
    int storageId;
    ArrayList<Product> products;

    public Storage(String storageName, String storageLocation, int storageId, ArrayList<Product> products) {
        this.storageId = storageId;
        this.storageLocation = storageLocation;
        this.storageName = storageName;
        this.products = products;
    }

    public String getStorageName() {
        return storageName;
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public int getStorageId() {
        return storageId;
    }

    public void addProductsInStorage(Product product){
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "название склада = '" + storageName + '\'' +
                ", расположение склада = '" + storageLocation + '\'' +
                ", айди склада = " + storageId;
    }
}
