package org.obj.animals;

import org.interfaces.*;

public class Eagle extends Animal implements  IFlyingAnimals {

	@Override
	public void call() {
		System.out.println("Ahh");
		
	}

	@Override
	public void eat() {
		System.out.println("Carne e pesce");
	}
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Sto volando");
	}
}
