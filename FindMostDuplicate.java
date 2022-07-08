package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class FindMostDuplicate {
	public static void main(String[] args) {
		String input = "abbaba";// input string values
		int count = 0;//Initialize the count int and set it to 0
		char str = input.charAt(0);
		Map<Character,Integer> map = new HashMap<>();// declare HashMap set 
		char[] charArray = input.toCharArray(); //stores the values in the char array
		for (int i = 0; i < charArray.length; i++) {
			map.put(charArray[i], map.getOrDefault(charArray[i], 0)+1);
			if(map.get(charArray[i])>count) {
				str=charArray[i];
				count=map.get(charArray[i]);
			}
			
		}
		System.out.println(str);
		System.out.println(count);
	}

}
