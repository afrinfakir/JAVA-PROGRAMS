package javaSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListConcept {

	public static void main(String[] args) {

		String[] vowels = {"a","e","i","o","u"};
		
		List<String> vowelsList = Arrays.asList(vowels);
		List<String> Vo= new ArrayList<String>();
		Vo.addAll(vowelsList);
		System.out.println(Vo);
		Vo.add(3,"A");
		System.out.println(Vo);
		Boolean B=Vo.contains("B");
		System.out.println(B);
		System.out.println(Vo.subList(2, 4));
		
		Iterator<String>itr=Vo.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());
		
		
	}
	

}
