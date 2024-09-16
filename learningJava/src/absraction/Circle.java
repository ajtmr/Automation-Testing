package absraction;

public class Circle extends Shapes {
	public static void main(String[] args) {
		Circle c=new Circle();
		c.moveShape();
		c.colourShape();
		c.drawShape(); 
	}

	@Override
	public void drawShape() {
		System.out.println("Shape Circle");
		
	}

	@Override
	public void colourShape() {
		System.out.println("colouring Circle");
		
	}

	@Override
	public void moveShape() {
		System.out.println("moving Circle");
		
	}

}
