package tryCatch;

public class Animal extends World {

	private double c;

	public Animal(String b, double c) {
		super(b);
		this.c = c;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) throws IllegalArgumentException{
		this.c = c;
		
		throw new IllegalArgumentException("The number is too small");
	}
	
	
}
