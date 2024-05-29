package Ex2.anagram;

import java.util.Arrays;

public class isAnagram {
	
	
	protected static boolean isAnagram(String s, String t) {
		char charArray1 [] = s.toCharArray();
		char charArray2 [] = t.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		return Arrays.equals(charArray1, charArray2);
	}
}
