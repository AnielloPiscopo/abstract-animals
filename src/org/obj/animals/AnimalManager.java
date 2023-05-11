package org.obj.animals;

import org.interfaces.*;

public class AnimalManager {
	public void makeFly(IFlyingAnimals animal) {
		animal.fly();
	};
	public void makeSwim(ISwimmingAnimals animal) {
		animal.swim();
	}
}
