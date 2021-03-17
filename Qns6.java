
import java.util.*;

public class Qns6 {
	public static void main(String args[]) {
		Qns6 project = new Qns6();
		HashMap<String, Integer> map = new HashMap<>();
		map.put("abc", 50);
		map.put("efg", 70);
		project.result(map);
		
	}

	public void result(HashMap<String, Integer> map) {

		HashMap<String, String> mapping = new HashMap<>();
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		for (Map.Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			Integer marks = entry.getValue();
			if (marks > 60) {
				mapping.put(key, "pass");
			} else {
				mapping.put(key, "fail");
			}
		}
		System.out.println(mapping);
	}

}