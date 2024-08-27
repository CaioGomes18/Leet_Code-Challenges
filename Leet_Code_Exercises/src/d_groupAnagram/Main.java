package d_groupAnagram;


import java.util.*;
public class Main {
	public static void main(String []args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		
		List<List<String>> str = Solution.groupAnagram(strs);
		
		System.out.println(str);
	}
}
