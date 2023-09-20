import Model.Animal;
import Model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        List<Person> people1 = new ArrayList<>();
        Person person = new Person(67, "Sam");
        Person person1 = new Person(56, "Alice");
        people1.add(person);
        people1.add(person1);
        GenericInterfaceImpl<Person> genericInterface1 = new GenericInterfaceImpl<>(people1);


        List<Animal> animals = new ArrayList<>();
        Animal animal = new Animal("Bruno", 78);
        Animal animal1 = new Animal("Elli", 88);
        animals.add(animal);
        animals.add(animal1);
        GenericInterfaceImpl<Animal> genericInterface11 = new GenericInterfaceImpl<>(animals);


        Scanner scanner = new Scanner(System.in);
        int choice;


        do {

            System.out.println("1. Get animal or person by id");
            System.out.println("2. Get all");
            System.out.println("3. Sort by name");
            System.out.println("4. Clear");
            System.out.println("5. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Put id of person: ");
                    int nn = scanner.nextInt();
                    System.out.println(genericInterface11.getById(nn));
                    System.out.print("Put id for animal: ");
                    int u = scanner.nextInt();
                    System.out.println(genericInterface1.getById(u));
                    break;
                case 2:
                    System.out.println("My persons: ");
                    genericInterface11.getAll();
                    System.out.println("My animals: ");
                    genericInterface1.getAll();
                    break;
                case 3:
                    System.out.print("Write 1 to ascending the persons: ");
                    int num = scanner.nextInt();
                    System.out.println(genericInterface1.sortByName(num));
                    System.out.print("Write 2 to descend the persons: ");
                    int h = scanner.nextInt();
                    System.out.println(genericInterface1.sortByName(h));
                    System.out.print("Write 1 to ascending the animal: ");
                    int j = scanner.nextInt();
                    System.out.println(genericInterface11.sortByName(j));
                    System.out.print("Write 2 to descending the animal: ");
                    int k = scanner.nextInt();
                    System.out.println(genericInterface11.sortByName(k));
                    break;
                case 4:
                    genericInterface1.clear();
                    genericInterface11.clear();
                    break;
                case 5:
                    break;



            }


        } while (choice != 5) ;
        System.out.println("Exciting.....");
    }
}


