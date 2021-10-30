
public class GCD {
	public static int RGCD1(int n, int m) {//輾轉相除
		if(m == 0)
			return n;
		return RGCD1(m, n % m);
	}
	
	public static int RGCD2(int n, int m) {//輾轉相減
		if(m > n) {//swap
			int temp = n;
			n = m;
			m = temp;
		}
		
		if(n == m)
			return n;
		return RGCD1(m, n - m);
	}
	
	public static int RGCD3(int n, int m) {//窮舉
		return RGCDBruteForce(n, m, (n < m)? n: m);
	}
	
	private static int RGCDBruteForce(int n, int m, int factor) {
		if(m > n) {//swap
			int temp = n;
			n = m;
			m = temp;
		}
		
		if(n % factor == 0 && m % factor == 0)
			return factor;
		else
			return RGCDBruteForce(n, m, --factor);
	}
	
	public static int LGCD1(int n, int m) {
		int temp;
		
		while(m != 0) {
			temp = n % m;
			n = m;
			m = temp;
		}
		return n;
	}
	
	public static int LGCD2(int n, int m) {
		int temp;
		
		while(m != 0) {
			if(m > n) {//swap
				temp = n;
				n = m;
				m = temp;
			}
			
			temp = n - m;
			n = m;
			m = temp;
		}
		return n;
	}
	
	public static int LGCD3(int n, int m) {
		int temp;
		
		if(m > n) {//swap
			temp = n;
			n = m;
			m = temp;
		}
		
		int factor = m;
		
		while(n % factor != 0 || m % factor != 0)
			factor--;
		return factor;
	}
}
