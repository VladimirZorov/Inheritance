package zoo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        Lizard lizard = new Lizard(name);
        Snake snake  = new Snake(name);
        Bear bear = new Bear(name);
        Gorilla gorilla = new Gorilla(name);

        System.out.println(lizard.getName() + snake.getName() +
                bear.getName() + gorilla.getName());
    }
}
