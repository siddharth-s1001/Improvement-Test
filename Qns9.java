
import java.util.*;

public class Qns9 {

	public static void main(String[] args) {
		Qns9 project = new Qns9();
		String array[] = { "red", "green", "blue", "ivory" };
		project.sort(array, 0);
		project.reverse(array);
	}

	public void sort(String array[], int place) {
		Arrays.sort(array);  
		System.out.println(Arrays.toString(array));
		
	}
	
	public void reverse(String array[]) {
		 List<String> list = Arrays.asList(array);
	        Collections.reverse(list);
	        String[] reversedArray = list.toArray(array);
	        System.out.print( Arrays.toString(reversedArray));
		
	}
}
