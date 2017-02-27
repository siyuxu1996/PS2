package PKGemptry;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMyinteger {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testisEven4() {
		int y = 9;
		Boolean ExpectedValue11 = false;
		assertEquals(ExpectedValue11, MyInteger.isEven(y));
	}
	@Test
	public void testisEven3() {
		int z = 8;
		Boolean ExpectedValue12 = true;
		assertEquals(ExpectedValue12, MyInteger.isEven(z));
	}
	@Test
	public void testisEven() {
		int i = 2;
		Boolean ExpectedValue = true;
		assertEquals(ExpectedValue, MyInteger.isEven(i));
	}
	@Test
	public void testisEven1() {
		int a = 3;
		Boolean ExpectedValue2 = false;
		assertEquals(ExpectedValue2, MyInteger.isEven(a));
	}
	@Test
	public void testisOdd() {
		int o = 4;
		Boolean ExpectedValue1 = false;
		assertEquals(ExpectedValue1, MyInteger.isOdd(o));
	}
	@Test
	public void testisOdd1() {
		int b = 3;
		Boolean ExpectedValue3 = true;
		assertEquals(ExpectedValue3, MyInteger.isOdd(b));
	}
	@Test
	public void testisprime() {
		MyInteger new5 = new MyInteger(8);
		MyInteger new6 = new MyInteger(7);
		assertTrue(MyInteger.isPrime(7));
		assertFalse(MyInteger.isPrime(9));
		assertFalse(MyInteger.isPrime(1));
		assertFalse(MyInteger.isPrime(9));
		assertTrue(MyInteger.isPrime(new6));
		assertFalse(MyInteger.isPrime(new5));
	}
	@Test
	public void testisequal() {
		MyInteger new3 = new MyInteger(6);
		assertFalse(new3.equals(5));
		assertTrue(new3.equals(6));
		assertTrue(new3.equalsmyinteger(new3));
	}
	@Test
	public void testisEverything() {
		MyInteger new1 = new MyInteger(5);
		MyInteger new2 = new MyInteger(6);
		assertFalse(new1.isEven());
		assertTrue(new2.isEven());
		assertTrue(new1.isOdd());
		assertFalse(new2.isOdd());
		assertTrue(new1.isPrime());
		assertFalse(new2.isPrime());
		assertFalse(MyInteger.isEven(new1));
		assertTrue(MyInteger.isEven(new2));
		assertTrue(MyInteger.isOdd(new1));
		assertFalse(MyInteger.isOdd(new2));
	}

}
