package org.obj.animals;

import org.interfaces.*;

public class Dolphin extends Animal implements ISwimmingAnimals {

	@Override
	public void call() {
		System.out.println("Verso delfino");
		
	}

	@Override
	public void eat() {
		System.out.println("Pesce");
	}
	
	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("Sto nuotando");
	}
}
