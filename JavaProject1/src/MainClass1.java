import java.util.Scanner;

public class MainClass1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Choose an option ---");
            System.out.println("(1) Add Person's Details");
            System.out.println("(2) Add Dog's Details");
            System.out.println("(3) Rectangle Calculator");
            System.out.println("(4) Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
            
            	// For Person Details
                case 1:
                    System.out.println("\nEnter details for 5 people:");
                    Person[] people = new Person[5];
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter address: ");
                        String address = scanner.nextLine();
                        System.out.print("\n");
                        people[i] = new Person(name, age, address);
                    }

                    System.out.println("\n--- Person Details ---");
                    for (Person p : people) {
                        p.display();
                    }
                    break;

                
                // For Dog Details
                case 2:
                    System.out.println("\nEnter details for 2 dogs:");
                    Dog[] dogs = new Dog[2];
                    for (int i = 0; i < 2; i++) {
                        System.out.print("Enter dog name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter breed: ");
                        String breed = scanner.nextLine();
                        dogs[i] = new Dog(name, breed);
                    }

                    System.out.println("\n--- Dog Details ---");
                    for (Dog d : dogs) {
                        d.display();
                    }

                    // Ask user if they want to modify Dog attributes
                    System.out.print("\nDo you want to modify dog details? (y/n): ");
                    String modifyChoice = scanner.nextLine();
                    if (modifyChoice.equalsIgnoreCase("y")) {
                        for (int i = 0; i < 2; i++) {
                            System.out.println("\nModify details for Dog " + (i + 1) + ":");
                            System.out.print("Enter new name: ");
                            String newName = scanner.nextLine();
                            System.out.print("Enter new breed: ");
                            String newBreed = scanner.nextLine();
                            dogs[i].setName(newName);
                            dogs[i].setBreed(newBreed);
                        }

                        System.out.println("\n--- Updated Dog Details ---");
                        for (Dog d : dogs) {
                            d.display();
                        }
                    }
                    break;

                  
                // For Rectangle Calculator
                case 3:
                    System.out.print("\nEnter width of the rectangle: ");
                    double width = scanner.nextDouble();
                    System.out.print("Enter height of the rectangle: ");
                    double height = scanner.nextDouble();

                    Rectangle rect = new Rectangle(width, height);
                    System.out.println("\n--- Rectangle Details ---");
                    System.out.println("Width: " + rect.getWidth());
                    System.out.println("Height: " + rect.getHeight());
                    System.out.println("Area: " + rect.calculateArea());
                    System.out.println("Perimeter: " + rect.calculatePerimeter());
                    break;

                    
                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("\nInvalid choice, please try again.");
            }
        } while (choice != 4);

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
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
    }
}


class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void display() {
        System.out.println("Dog Name: " + name + ", Breed: " + breed);
    }
}


class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}
