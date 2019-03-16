#Film
```
import java.util.Scanner;


public class Main_Class {

	public static void main(String[] args) {
	
		Films[] FilmArray = new Films[3];
		Scanner input = new Scanner(System.in);
		
		
		
		// insert Elements to array
		for (int i = 0; i < FilmArray.length; i++) {
			System.out.println("\nPlease enter your favorite Film:");
			
			System.out.print("Film: ");
			String f = input.nextLine();
			
			System.out.print("director: ");
			String d = input.nextLine();
			
			System.out.print("copies:  ");
			int c = input.nextInt();
			
			FilmArray[i]=new Films(f,d,c);
					
		}
		
		System.out.print("Enter what's ur M: ");
		int m = input.nextInt();
		System.out.print("Enter what's ur N: ");
		int n = input.nextInt();
		
		for (int i = 0; i < FilmArray.length; i++) {
			if(m==i)
			{
				System.out.println(FilmArray[i].toString());
				FilmArray[i].remove();
				// here you will see that the copies -- 
				System.out.println(FilmArray[i]);
				System.out.println("---------------------");
			}
			if(n==i)
			{
				System.out.println(FilmArray[n]);
				System.out.println("---------------------");
			}
			
		}
		
		System.out.println("---------------------");
		
		
		for (int i = 0; i < FilmArray.length; i++) {
			System.out.println(FilmArray[i]);
			
		}
		
		
		

	}
}

```
