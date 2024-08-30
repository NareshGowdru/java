package Practice;

public class oops_concepts 
{
	from abc import ABC, abstractmethod

	# Abstraction
	class Animal(ABC):
	    @abstractmethod
	    def sound(self):
	        pass

	    def sleep(self):
	        print(f"{self.__class__.__name__} is sleeping.")

	# Encapsulation with inheritance
	class Dog(Animal):
	    def __init__(self, name, breed):
	        self.__name = name  # Private attribute
	        self.__breed = breed  # Private attribute

	    def sound(self):
	        print("Woof!")

	    # Getter and Setter for name
	    def get_name(self):
	        return self.__name

	    def set_name(self, name):
	        self.__name = name

	    # Getter and Setter for breed
	    def get_breed(self):
	        return self.__breed

	    def set_breed(self, breed):
	        self.__breed = breed

	    def display_info(self):
	        print(f"Dog's Name: {self.get_name()}, Breed: {self.get_breed()}")

	# Inheritance with encapsulation
	class Cat(Animal):
	    def __init__(self, name, color):
	        self.__name = name  # Private attribute
	        self.__color = color  # Private attribute

	    def sound(self):
	        print("Meow!")

	    # Getter and Setter for name
	    def get_name(self):
	        return self.__name

	    def set_name(self, name):
	        self.__name = name

	    # Getter and Setter for color
	    def get_color(self):
	        return self.__color

	    def set_color(self, color):
	        self.__color = color

	    def display_info(self):
	        print(f"Cat's Name: {self.get_name()}, Color: {self.get_color()}")

	# Polymorphism
	def make_sound(animal):
	    animal.sound()

	# Main program
	dog = Dog("Buddy", "Golden Retriever")
	cat = Cat("Whiskers", "Tabby")

	# Polymorphism in action
	make_sound(dog)  # Outputs: Woof!
	make_sound(cat)  # Outputs: Meow!

	# Accessing encapsulated data
	dog.display_info()  # Outputs: Dog's Name: Buddy, Breed: Golden Retriever
	cat.display_info()  # Outputs: Cat's Name: Whiskers, Color: Tabby

	# Using inherited method
	dog.sleep()  # Outputs: Dog is sleeping.
	cat.sleep()  # Outputs: Cat is sleeping.

}
