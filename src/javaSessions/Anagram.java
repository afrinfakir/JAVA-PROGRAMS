package javaSessions;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String arr[] = { "run", "race", "nur", "cera" };
		
		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i <= arr.length - 1; i++) {

			String a1 = arr[i];
			char c1[] = a1.toCharArray();
			Arrays.sort(c1);

			for (int j = i + 1; j <= arr.length - 1; j++) {

				String a2 = arr[j];
				char c2[] = a2.toCharArray();
				Arrays.sort(c2);
				
				if(Arrays.equals(c1, c2)) {
					list.add(a1);
					list.add(a2);
				}

			}

		}
		System.out.println(list);
	}

}
