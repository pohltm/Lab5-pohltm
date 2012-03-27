import java.util.ArrayList;


public class PrimeFactorization {

	public static ArrayList<Integer> generateFactors(int i) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		
		if (i > 1) {
			ret.add(i);
		}
		return ret;
	}

}
