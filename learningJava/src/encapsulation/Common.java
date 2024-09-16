package encapsulation;

public class Common {
private int length;
private int height;
private int width;
public void setBoxDimension(int l, int b, int h) {
	if (l>=1 && h>=1 && b>=1) {
		System.out.println("Box created with dimensions "+l+" "+b+" "+h);
	}
	else {
		System.out.println("Invalid dimensions");
	}
	
}
public int setHeight(int h) {
	if (h>=1) {
		height=h;
	}
	else {
		System.out.println("Height is invalid.");
	}
	 
	 return height;
}
public int setLength(int l) {
	length=l;
	 return length;
}
public int setWidth(int b) {
	width=b;
	 return width;
}
public int getHeight() {
	 
	 return height;
}
public int getLength() {
	
	 return length;
}
public int getWidth() {
	 
	 return width;
}


}
