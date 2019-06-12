package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 * @author bgkim
 *
 * Collection super interface
 * 중복을 허용 하지 않음 false 리턴함.
 *
 */
public class SetExam {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		boolean flag = set.add("kang");
		boolean flag2 = set.add("kim");
		boolean flag3 = set.add("kang");
		
		System.out.println(set.size());
		System.out.println(flag);
		System.out.println(flag2);
		System.out.println(flag3);
		
		
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
