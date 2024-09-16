package inheritance;

public class Truck extends VehicleCommon {
public static void main(String[] args) {
	Truck tr=new Truck();
	tr.start();
	tr.stop();
	tr.loadCapacity();
}
public void loadCapacity() {
	System.out.println("Load capacity.");
}
}
