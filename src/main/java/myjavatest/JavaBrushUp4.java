package myjavatest;
import java.util.List;

public class JavaBrushUp4 {

	public static void main(String[] args) {
		
		
		String s1 = "Nikita Raghavendra Patil";
		String s2 = "Nikita Raghavendra Patil";  //String literal [In this case s2 will point to s1 memory only as it has same value of String S1]
		String s3 = "Hello"; //In this case new memory allocation happens as S3 has different value
		
		String s4 = new String(); //allocates memory as we have created object using new operator
		String s5 = new String(); //allocates memory as we have created object using new operator


		String[] splittetValues= s1.split("Raghavendra");
		System.out.println(splittetValues[0]);
		System.out.println(splittetValues[1]);
		System.out.println(splittetValues[1].trim());

		for(int i=0; i<s2.length();i++)
		{
			
			System.out.println(s1.charAt(i));
		}
		System.out.println("__________________________");
		
		//print string in reverse order
		
		for(int i=s1.length()-1; i>=0 ; i--)
		{
			
			System.out.println(s1.charAt(i));
		}
		
	}

}
