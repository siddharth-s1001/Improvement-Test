
public class Qns5 {

	public static void main(String[] args) {
	Qns5 project = new Qns5();
	project.run("Hello*World");
}

public boolean run(String name) {
	char charArray[] = name.toCharArray();
	int count = 0;
	System.out.println(run("Hello*World"));
	for (char element : charArray) {
		if (element == '*') {
			count++;
		}
	}
	
	
	
	if (count > 0) {
		String values[] = name.split("*");
		if (values[0].equalsIgnoreCase(values[1])) {
			return true;
		}
	}
	return false;
}

}