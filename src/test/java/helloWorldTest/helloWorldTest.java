package helloWorldTest;

import org.junit.Test;
import HelloWorld.runner;
import HelloWorld.helloWorld;

import junit.framework.Assert;

public class helloWorldTest {

	@Test
	public void testingHelloWorld() {
	assertEquals("HelloWorld!", helloWorld.printMessage());
	}	
}
