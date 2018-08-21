package pro;

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleTest {
	public static void main(String args[]){

	@Test
	public void test1() {
		assertTrue("test".length() == 4);
	}
	
	@Test
	public void test2() {
		assertEquals(10, 5*2);
	}
	}


}
