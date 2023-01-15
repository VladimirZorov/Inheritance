package hero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        int level = Integer.parseInt(scanner.nextLine());

        MuseElf museElf = new MuseElf(username, level);

        System.out.println(museElf.getUsername() + " "+ museElf.getLevel());
    }
}
