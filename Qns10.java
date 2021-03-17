
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Qns10 {

	public static void main(String[] args) {
		Qns10 project = new Qns10();
		List<Integer> list1 = Stream.of(1,2,3,4).collect(Collectors.toList());
		List<Integer> list2 = Stream.of(3,4,5,6).collect(Collectors.toList());
		Object array[]=  project.run(list1,list2);
		for (Object o :array) {
			System.out.println(o);
		}
		

	}
	
	public Object[] run(List<Integer> list1,List<Integer> list2) {
		List<Integer> allUniqueList = new ArrayList<>();
		List<Integer> similarList1 = new ArrayList(list1);
		for (Integer val : similarList1) {
			if (val.equals(list2)) {
				allUniqueList.add(val);
			}
		}
		
		
		List<Integer> similarList2 = new ArrayList(list2);
		for (Integer val : similarList2) {
			if (val.equals(list1)) {
				allUniqueList.add(val);
			}
		}
		
		
		Object array[] = allUniqueList.toArray(new Integer[0]);
		return array;

	}

	
}
