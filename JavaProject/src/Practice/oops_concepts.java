package Practice;

public class oops_concepts 
{
	// Abstract Class demonstrating Abstraction
	abstract class Animal {
	    protected String name;

	    public Animal(String name) {
	        this.name = name;
	    }

	    // Abstract method (to be implemented by subclasses)
	    public abstract void sound();

	    // Concrete method
	    public void sleep() {
	        System.out.println(name + " is sleeping.");
	    }
	}

	// Encapsulation through getters and setters
	class Dog extends Animal {
	    private String breed;

	    public Dog(String name, String breed) {
	        super(name); // Inheritance
	        this.breed = breed;
	    }

	    public String getBreed() {
	        return breed;
	    }

	    public void setBreed(String breed) {
	        this.breed = breed;
	    }

	    // Implementing the abstract method
	    @Override
	    public void sound() {
	        System.out.println(name + " barks.");
	    }
	}

	// Another class demonstrating Inheritance and Polymorphism
	class Cat extends Animal {
	    public Cat(String name) {
	        super(name);
	    }

	    // Implementing the abstract method
	    @Override
	    public void sound() {
	        System.out.println(name + " meows.");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        // Creating objects (Polymorphism at play)
	        Animal myDog = new Dog("Buddy", "Golden Retriever");
	        Animal myCat = new Cat("Whiskers");

	        // Accessing methods (Polymorphism)
	        myDog.sound(); // Buddy barks.
	        myDog.sleep(); // Buddy is sleeping.

	        myCat.sound(); // Whiskers meows.
	        myCat.sleep(); // Whiskers is sleeping.
System.out.println(myDog);
	        // Using encapsulation to set and get breed
	        //Dog specificDog = Dog.myDog; // Typecasting
	       // specificDog.setBreed("Labrador");
	       // System.out.println("Breed: " + specificDog.getBreed()); // Labrador
	    }
	    
	}


	   

}
