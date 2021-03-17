
import java.util.*;
import java.util.stream.*;

public class Qns12 {

	public static void main(String[] args) {
		Qns12 project = new Qns12();
		String input[] = {"arun#12#12#12","deepak#13#12#12"};
		String studentName = project.evaluate(input);
		System.out.println(studentName);

	}
	
	public String evaluate(String[] input) {
		 Map<String, Integer> newStudentInfo=new HashMap<String, Integer>();
		  for(int i=0;i<input.length;i++){
			   String inputPart1=input[i]; 
			   StringTokenizer t=new StringTokenizer(inputPart1,"#");
			   String inputPart2=t.nextToken();
			   int n1=Integer.parseInt(t.nextToken());
			   int n2=Integer.parseInt(t.nextToken());
			   int n3=Integer.parseInt(t.nextToken());
			   int n=n1+n2+n3;
			   newStudentInfo.put(inputPart2, n);
		  }
			
		  int max=0;
		  String finalOutput=new String();
		  Iterator<String> i=newStudentInfo.keySet().iterator();
		  while(i.hasNext()){
		   String inputPart3=i.next();
		   int j=newStudentInfo.get(inputPart3);
		   if(j>max){
		    max=j;
		    finalOutput=inputPart3; }
		  }
		  return finalOutput;
			
		}
		   
		  
		
	}
