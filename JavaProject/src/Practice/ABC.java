package Practice;

public class ABC
{
	// Abstraction
	abstract class Animal {
	    // Abstract method (does not have a body)
	    public abstract void sound();
	    
	    // Non-abstract method with implementation
	    public void sleep() {
	        System.out.println(getClass().getSimpleName() + " is sleeping.");
	    }
	}

	// Encapsulation with Inheritance
	class Dog extends Animal {
	    private String name;   // Private attribute
	    private String breed;  // Private attribute

	    // Constructor
	    public Dog(String name, String breed) {
	        this.name = name;
	        this.breed = breed;
	    }

	    // Implementation of the abstract method
	    @Override
	    public void sound() {
	        System.out.println("Woof!");
	    }

	    // Getter and Setter methods for encapsulated fields
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getBreed() {
	        return breed;
	    }

	    public void setBreed(String breed) {
	        this.breed = breed;
	    }

	    public void displayInfo() {
	        System.out.println("Dog's Name: " + getName() + ", Breed: " + getBreed());
	    }
	}

	// Inheritance with Encapsulation
	class Cat extends Animal {
	    private String name;   // Private attribute
	    private String color;  // Private attribute

	    // Constructor
	    public Cat(String name, String color) {
	        this.name = name;
	        this.color = color;
	    }

	    // Implementation of the abstract method
	    @Override
	    public void sound() {
	        System.out.println("Meow!");
	    }

	    // Getter and Setter methods for encapsulated fields
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public void displayInfo() {
	        System.out.println("Cat's Name: " + getName() + ", Color: " + getColor());
	    }
	}

	// Polymorphism
	public class Main {
	    public static void makeSound(Animal animal) {
	        animal.sound();
	    }

	    public static void main(String[] args) {
	        Dog dog = new Dog("Buddy", "Golden Retriever");
	        Cat cat = new Cat("Whiskers", "Tabby");

	        // Polymorphism in action
	        makeSound(dog);  // Outputs: Woof!
	        makeSound(cat);  // Outputs: Meow!

	        // Accessing encapsulated data
	        dog.displayInfo();  // Outputs: Dog's Name: Buddy, Breed: Golden Retriever
	        cat.displayInfo();  // Outputs: Cat's Name: Whiskers, Color: Tabby

	        // Using inherited method
	        dog.sleep();  // Outputs: Dog is sleeping.
	        cat.sleep();  // Outputs: Cat is sleeping.
	    }
	}
}

