package constructersExample;

public class ConstructersExample {

	public ConstructersExample() {
		System.out.println("no argument constructor");
	}

	public ConstructersExample(int i) {
		System.out.println("integer constructor");
	}

	public ConstructersExample(int i, int j) {
		System.out.println("2 integer constructor");
	}

	public ConstructersExample(String s) {
		System.out.println("String constructor");
	}
	public ConstructersExample(int y, String k) {
		System.out.println("Integer and String");
	}

	public static void main(String[] args) {
		ConstructersExample ce = new ConstructersExample(8, "lsjdflkjsdf");
	}
}
