package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		Collections.addAll(num, 3, 2, 11, 4, 25, 29, 5, 35, 55, 98, 0, 6, 7);
		Collections.sort(num);
		System.out.println(num);
		System.out.println("Print the Second Largest Number :" +num.get(num.size()-2));
		
		
				
	}
}
