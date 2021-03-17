
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Qns11 {

	public static void main(String[] args) {
		Qns11 project = new Qns11();
		List<Integer> list1 = Stream.of(12,1,32,3).collect(Collectors.toList());
		List<Integer> list2 = Stream.of(0,12,2,23).collect(Collectors.toList());
		Integer finalList[]=project.merge(list1,list2);
		for(Object element : finalList) {
			System.out.println(element);
		}
	}
	
	public Integer[] merge(List<Integer> list1,List<Integer> list2) {
		List<Integer> newList = new ArrayList(4);	
		if (list1.size()==list2.size()) {
			for (int i=0;i<list1.size();i++) {
				if (i%2==0 || i==0) {
					newList.add(list2.get(i));
				}
				else {
					newList.add(list1.get(i));
				}
			}
		}
		Integer finalList[] = newList.toArray(new Integer[0]);
		return finalList;
		
	
	
	}

}
