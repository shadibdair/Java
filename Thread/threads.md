Threads in Java

```
// Java code for thread creation by extending 
// the Thread class 
class MultithreadingDemo extends Thread 
{ 
    public void run() 
    { 
        try
        { 
            // Displaying the thread that is running 
            System.out.println ("Thread " + 
                  Thread.currentThread().getId() + 
                  " is running"); 
  
        } 
        catch (Exception e) 
        { 
            // Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
    } 
} 
  
// Main Class 
public class Multithread 
{ 
    public static void main(String[] args) 
    { 
        int n = 8; // Number of threads 
        for (int i=0; i<8; i++) 
        { 
            MultithreadingDemo object = new MultithreadingDemo(); 
            object.start(); 
        } 
    } 
} 
```
Output :
```
Thread 8 is running
Thread 9 is running
Thread 10 is running
Thread 11 is running
Thread 12 is running
Thread 13 is running
Thread 14 is running
Thread 15 is running
```
----------------------------------------------------------------------------
```
// Java code for thread creation by implementing 
// the Runnable Interface 
class MultithreadingDemo implements Runnable 
{ 
    public void run() 
    { 
        try
        { 
            // Displaying the thread that is running 
            System.out.println ("Thread " + 
                                Thread.currentThread().getId() + 
                                " is running"); 
  
        } 
        catch (Exception e) 
        { 
            // Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
    } 
} 
  
// Main Class 
class Multithread 
{ 
    public static void main(String[] args) 
    { 
        int n = 8; // Number of threads 
        for (int i=0; i<8; i++) 
        { 
            Thread object = new Thread(new MultithreadingDemo()); 
            object.start(); 
        } 
    } 
} 
```
Output:
```
Thread 8 is running
Thread 9 is running
Thread 10 is running
Thread 11 is running
Thread 12 is running
Thread 13 is running
Thread 14 is running
Thread 15 is running
```
----------------------------------------------------------------------------
Runnable
```
A Runnable object defines an actual task that is to be executed. It doesn't define how it is to be executed (serial, two at a time, three at a time etc), but just what. We can define a Runnable as follows:

Runnable r = new Runnable() {
  public void run() {
    ... code to be executed ...
  }
};
```
```
Runnable is actually an interface, with the single run() method that we must provide. In our case, we want the Runnable.run() methods of our two tasks to print a message periodically. So here is what the code could look like:

Runnable r1 = new Runnable() {
  public void run() {
    try {
      while (true) {
        System.out.println("Hello, world!");
        Thread.sleep(1000L);
      }
    } catch (InterruptedException iex) {}
  }
};
Runnable r2 = new Runnable() {
  public void run() {
    try {
      while (true) {
        System.out.println("Goodbye, " +
		"cruel world!");
        Thread.sleep(2000L);
      }
    } catch (InterruptedException iex) {}
  }
};
``
