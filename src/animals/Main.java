package animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("Beast!")) {
            String [] data = scanner.nextLine().split(" ");
            switch (input) {
                case "Dog":
                    Dog dog = new Dog(data[0],Integer.parseInt(data[1]),data[2]);
                    System.out.println(input);
                    System.out.printf("%s %d %s%n", dog.getName(), dog.getAge(),dog.getGender());
                    System.out.println(dog.produceSound());
                    break;
                case "Cat":
                    break;
                case "Frog":
                    break;
                case "Kitten":
                    break;
                case "Tomcat":
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
