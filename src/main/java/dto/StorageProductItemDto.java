package dto;

public class StorageProductItemDto {
    private int id;
    private int count;
    private int price;
    private String name;

    public StorageProductItemDto(int id, int count, int price, String name) {
        this.id = id;
        this.count = count;
        this.price = price;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
