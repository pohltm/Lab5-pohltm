import java.util.ArrayList;


public class PrimeNumberGenerator {

	public static ArrayList<Integer> generatePrimes(int n){
		ArrayList<Integer> ret =  new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++){
			ret.add(i);
		}
		
		for (int j = 2; j < n; j++){
//			int p = ret.get(j);
			for(int i = 2*j; i < n; i+=j){
				if (i < ret.size()){
					ret.set(i, 0);
				}
			}
		}
		
		while(ret.contains(0)){
			ret.remove(new Integer(0));
		}
		ret.remove(new Integer(1));
		
		return ret;
	}
	
}
