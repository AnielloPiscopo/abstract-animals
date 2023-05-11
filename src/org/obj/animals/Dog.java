package org.obj.animals;

public class Dog extends Animal {

	@Override
	public void call() {
		System.out.println("Woof woof");
		
	}

	@Override
	public void eat() {
		System.out.println("Carne e croccantini");
	}
}
