package animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("Beast!")) {
            String[] data = scanner.nextLine().split(" ");
            switch (input) {
                case "Dog":
                    try {
                        Dog dog = new Dog(data[0], Integer.parseInt(data[1]), data[2]);
                        System.out.println(dog.toString());
                        System.out.println(dog.produceSound());
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "Cat":
                    try {
                        Cat cat = new Cat(data[0], Integer.parseInt(data[1]), data[2]);
                        System.out.println(cat.toString());
                        System.out.println(cat.produceSound());
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "Frog":
                    try {
                        Frog frog = new Frog(data[0], Integer.parseInt(data[1]), data[2]);
                        System.out.println(frog.toString());
                        System.out.println(frog.produceSound());
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "Kitten":
                    try {
                        Kitten kitten = new Kitten(data[0], Integer.parseInt(data[1]));
                        System.out.println(kitten.toString());
                        System.out.println(kitten.produceSound());
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "Tomcat":
                    try {
                        Tomcat tomcat = new Tomcat(data[0], Integer.parseInt(data[1]));
                        System.out.println(tomcat.toString());
                        System.out.println(tomcat.produceSound());
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
