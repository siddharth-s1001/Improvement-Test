import java.util.HashMap;
import java.util.Map;

public class Qns1Main {
	public static void main(String[] args) {
		Qns1Main proj = new Qns1Main();
		proj.run();
	}
	
	public void run() {
		
		String places = "goa , kerala, gujarat";
		Map<String,String> map = new HashMap<String,String>();
		String place[]= places.split(", ");
		
		for (String val:place) {
			String location1= val.substring(0, 3).toUpperCase();
			
			String location2= val;
			
			map.put(location1,location2);
			
		
		}
		
		System.out.print("the iterated values are "+ map);
				
	}
}