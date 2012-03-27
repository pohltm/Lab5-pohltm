import java.util.ArrayList;


public class PrimeNumberGenerator {

	public static ArrayList<Integer> generatePrimes(int n){
		ArrayList<Integer> ret =  new ArrayList<Integer>();
		
		for (int i = 2; i < n; i++){
			ret.add(i);
		}
		
		for(int i = 2; i < n; i+=2){
			if (i < ret.size()){
				ret.set(i, 0);
			}
		}
		
		while(ret.contains(0)){
			ret.remove(new Integer(0));
		}
		
		return ret;
	}
	
}
