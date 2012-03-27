import java.util.ArrayList;


public class PrimeFactorization {

	public static ArrayList<Integer> generateFactors(int i) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		
		if (i == 2) {
			ret.add(2);
		}
		return ret;
	}

}
