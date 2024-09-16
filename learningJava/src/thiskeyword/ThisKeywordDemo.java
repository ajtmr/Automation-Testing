package thiskeyword;

public class ThisKeywordDemo {
	int x = 20;
	int y = 40;
	String s = "rcv";

	public ThisKeywordDemo() {
		System.out.println("Default");
	}

	public ThisKeywordDemo(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println(x + y);
		//System.out.println("Default");
	}

	public static void main(String[] args) {
		ThisKeywordDemo th = new ThisKeywordDemo(5, 10);
		th.getData();
		th.getData1();
	}

	public void getData() {
		int x = 40;
		int y = 39;
		System.out.println(this.x + this.y);

	}

	public void getData1() {
		int x = 41;
		int y = 39;
		System.out.println(this.x + this.y);
		System.out.println(x + y);
	}
}
