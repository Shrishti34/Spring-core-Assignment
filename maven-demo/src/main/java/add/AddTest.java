package add;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class AddTest {

	@Test
	void test() {
		AddTest addTest = new AddTest();
		int expected = 2;
		int actual = addTest.add(1,1);
		assertEquals(expected,actual);
		System.out.println("This test ran");
	}
	
	@Test
	void computeCircleArea(double radius) {
		AddTest addTest = new AddTest();
		
	}

}
