class Person {
    // Attributes
    private String name;
    private int age;
    private String address;

    // Constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public String getAddress() {
        return address;
    }
}

public class PersonClass {
    public static void main(String[] args) {
        // Creating five instances of the Person class
    	Person p1 = new Person("Nishi", 19, "San Juan City");
        Person p2 = new Person("Leonnah", 18, "Paco Manila");
        Person p3 = new Person("Armeyah", 19, "San Juan City");
        Person p4 = new Person("Ari", 20, "Mandaluyong City");
        Person p5 = new Person("Deanne", 22, "San Juan City");

        // Printing names and ages
        System.out.println("--- Personal Details ---");
        System.out.println("Name: " + p1.getName() + "\t  Age: " + p1.getAge() + " years old" + "\t  Address: " + p1.getAddress());
        System.out.println("Name: " + p2.getName() + "\t  Age: " + p2.getAge() + " years old" + "\t  Address: " + p1.getAddress());
        System.out.println("Name: " + p3.getName() + "\t  Age: " + p3.getAge() + " years old" + "\t  Address: " + p1.getAddress());
        System.out.println("Name: " + p4.getName() + "\t  Age: " + p4.getAge() + " years old" + "\t  Address: " + p1.getAddress());
        System.out.println("Name: " + p5.getName() + "\t  Age: " + p5.getAge() + " years old" + "\t  Address: " + p1.getAddress());
    }
}
