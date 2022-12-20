package exercise.encapsulation;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        person.setName(scanner.nextLine());
        person.setSurname(scanner.nextLine());
        person.setHeight(scanner.nextDouble());
        person.setAge(scanner.nextInt());
        System.out.println("Name: " + person.getName());
        System.out.println("Surname: " + person.getSurname());
        System.out.println("Height: " + person.getHeight());
        System.out.println("Age: " + person.getAge());
    }

}
