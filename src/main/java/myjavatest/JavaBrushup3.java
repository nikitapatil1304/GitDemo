package myjavatest;
import java.util.ArrayList;

public class JavaBrushup3 {

	public static void main(String[] args) {
		
		//1. Create a new array called values to store numerical values of your choice
		
		int[] values =new int[9];
		values[0] = 1;
		values[1] = 2;
		values[2] = 3;
		values[3] = 4;
		values[4] = 5;
		values[5] = 6;
		values[6] = 7;
		values[7] = 8;
		values[8] = 9;
		
		// Print even numbers and odd numbers
		
		for(int i=0; i<values.length; i++)
		{
			if(values[i]%2==0)
			{
				System.out.println("Even number:" + values[i]);
				//break;
			}
			else
			{
				System.out.println("Odd number:" + values[i]);
				//break;
			}
		}
		
		//2 Print 1st and last element of an array
		System.out.println(values[0]); //print 1st element of array
		System.out.println(values[values.length - 1]); //Print last element of array
		
		
		//Using a loop, print the elements of the values array in reverse order.
		
		for(int i=values.length-1 ;i>=0; i--)
		{
			System.out.print(values[i]);
			
		}
		
		//Calculate the total number of elements within the numbers array.
		
		System.out.println("total number of elements in array:" + values.length);
		
		
		
		//arrayList
		
		System.out.println("*************************");
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Nikita");
		names.add("Ragh");
		names.add("Patil");
		names.add("Test");
		
		System.out.println(names.isEmpty());
		System.out.println(names.contains("Nikita"));
		System.out.println(names.size());
		System.out.println(names.getLast());
		names.remove(3);
		System.out.println(names.size());
		
		System.out.println(names.getFirst());
		System.out.println(names.getLast());
		System.out.println(names.get(1));
		
		
	}

}
