package d_groupAnagram;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static List<List<String>> groupAnagram(String []strs){
		if(strs == null || strs.length == 0) return new ArrayList<>();
		
		List<List<String>> retorno = new ArrayList<>();
		
		Map<String, List<String>> map =new HashMap<>();
		
		for(String i : strs) {
			char [] stringAtual = i.toCharArray();
			Arrays.sort(stringAtual);
			String strOrganizada = String.valueOf(stringAtual);
			if(!map.containsKey(strOrganizada)) {
				map.put(strOrganizada, new ArrayList<>());
			}
			map.get(strOrganizada).add(i);
		}
		retorno = new ArrayList<>(map.values());
		return retorno;
		
	}
}
