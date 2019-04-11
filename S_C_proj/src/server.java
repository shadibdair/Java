import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {
	// variable
	static int number;
	static int temp;
	
	//the server is to accept some input from the client and the process it
	// and return it back to the client
	public static void main(String args[]) throws IOException {
		
		// Socket in the server , which is required in the server 
		ServerSocket s1 = new ServerSocket(4200);
		// we have successfully created server Socket	
		
		Socket ss = s1.accept(); // accept -> going to accept the incoming request to the socket s1
		
		Scanner sc = new Scanner(ss.getInputStream());
		
		// for accepting the number
		number = sc.nextInt();
		
		
		
		// next step is to manipulate the data which is sent from the client that is nothing  
		temp = number*2;
		
		// we need to create [printstream] object 
		PrintStream p = new PrintStream(ss.getOutputStream());
		p.println(temp);
	}

}
