package arrayError;

import java.util.ArrayList;
import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=8;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		//arr.add(5);
		//arr.add(3);
		//arr.add(12);
		//arr.add(6);
		//arr.add(1);
		
		for(int i=0;i<n;i++)
		{
				try {
					@SuppressWarnings("resource")
					Scanner input = new Scanner(System.in); // object for scanner
					System.out.print("Enter your No: ");
					int c = input.nextInt();
					arr.add(i);
					//System.out.println(i);
				} catch (Exception e) {
					System.out.println("The Number is Float");
				}
		}
		

	}

}
