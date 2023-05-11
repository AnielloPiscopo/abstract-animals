package org.main;

import org.obj.animals.*;

public class Main {
	public static void main(String[] args) {
		Sparrow s1 = new Sparrow();
		Dolphin d1 = new Dolphin();
		AnimalManager am = new AnimalManager();
		am.makeFly(s1);
		am.makeSwim(d1);
	}
}
