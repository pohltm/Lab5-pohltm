import java.util.ArrayList;


public class PrimeFactorization {

	public static ArrayList<Integer> generateFactors(int i) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		
		for( int shamelessCopy = 2; shamelessCopy < i; shamelessCopy++){
			while (i % shamelessCopy == 0) {
				ret.add(shamelessCopy);
				i /= shamelessCopy;
			}
		}
		
		if (i > 1) {
			ret.add(i);
		}
		return ret;
	}

}
