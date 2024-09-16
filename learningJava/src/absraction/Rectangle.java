package absraction;

public class Rectangle extends Shapes{
public static void main(String[] args) {
	Rectangle r=new Rectangle();
	r.colourShape();
	r.drawShape();
	r.moveShape();
}

@Override
public void drawShape() {
	System.out.println("Shape rectangle");
	
}

@Override
public void colourShape() {
	System.out.println("colouring rectangle");
}

@Override
public void moveShape() {
	System.out.println("moving rectangle");
	
}
}
