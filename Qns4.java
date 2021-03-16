import java.util.Arrays;
import java.util.LinkedList;

public class Qns4 {
	public static void main(String args[]) {
		Qns4 sol = new Qns4();
		String list1[] = { "apple", "orange", "grapes" };
		String list2[]= { "melon", "apple", "mango" };
		
		String array[]=sol.run(list1 ,list2);
		for(String n: array ) {
		System.out.println(n);
		}
	}

	public String[] run(String list1,String list2) {
		LinkedList<String> newList1 = new LinkedList<String>(Arrays.asList(list1));
		for (String n:newList1) {
			if (n.startsWith("a") || n.startsWith("g")) {
				newList1.remove();
			}
	
		LinkedList<String> newList2 = new LinkedList<String>(Arrays.asList(list2));
		for (String m:newList2) {
			if (m.endsWith("n") || m.endsWith("e")) {
				newList2.remove();
			}
			
			
		}
		
		LinkedList<String> allList = new LinkedList<>();
		allList.addAll(newList1);
		allList.addAll(newList2);
		
		String array[]= allList.toArray(new String[0]);
		return array;
	}
}
}
