package encapsulation;

public class CreateBox {
	public static void main(String[] args) {
		Common cm = new Common();
		//int h=cm.height=20;
		//int l=cm.length=30;
		//int b=cm.width=40;
		int h=cm.setHeight(0);
		int l=cm.setLength(30);
		int b=cm.setWidth(40);
		cm.setBoxDimension(h, l, b);
		System.out.println(cm.getHeight());
		
	}
	
}
