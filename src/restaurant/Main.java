package restaurant;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String newName = scanner.nextLine();
        BigDecimal priceNew = BigDecimal.valueOf(Integer.parseInt(scanner.nextLine()));


        Salmon salmon = new Salmon("taranka", priceNew);
        Cake cake = new Cake(newName);
        Coffee coffee = new Coffee("moka",priceNew, 85, 30);
        Tea tea = new Tea(newName, priceNew, 150);
        Soup soup = new Soup("ribenaChorba", priceNew, 300);


        System.out.println("Total price is:" + salmon.getName());

    }
}
