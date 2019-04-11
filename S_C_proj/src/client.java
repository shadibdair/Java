import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

import javax.xml.transform.Templates;

public class client {

	public static void main(String args[]) throws IOException {
		
		// variable
		int number, temp;
		
		// accepting anything from the user you need a scanner object:
		Scanner sc = new Scanner(System.in);
		
		// Socket it's an interface which enables the client and the server 
		// to communicate and pass on information from one another or so
		// basiclly you could use the socket in order to enable communicate 
		Socket s = new Socket("127.0.0.1",4200);
		
		// accepting something from the Server 
		Scanner sc1 = new Scanner(s.getInputStream());
		
		// accept the number from the user 
		System.out.println("Enter any number: ");
		
		// to accept the number 
		number = sc.nextInt(); 
		
		// by using [printstream] you actully give the number to user 
		PrintStream p = new PrintStream(s.getOutputStream());
		
		// to pass the number to the client
		p.println(number);
		
		// to accept the result from the server 
		// temp : which is going to store the result
		temp = sc1.nextInt();
		System.out.println(temp);
		
		
		
	}
}
