package EV2.Tema9Act;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<>();
        Clothes shirt = new Clothes(1, 10, "shirt", "L", "White");
        productList.add(shirt);
        Clothes pants = new Clothes(2, 20, "pants", "M", "Black");
        productList.add(pants);
        Books book1 = new Books(8, 10, "Brandon Sanderson", "Oathbringer");
        productList.add(book1);
        Books book2 = new Books(9, 15, "Fonda Lee", "Jade City");
        productList.add(book2);

        System.out.println(shirt.toString());
        System.out.println(pants.toString());
        System.out.println(book1);
        System.out.println(book2);
    }
}
