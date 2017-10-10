//Question 1.1
//Is Unique: Implement an algorithm to determine if a string has all unique characters.

package chapter1;

public class Problem1 {
	
	public static void main(String[] args) {
		String input = "abc!#";
		
		boolean answer = isUniqueChars(input);
		System.out.println(answer);
	}

	public static boolean isUniqueChars(String str) {
		if (str.length() > 128) return false;
		
		boolean[] charSet = new boolean[128];
		
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			
			if (charSet[val]) {
				return false;
			}
			
			charSet[val] = true;
		}
		
		return true;
	}
}
