package d_groupAnagram;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static List<List<String>> groupAnagram(String []strs){
		//Verificamos caso a str esteja vazia ou o tamanho dela seja 0 retornamos um array list
		//Isso previne erros de strs vazias.
		if(strs == null || strs.length == 0) return new ArrayList<>();
		
		
		//Criamos uma lista de lista de Strings
		List<List<String>> retorno = new ArrayList<>();
		
		
		//Criamos uma estrutura map do tipo hashMap onde temos a key sendo String e os valores armazenados
		//é uma lista de String
		Map<String, List<String>> map =new HashMap<>();
		
		for(String i : strs) {
			
			//transformando a String em um vetor de caracteres para ser organizada pela função Arrays.sort
			char [] stringAtual = i.toCharArray();
			Arrays.sort(stringAtual); // função de organização
			
			String strOrganizada = String.valueOf(stringAtual);
			// Essa função faz com que o array de caracteres que utilizamos seja convertido
			//de volta em String
			
			//Verificamos se a key ou seja se a strorganizada não está como key
			//Caso não esteja vamos qcolocar a key dentro da estrutura map criada//
			// e criamos um novo array list para armazenar os anagrams relacionados a key ou strOrganizada
			if(!map.containsKey(strOrganizada)) {
				map.put(strOrganizada, new ArrayList<>());
			}
			
			//pegamos o lugar onde está a strorganizada ou seja a Key e 
			//Adicionamos a String que está dentro do loop no array list dessa key
			map.get(strOrganizada).add(i);
		}
		
		//Aqui nós estamos colocando os valores de todo o map dentro do novo array List 
		//A função map.values pega todos os valores
		retorno = new ArrayList<>(map.values());
		return retorno;
		
	}
}
