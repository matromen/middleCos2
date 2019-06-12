package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author bgkim
 *
 * 같은 key에 put을 하면서 값을 변경 함.
 *
 */
public class MapExam {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("001", "kim");
		map.put("002", "kim2");
		map.put("003", "kim3");
		
		map.put("001", "kang");  // 해당 key 위치에 값을 변경 함.
		
		
		System.out.println(map.size());
		
		System.out.println(map.get("001"));  // <== kang이 출력
		
		
		System.out.println("");
		
		Set<String> keys = map.keySet();  // <== keySet을 통해 key 들을 가지고  Set객체에 넣음
		Iterator<String> iterator = keys.iterator();
		
		String keyTemp;
		
		while(iterator.hasNext()) {
			keyTemp =  iterator.next();
			System.out.println( keyTemp + ", " + map.get(keyTemp) );
		}
	}
}
