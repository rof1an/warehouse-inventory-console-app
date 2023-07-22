public class Product {
    String productName;
    int productPrice;


    public Product(String productName, int productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String newName) {
        this.productName = newName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int newProductPrice) {
        this.productPrice = newProductPrice;
    }


    @Override
    public String toString() {
        return "Название товара = " + productName +
                "\n Цена товара " + productName + " за шт. = " + productPrice + "\n";
    }
}
