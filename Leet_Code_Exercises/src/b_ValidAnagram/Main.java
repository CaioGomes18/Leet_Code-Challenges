package b_ValidAnagram;

public class Main {
	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		
		System.out.println(isAnagram.isAnagram(s,t));
		
		
		s = "cat";
		t = "rat";

		System.out.println(isAnagram.isAnagram(s,t));
	}

	
}
