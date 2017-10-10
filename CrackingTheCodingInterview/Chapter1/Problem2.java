//Question 1.2
//Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.

package chapter1;

public class Problem2 {

	public static void main(String[] args) {
		String wordOne = "god";
		String wordTwo = "dog";
		String wordThree = "doom ";
		String wordFour = "mood";
		
		
		boolean solOneAnswer = permutationOne(wordOne, wordTwo);
		System.out.println(solOneAnswer);
		
		boolean solTwoAnswer = permutationTwo(wordOne, wordTwo);
		System.out.println(solTwoAnswer);
		
		solOneAnswer = permutationOne(wordThree, wordFour);
		System.out.println(solOneAnswer);
		
		solTwoAnswer = permutationTwo(wordThree, wordFour);
		System.out.println(solTwoAnswer);
	}
	
	//Solution 1: Sort the strings.
	private static String sort(String s) {
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
	
	public static boolean permutationOne(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		
		return sort(s).equals(sort(t));
	}
	
	//Solution 2: Check if the two strings have identical character counts.
	public static boolean permutationTwo(String s, String t) {
		//If lengths don't match, they can't be permutations.
		if (s.length() != t.length()) {
			return false;
		}
		
		int[] letters = new int[128];
		
		for (int i = 0; i < s.length(); i++) {
			letters[s.charAt(i)]++;
		}
		
		for (int i = 0; i < t.length(); i++) {
			letters[t.charAt(i)]--;
			
			if (letters[t.charAt(i)] < 0) {
				return false;
			}
		}
		
		return true;
	}
}
