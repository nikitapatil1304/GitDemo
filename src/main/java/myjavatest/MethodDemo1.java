package myjavatest;

public class MethodDemo1 {

	public static void main(String[] args) {
		//Methods - set of code which we can use multiple times by calling it in main method
		
		//Create an object of method to access the class method as method is not static
		MethodDemo1 m1 = new MethodDemo1();
		m1.getNothing();
		
		
		//methods can be accessed without creating an object when method declared is static
		String s = getUser();
		System.out.println(s);
		
		//Accessing method defined outside the class by creating an object
		MethodDemo2 m2 = new MethodDemo2();
				m2.getData();
		
		
	}

	
	//methods should be created outside the class
	
	public void getNothing()
	{
		System.out.println("function with void");
	}
	
	public static String getUser()
	{
		System.out.println("Function with String");
		return "User Nikita";
	}
	public void nothing2()
	{
		System.out.println("Nothing");
	}
}
