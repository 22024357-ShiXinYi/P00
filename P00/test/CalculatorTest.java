import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 22024357, 30 May 2023 12:36:13 pm
 */

/**
 * @author 22024357
 *
 */
public class CalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");


	}
	@Test
	public void testAdd() {
		int a = 1234;
		int b = 8765;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 9999;
		assertEquals (expected, actual);
		}
	@Test
	public void testSubtract( ) {
        int a = 5000;
        int b = 2000;

        Calculator cal = new Calculator( );
        int actual = cal.subtract(a,b);

        int expected = 3000;
        assertEquals(expected,actual);
}
	@Test
	public void testMultiple( ){//command
        int a = 5;
        int b = 10;

        Calculator cal = new Calculator( );
         int actual = cal.multiple(a,b);
      
         int expected = 50;
         assertEquals(expected,actual);
	}
	@Test
	public void testDivide( ){
        int a = 10;
        int b = 2;

        Calculator cal = new Calculator( );
         int actual = cal.divide(a,b);

         int expected = 5;
         assertEquals(5,actual);
	}
	public int divide(int a, int b) {
		if(b == 0) {
			throw new IllegalArgumentException("Cannot divide by zero");
		}
		return a/b;
		
	}





}
