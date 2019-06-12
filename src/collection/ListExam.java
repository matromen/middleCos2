package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author bgkim
 *
 *Collection super interface
 *
 * 순서가 있는 collection  get(i)을    통해 값을 추출
 */
public class ListExam {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("kim");
		list.add("kang");
		list.add("kim");
		
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
