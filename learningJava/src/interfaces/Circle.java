package interfaces;

public class Circle implements Shapes {
public static void main(String[] args) {
	Circle c=new Circle();
	c.colourShape();
	c.drawShape();
	c.moveShape();
}
	@Override
	public void drawShape() {
		System.out.println("Circle Shape");
		
	}

	@Override
	public void colourShape() {
		System.out.println("Colouring Shape");
		
	}

	@Override
	public void moveShape() {
		System.out.println("Moving Shape");
		
	}

}
