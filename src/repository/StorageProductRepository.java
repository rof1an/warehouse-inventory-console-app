package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StorageProductRepository {
    private static List<models.StorageProduct> productList = initializeData();

    public static ArrayList<models.StorageProduct> initializeData(){
        ArrayList<models.StorageProduct> list = new ArrayList<>();
        list.add(new models.StorageProduct(1, 1, 50));
        return list;
    }

    public static List<models.StorageProduct> getAll(){
        return productList;
    }

    public static Optional<models.StorageProduct> getByProductId(int id){
        return productList
                .stream()
                .filter(p -> p.getProductId() == id)
                .findFirst();
    }

    public static void add(){}

    public static void test(){
        Optional<models.StorageProduct> product = getByProductId(2);
        if(product.isPresent()){
            models.StorageProduct productData = product.get();
        }
    }
}
