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
        ArrayList<Storage> storages = new ArrayList<>();

        Scanner enterLogin = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String login = enterLogin.nextLine();

        if(isAuth = login.equals("Admin")){
            System.out.println("Что хотите сделать с товаром? Введите название одного из вариантов:\n 1.Добавить\n 2.Изменить");
            Scanner variant = new Scanner(System.in);
            String selectedVariant = variant.nextLine();
            System.out.println("Выбранный вариант: " + selectedVariant + " товар");
        } else{
            System.out.println("Список всех товаров и информации о них\n" + products);
        }
    }
}