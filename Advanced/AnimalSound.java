/*
Problem 10: Animal Sounds
File Name: AnimalSound.java
Package Name: problems_w3_v2
Create:
	Animal
with a method:
	sound()
Create:
	Dog
	Cat
	Cow
Each class should override sound().
Create objects and call sound().
Focus: Method overriding / runtime polymorphism
*/

package problems_w3_v2;

class Animal {
	public String sound() {
		return "General Animal Sound";
	}
}

class Dog extends Animal {
	@Override
	public String sound() {
		return "bark bark";
	}
}

class Cat extends Animal {
	@Override
	public String sound() {
		return "meow meow";
	}
}

class Cow extends Animal {
	@Override
	public String sound() {
		return "moo moo";
	}
}

public class AnimalSound {
	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal cow = new Cow();
		
		// this is runtime polymorphism 
		// usual Dog dog = new Dog(); it refers to the subclass object
		// System.out.println("Dog Sounds: " + dog.sound());
		
		System.out.println("Dog Sounds: " + dog.sound());
		System.out.println("Cat Sounds: " + cat.sound());
		System.out.println("Cow Sounds: " + cow.sound());
	}
}
