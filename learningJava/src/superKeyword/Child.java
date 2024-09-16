package superKeyword;

public class Child extends Parent {
	
	  public Child() 
	  { 
		  super(3); 
		 
	  }
	
	 
public static void main(String[] args) {
	Child c=new Child();
		c.getData();
		
	
	
}
public void getData() {
	super.getData();
	
	
	
	
	  //System.out.println(number); System.out.println(s);
	 
}
}
