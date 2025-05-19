package myjavatest;

public class JavaBrushup1 {

	public static void main(String[] args) {
		
		
		//Arrays
		int[] arr = new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		
		for (int i=0; i<arr.length;i++)
		{
			
		System.out.println(arr[i]);
		
		}
		
		
		
		String[] arr2 = {"Nikita", "Ragh", "Patil"};
		
		for(String Name : arr2 )  //enhanced for loop from array called arr2 on every iteration pick one value and store in variable name 
		System.out.println(Name);

	}

}
