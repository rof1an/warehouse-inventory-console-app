package models;

public class Product {
    private int productId;
    private int productCost;
    private String productName;


    public Product(String productName, int productCost, int productId) {
        this.productName = productName;
        this.productCost = productCost;
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String name) {
        this.productName = name;
    }

    public int getProductCost() {
        return productCost;
    }

    public void setProductCost(int cost) {
        this.productCost = cost;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int id) {
        productId = id;
    }
}
