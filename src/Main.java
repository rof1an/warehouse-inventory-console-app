import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isAuth = false;

        ArrayList<Product> products = new ArrayList<>(Arrays.asList(
                new Product("Snickers", 500),
                new Product("Mars", 450)
        ));
        ArrayList<Storage> storages = new ArrayList<>(Arrays.asList(
                new Storage("Qwerty", "Moscow", 1001, products),
                new Storage("ZXC", "Aktau", 1002, products)
        ));

        Scanner enterLogin = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String login = enterLogin.nextLine();

        if (isAuth = login.equals("Admin")) {
            System.out.println("Что хотите сделать с товаром? Введите название одного из вариантов:\n 1.Добавить\n 2.Изменить");
            Scanner variant = new Scanner(System.in);
            String selectedVariant = variant.nextLine();
            System.out.println("Выбранный вариант: " + selectedVariant + " товар");

            System.out.println("Введите название нужного склада: ");
            Scanner selectStorageInput = new Scanner(System.in);
            String selectedStorage = selectStorageInput.nextLine();

            Storage foundStorage = findStorageByName(storages, selectedStorage);
            System.out.println(foundStorage);

            Scanner inputProductInfo = new Scanner(System.in);
            System.out.println("Введите название нового продукта: ");
            String productName = inputProductInfo.nextLine();
            System.out.println("Введите цену нового продукта: ");
            int productPrice = inputProductInfo.nextInt();
            Product newProduct = new Product(productName, productPrice);

            assert foundStorage != null;
            foundStorage.addProductsInStorage(newProduct);

            System.out.println("Новый список продуктов на этом складе: " + products);
        } else {
            System.out.println("Список всех товаров и информации о них\n" + products);
        }
    }

    private static Storage findStorageByName(ArrayList<Storage> storages, String storageName) {
        for (Storage storage : storages) {
            if (storage.getStorageName().equals(storageName)) {
                return storage;
            }
        }
        return null;
    }
}