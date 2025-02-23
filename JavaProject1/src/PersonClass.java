import java.util.Scanner;

public class PersonClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Person Class
        System.out.println("Enter details for 5 people:");
        Person[] people = new Person[5];
        for (int i = 0; i < 5; i++) {
        	
        	// Get name
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            
            // Get age
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            
            // Get address
            System.out.print("Enter address: ");
            String address = scanner.nextLine();
            people[i] = new Person(name, age, address);
        }

        System.out.println("\nPerson Details:");
        for (Person p : people) {
            p.display();
        }
        scanner.close();
    }
}

class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + name + "\t Age: " + age + "\t Address: " + address);
    }
}