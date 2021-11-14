
package Java10;

class yCaaa {
	private int num;

	public void display() {
		System.out.println("printed from yCaaa class");
	}
}

class yCbbb extends yCaaa {
	public void display() {
		System.out.println("printed from yCbbb class");
	}
}

public class Class09 {

	public static void main(String[] args) {
		yCaaa bb = new yCbbb();
		bb.display();
	}

}
