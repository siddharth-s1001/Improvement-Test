import java.util.*;

public class Qns7 {

	public static void main(String[] args) {
		Qns7 project = new Qns7();
		HashMap<Integer,Integer> numbers = new HashMap<>();
		numbers.put(1, 4);
		numbers.put(2, 6);
		numbers.put(4, 7);
		numbers.put(5, 9);
		Integer oddNumbers=project.average(numbers);
		System.out.println(oddNumbers);
		
		
	}
	
	public Integer average(HashMap<Integer,Integer> numbers) {
		
		Set<Integer> key = numbers.keySet();
		for (int number : key) {
			Integer sum=0;
			Integer count=0;
			if (number%2!=0) {
				sum = sum+numbers.get(key);
				count++;
			}
			Integer avg = sum/count; 
			return avg;
		}
			
	}
}
