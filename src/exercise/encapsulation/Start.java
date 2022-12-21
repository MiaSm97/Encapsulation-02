package exercise.encapsulation;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();

        System.out.println("Insert your name");
        person.setName(scanner.nextLine());

        System.out.println("Insert your surname");
        person.setSurname(scanner.nextLine());

        System.out.println("Insert your height");
        person.setHeight(scanner.nextDouble());

        System.out.println("Insert your age");
        person.setAge(scanner.nextInt());

        System.out.printf("Name: " + person.getName() + "\n");
        System.out.printf("Surname: " + person.getSurname() + "\n");
        System.out.printf("Height: " + person.getHeight() + "\n");
        System.out.printf("Age: " + person.getAge());
    }
}