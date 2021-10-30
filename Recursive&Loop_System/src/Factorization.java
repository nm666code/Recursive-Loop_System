import java.util.ArrayList;

public class Factorization {
	
	public static ArrayList<Integer> Rfactor(int num) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		return RecursiveFactorized(num, 2, factors);
	}

	private static ArrayList<Integer> RecursiveFactorized(int num, int i, ArrayList<Integer> factors) {
		if (i <= num) {
			if (num % i == 0) {
				factors.add(i);
				num /= i;
			} 
			else
				i++;
		} 
		else
			return factors;
		return RecursiveFactorized(num, i, factors);
	}

	public static ArrayList<Integer> Lfactor(int num) {
		int i = 2;
		ArrayList<Integer> factors = new ArrayList<Integer>();
		while(i <= num) {
			while(num % i == 0) {
				factors.add(i);
				num /= i;
			}
			i++;
		}
		return factors;
	}
}
