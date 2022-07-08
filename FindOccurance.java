package week3.day2;

import java.util.Map;
import java.util.TreeMap;

public class FindOccurance {
	public static void main(String[] args) {
		int[] data = { 2, 3, 5, 6, 3, 2, 1, 4, 2, 1, 6, -1 };
		Map<Integer, Integer> map = new TreeMap<>();
		for (int i = 0; i < data.length; i++) {
			if (map.containsKey(data[i])) {
				map.put(data[i], map.get(data[i]) + 1);
			} else
				map.put(data[i], 1);

		}

		System.out.println(map);

	}

}
