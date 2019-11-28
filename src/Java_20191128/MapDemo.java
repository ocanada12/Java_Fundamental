package Java_20191128;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		// HashMap : key값은 반드시 유일해야 하고, value에는 데이터(객체)를 저장하는데
		// 데이터의 중복을 허용한다. key값이 중복되는 경우는 덮어쓰기를 한다.
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("1", 11111);
		map.put("2", 22222);
		map.put("3", 33333);
		map.put("4", 44444);
		map.put("5", 55555);
		map.put("1", 66666);

		Integer value = map.get("1");
		System.out.println(value);
		
		// 맵의 전체 키와 밸류 불러오기 
		Set<String> set = map.keySet();
		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			String k = i.next();
			Integer v = map.get(k);
			System.out.format("key : %s, value : %d%n", k, v);
		}
		
		// 전체게임방은 맵으로 관리하고 하나하나의 게임방은 리스트로 관리
	}
}