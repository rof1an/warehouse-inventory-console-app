package menu;

import models.Product;
import models.Storage;
import service.ProductService;
import service.StorageService;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private Scanner scan = new Scanner(System.in);
    private ProductService productService = new ProductService();
    private StorageService storageService = new StorageService();

    public void getStorageId() {
        while (true) {
            System.out.println("Введите id склада");
            // todo сделать вывод всех складов
            String strId = scan.nextLine();
            productService.getById(strId);
        }
    }

    public void start() {
        while (true) {
            System.out.println("Что нужно показать?: \n 1.Все склады. \n 2.Список продуктов на складе. \n 3.Список всех продуктов");
            switch (scan.nextInt()) {
                case (1):
                    showAllStorages(storageService);
                    break;
                case (3):
                    getAllProducts(productService);
                    break;
            }
        }
    }

    public static void showAllStorages(StorageService storageService) {
        List<Storage> storageList = storageService.getStorages();
        System.out.println("id\t\t\tname\t\t\taddress");
        for (Storage st : storageList) {
            System.out.printf("%d\t\t\t%s\t\t\t%s\n", st.getStorageId(), st.getStorageName(), st.getStorageLocation());
        }
    }

    public static void getAllProducts(ProductService productService) {
        List<Product> productList = productService.getAllProducts();
        System.out.println("id\t\t\tname\t\t\tcost");
        for (Product product : productList){
            System.out.printf("%d\t\t\t%s\t\t\t%s\n", product.getProductId(), product.getProductName(), product.getProductCost());
        }
    }
}
