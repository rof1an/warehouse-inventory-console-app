package menu;

import java.util.List;
import java.util.Scanner;

import models.Product;
import models.Storage;
import models.StorageProduct;
import service.ProductService;
import service.StorageProductService;
import service.StorageService;

public class Menu {
    private static Scanner scan = new Scanner(System.in);
    private static ProductService productService = new ProductService();
    private static StorageService storageService = new StorageService();
    private static StorageProductService storageProductService = new StorageProductService();

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
            System.out.println( "Что нужно показать? \n 1.Все склады \n 2.Список продуктов на складе \n 3.Список всех продуктов \n 4.Добавить склад \n 5.Добавить продукт");
            switch (scan.nextInt()) {
                case (1):
                    showAllStorages(storageService);
                    break;
                case (2):
                    showProductsInStorage();
                    break;
                case (3):
                    getAllProducts(productService);
                    break;
                case(4):
                    addNewStorage();
                    break;
                case(5):
                    addNewProduct();
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
        for (Product product : productList) {
            System.out.printf("%d\t\t\t%s\t\t\t%s\n", product.getProductId(), product.getProductName(), product.getProductCost());
        }
    }

    public void addNewStorage(){
        System.out.println("Название склада: \n");
        scan.nextLine();
        String name = scan.nextLine();

        System.out.println("Адрес склада: \n");
        String address = scan.nextLine();

        System.out.println("Id склада: \n");
        String strId = scan.nextLine();
        int id = Integer.parseInt(strId);

        storageService.addNewStorage(name, address, id);
    }

    public void addNewProduct(){
        System.out.println("Название продукта:");
        scan.nextLine();
        String name = scan.nextLine();

        System.out.println("Цена продукта:");
        int cost = scan.nextInt();

        System.out.println("Id продукта:");
        int id = scan.nextInt();

        productService.addProduct(name, cost, id);
    }

    public static void showProductsInStorage() {
        List<StorageProduct> storageProductList = storageProductService.getProductStorageList();

        System.out.println("st. id\t\tpr. id\t\tcount");
        for (StorageProduct stProduct : storageProductList) {
            System.out.printf("%d\t\t\t%d\t\t\t%d\n", stProduct.getStorageId(), stProduct.getProductId(), stProduct.getProductCount());
        }
    }
}
