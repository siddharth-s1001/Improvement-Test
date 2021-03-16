
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Qns3 {

	public static void main(String[] args)  {
		Qns3 sol = new Qns3();
		List<Integer> list1 = Stream.of(1,2,3,5).collect(Collectors.toList());
		List<Integer> list2 = Stream.of(1,2,3,5).collect(Collectors.toList());
		Object array[]=  sol.run(list1,list2);
		for (Object o :array) {
			System.out.println(o);
		}
		

	}
	Object[] run(List<Integer>list1 ,List<Integer> list2) {
		List<Integer> uniqueList1 = new ArrayList<>(list1);
		uniqueList1.removeAll(list2);
		
		List<Integer> uniqueList2 = new ArrayList<>(list2);
		uniqueList2.removeAll(list1);
		
		List<Integer> uniqueList = new ArrayList<>();
		uniqueList.addAll(uniqueList1);
		uniqueList.addAll(uniqueList2);
		
		Object array[] = uniqueList.toArray(new Integer[0]);
		return array;
		
		
	}
	
	
	
	
}