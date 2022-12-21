package exercise.encapsulation;

import lombok.Data;

@Data
public class Person {
        String name;
        String surname;
        double height;
        int age;

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John ");
        person.setSurname("Doe");
        person.setHeight(1.80);
        person.setAge(34);
        System.out.println(person.getName() + person.getSurname() + ": height " +  person.getHeight() + ", age " + person.getAge());
    }
}

    /*achieve encapsulation for a class Person that has the following attributes:
        name
        surname
        height (a double)
        age
        ask the user to input the values
        then print all the details of the Person
        when printing the height, use just 2 decimal places (e.g. the result could be 5.50)*/
