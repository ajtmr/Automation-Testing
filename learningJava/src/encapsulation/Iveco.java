package encapsulation;

import inheritance.Truck;

public class Iveco extends Truck {
	public static void main(String[] args) {
		Iveco ie=new Iveco();
		ie.loadCapacity();
		ie.start();
		ie.stop();
	}

}
