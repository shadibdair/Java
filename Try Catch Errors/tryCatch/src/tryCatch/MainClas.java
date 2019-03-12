package tryCatch;

public class MainClas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat a = new Cat(5, 6.2,"bece");
		
		try {
			a.setA(5);
		} catch (IllegalArgumentException e) {
			System.out.println("you Have Error !!");
		}

	}

}
