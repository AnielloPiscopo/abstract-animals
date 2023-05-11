package org.obj.animals;

public abstract class Animal {
	public void sleep() {
		System.out.println("Zzz");
	}
	
	public abstract void call();
	
	public abstract void eat();
}