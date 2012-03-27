import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;



public class PrimeFactorizationTest {
	@Test
	public void testOne() {
		assertEquals(list(), PrimeFactorization.generateFactors(1));
	}
	
	@Test
	public void testTwo() {
		assertEquals(list(2), PrimeFactorization.generateFactors(2));
	}
	
	@Test
	public void testThree() {
		assertEquals(list(3), PrimeFactorization.generateFactors(3));
	}
	
	@Test
	public void testFour() {
		assertEquals(list(2, 2), PrimeFactorization.generateFactors(4));
	}
	
	private ArrayList<Integer> list(int... ints) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i : ints) {
			ret.add(i);
		}
		return ret;
	}
}
