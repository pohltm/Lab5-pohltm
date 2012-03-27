import java.util.ArrayList;


public class PrimeNumberGenerator {

	public static ArrayList<Integer> generatePrimes(int n){
		ArrayList<Integer> ret =  new ArrayList<Integer>();
		
		for (int i = 2; i < n; i++){
			ret.add(i);
		}
		
		return ret;
	}
	
}
