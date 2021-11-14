
package Java10;

class CTriangle {
	protected int base;
	protected int height;

	protected void show() {
		System.out.println("base=" + base + ", height=" + height);
	}

	public CTriangle(int b, int h) {
		base = b;
		height = h;
	}

}

class CData extends CTriangle {
	public CData(int b, int h) {
		super(b, h);
	}

	public void area() {
		show();
		System.out.println("area=" + base * height / 2.0);
	}
}

public class Class06 {

	public static void main(String[] args) {
		CData cd=new CData(10,100); 
		  cd.area(); 
	}

}
