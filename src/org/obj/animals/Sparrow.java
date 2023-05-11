package org.obj.animals;

import org.interfaces.*;

public class Sparrow extends Animal implements IFlyingAnimals {

	@Override
	public void call() {
		System.out.println("Cip Cip");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Carne e vermi");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Sto volando");
	}
}
