import models.Product;
import models.Storage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isAuth = false;

        ArrayList<Product> products = new ArrayList<>(Arrays.asList(
                new Product("Snickers", 300, 1),
                new Product("Mars", 350, 2)
        ));
        ArrayList<Storage> storages = new ArrayList<>(Arrays.asList(
                new Storage("Qwerty", "Moscow", 1001),
                new Storage("ZXC", "Aktau", 1002)
        ));
    }
}