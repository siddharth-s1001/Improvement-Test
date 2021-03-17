import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Qns8 {
	public static void main(String args[]) {
		Qns8 project = new Qns8();
		int arrayList1[] = { 1,2,3,4,5};
		int arrayList2[] = { 6,7,8,9,10};
		int finalList[] = project.sort(arrayList1,arrayList2);
		for (int array : finalList) {
			System.out.println(array);
		}
	}
	
	public int[] sort(int[] arrayList1,int[] arrayList2) {
		int list[] = new int[arrayList1.length];
		if (arrayList1.length==arrayList2.length) {
			for (int i=0;i< arrayList1.length;i++) {
				if(i%2!=0) {
					list[i] = arrayList1[i];
				}
				else if (i%2==0) {
					list[i] = arrayList2[i];
				}
			}
		}
		return list;
		
	}
	

}