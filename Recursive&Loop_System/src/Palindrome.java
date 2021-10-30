
public class Palindrome {
	
	public static boolean isPaliR(String str) {
		return PaliRecursive(str, 0, str.length() - 1);
	}
	
	private static boolean PaliRecursive(String str, int left, int right) {
		if(left >= right)
			return true;
		else if(str.charAt(left) == str.charAt(right))
			return PaliRecursive(str, ++left, --right);
		else
			return false;
	}
	
	public static boolean isPaliL(String str) {
		int len = str.length();
		for(int i = 0; i < len / 2; i++) {
			if(str.charAt(i) != str.charAt(len - i - 1))
				return false;
		}
		return true;
	}
}
