import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;



public class PrimeNumberGeneratorTest {
	@Test
	public void testOne(){
		assertEquals(list(), PrimeNumberGenerator.generatePrimes(1));
	}
	
	@Test
	public void testTwo(){
		assertEquals(list(), PrimeNumberGenerator.generatePrimes(2));
	}
	
	@Test
	public void testThree(){
		assertEquals(list(2), PrimeNumberGenerator.generatePrimes(3));
	}
	
	@Test
	public void testFive(){
		assertEquals(list(2, 3), PrimeNumberGenerator.generatePrimes(5));
	}
	
	@Test
	public void testSix(){
		assertEquals(list(2, 3, 5), PrimeNumberGenerator.generatePrimes(6));
	}
	
	@Test
	public void testTen(){
		assertEquals(list(2, 3, 5, 7), PrimeNumberGenerator.generatePrimes(10));
	}
	
	@Test
	public void testThirteen(){
		assertEquals(list(2, 3, 5, 7, 11), PrimeNumberGenerator.generatePrimes(13));
	}
	
	@Test
	public void testTwentyFour(){
		assertEquals(list(2, 3, 5, 7, 11, 13, 17, 19, 23), PrimeNumberGenerator.generatePrimes(24));
	}
	
	@Test
	public void testOneHundredFifty(){
		assertEquals(list(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149), PrimeNumberGenerator.generatePrimes(150));
	}
	
	private ArrayList<Integer> list(int... ints) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i : ints) {
			ret.add(i);
		}
		return ret;
	}
}
