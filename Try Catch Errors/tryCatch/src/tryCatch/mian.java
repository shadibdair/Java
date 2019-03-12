package tryCatch;

public class mian {

	public static void main(String[] args) {
		
		String str = "23456aaa";
		@SuppressWarnings("unused")
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			try {
				sum+=Integer.parseInt(str.charAt(i)+"");
			}catch (NumberFormatException e) {
				System.out.println("Error its letter! ");
			}
			finally {
				System.out.println("i= "+i);
			}
			
		}
		System.out.println("Sum : "+sum);

	}

}
