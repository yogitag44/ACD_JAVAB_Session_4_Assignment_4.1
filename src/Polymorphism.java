import java.util.Scanner;


//Class to show method OVERLOADING (SAME method name but DIFFERENT numbers arguments)
class FirstClass{
	
	void Calculations(int num1, int num2) {   //First method with two integer parameters
		System.out.println("Sum of Two number num1 + num2 = "+ (num1 + num2));  //performing sum of two integers (this will be override in below class)
	}
	
	void Calculations(int num3, int num4, int num5, String Name ) { //Second method with same name but different parameters
																	//having three integer and one string parameter
		System.out.println("This is overloading String example and string is: "+ Name);		//getting string from the main method
		
		System.out.println(("Sum of three number num3 + num4 + num5 = ")+(num3+ num4 + num5));   //Printing sum of two numbers passed from main method in this class
	}
}

//Extending parent class to show method OVERRIDING (SAME method and SAME numbers of arguments).
class Multiplication extends FirstClass{  //Another class extending the parent class (Inheritance)
	
	void Calculations(int num6, int num7) { //Same Method defined above with same number and type of arguments
				System.out.println("\nMultiplication of two number num6 * num7 = "+ (num6 * num7));  //Multiplying two numbers received from the main method
	}
}

public class Polymorphism {   //Class with main method

	public static void main(String args[]) {
		
System.out.println("========Example to show OVERLOADING using class FirstClass with method Calculations=======\n");
		FirstClass NSum = new FirstClass();   //Object of Parent Class
	NSum.Calculations(20,30);  						//Calling two integer parameterized method Calculations
	NSum.Calculations(40,50,60,"I am Overloaded String");   //calling three parameterized method Calculations

System.out.println("\n========Example to show OVERRIDING using class Multiplications which extends FirstClass=======");
	Multiplication PObj = new Multiplication();   //created object of Child class
	PObj.Calculations(40, 90);  //Calling child class with same name in parent class and with same type and number of parameters.
	
	}
}
