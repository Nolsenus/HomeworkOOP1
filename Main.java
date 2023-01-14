import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void printProductsInfo(List<Product> products) {
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        List<Product> products = new LinkedList<>();
        products.add(new Bread("Хлебный дом", 74, 1000, "уп.", 14, "пшеничная"));
        products.add(new Milk("Простоквашино", 90, 500, "уп.", 930, 7, 2.5f));
        products.add(new Lemonade("Добрый кола", 120, 1500, "уп.", 180, 2000));
        products.add(new Eggs("Синявино", 80, 1000, "уп.", 14, 10));
        products.add(new Mask("Медмаск", 100, 200, "уп.", 10));
        products.add(new ToiletPaper("Zewa", 130, 400, "уп.", 4, 3));
        products.add(new Diapers("Pampers", 200, 200, "уп.", 20, "L", 5, 25, "дневные"));
        products.add(new Pacifier("Счастливый ребёнок", 150, 100, "шт.", 0, true));
        printProductsInfo(products);
    }
}
