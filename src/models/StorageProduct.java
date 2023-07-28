package models;

public class StorageProduct {
    private int storageId;
    private int productId;
    private int productCount;

    public StorageProduct(int storageId, int productId, int productCount) {
        this.storageId = storageId;
        this.productId = productId;
        this.productCount = productCount;
    }

    public int getStorageId(){
        return storageId;
    }
    public void setStorageId(int id){
        storageId = id;
    }

    public int getProductId(){
        return productId;
    }
    public void setProductId(int id){
        productId = id;
    }

    public int getProductCount() {
        return productCount;
    }
    public void setProductCount(int count) {
        this.productCount = count;
    }
}
