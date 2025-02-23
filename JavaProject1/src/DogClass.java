class Dog {
    // Attributes
    private String name;
    private String breed;

    // Constructor
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}


public class DogClass {
    public static void main(String[] args) {
        // Creating two instances of the Dog class
        Dog d1 = new Dog("FiFi", "Shitzu");
        Dog d2 = new Dog("Snowy", "Shitzu & Puddle");
        
        System.out.println("\n--- Dog Details ---");
        System.out.println("Name: " + d1.getName() + "\t  Breed: " + d1.getBreed());
        System.out.println("Name: " + d2.getName() + "\t  Breed: " + d2.getBreed());
        
        // Modifying attributes using setter methods
        d1.setName("Charlie");
        d1.setBreed("Labrador");

        d2.setName("Rocky");
        d2.setBreed("German Shepherd");

        // Printing updated values
        System.out.println("\n--- Updated Details ---");
        System.out.println("Name: " + d1.getName() + "\t  Breed: " + d1.getBreed());
        System.out.println("Name: " + d2.getName() + "\t  Breed: " + d2.getBreed());
    }
}