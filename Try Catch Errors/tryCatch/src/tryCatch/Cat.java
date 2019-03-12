package tryCatch;

public class Cat extends Animal {

	private int a;

	public Cat(int a,Double c,String b) {
		super(b, c);
		this.a = a;
	}

	
	public int getA() {
		return a;
	}

	public void setA(int a) throws IllegalArgumentException{
		this.a = a;
		setC(6.7);
	}
	
}
