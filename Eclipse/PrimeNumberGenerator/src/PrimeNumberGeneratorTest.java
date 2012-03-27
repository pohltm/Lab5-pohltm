import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;



public class PrimeNumberGeneratorTest {
	@Test
	public void testOne(){
		assertEquals(list(), PrimeNumberGenerator.generatePrimes(1));
	}
	
	private ArrayList<Integer> list(int... ints) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i : ints) {
			ret.add(i);
		}
		return ret;
	}
}