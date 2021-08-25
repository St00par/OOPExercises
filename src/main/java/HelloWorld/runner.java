package HelloWorld;

import org.junit.Test;

public class runner {
	public static void main(String[] args) {

// Part 1
	System.out.println("HelloWorld!");
		
// Part 2
	final String s = "HelloWorld!"; 
	System.out.println(s);	

// Part 3
	printHelloWorld();
// Part 4
	helloWorld h = new helloWorld();
	h.printMsg("HelloWorld!");
	

}

// Part 3
public static void printHelloWorld() {
	System.out.println("HelloWorld!");
	}
}