package restaurant;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String newName = scanner.nextLine();
        BigDecimal priceNew = BigDecimal.valueOf(Integer.parseInt(scanner.nextLine()));


        Salmon salmon = new Salmon("taranka", priceNew);

    }
}
