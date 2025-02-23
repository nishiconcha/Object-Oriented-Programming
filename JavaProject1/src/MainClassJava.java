public class MainClassJava {
    public static void main(String[] args) {
        // For Person Class
        System.out.println("---- Person Class ----");
        Person p1 = new Person("Nishi", 19, "San Juan City");
        Person p2 = new Person("Leonnah", 18, "Paco Manila");
        Person p3 = new Person("Armeyah", 19, "San Juan City");
        Person p4 = new Person("Ari", 20, "Mandaluyong City");
        Person p5 = new Person("Deanne", 22, "San Juan City");

        p1.displayInfo();
        p2.displayInfo();
        p3.displayInfo();
        p4.displayInfo();
        p5.displayInfo();

        // For Dog Class
        System.out.println("\n---- Dog Class ----");
        Dog d1 = new Dog("Fifi", "Shitzu");
        Dog d2 = new Dog("Snowy", "Half Shitzu & Half-Puddle");
        Dog d3 = new Dog("Kira", "Golden Retriever");
        Dog d4 = new Dog("River", "Husky");

        d1.displayInfo();
        d2.displayInfo();
        d3.displayInfo();
        d4.displayInfo();

        // For Rectangle Class
        System.out.println("\n---- Rectangle Class ----");
        Rectangle rect = new Rectangle(5.0, 10.0);
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
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

    public void displayInfo() {
        System.out.println("Name: " + name + "\t Age: " + age + "\t Address: " + address);
    }
}


class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void displayInfo() {
        System.out.println("Dog Name: " + name + "\t Breed: " + breed);
    }
}


class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}