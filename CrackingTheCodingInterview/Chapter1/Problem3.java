//Question 1.3
//URLify: Write a method to replace all spaces in a string with "%20".
//	Example:
//	Input:		"Mr John Smith    ", 13
//	Output: 	"Mr%20John$20Smith"

package chapter1;

public class Problem3 {

	public static void main(String[] args) {
		String word = "Mr John Smith      ";
		char[] string = word.toCharArray();
		int length = 13;
		
		char[] charURL = replaceSpaces(string, length);
		String URL = String.valueOf(charURL);
		System.out.println(URL);
	}
	
	public static char[] replaceSpaces(char[] str, int trueLength) {
		int spaceCount = 0;
		
		for (int i = 0; i < trueLength; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}
		
		int index = trueLength + (spaceCount * 2);
		
		if (trueLength < str.length) {
			str[trueLength] = '\0';
		}
		
		for (int i = trueLength - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[index - 1] = '0';
				str[index - 2] = '2';
				str[index - 3] = '%';
				index = index - 3;
			} else {
				str[index - 1] = str[i];
				index--;
			}
		}
		
		return str;
	}
}
