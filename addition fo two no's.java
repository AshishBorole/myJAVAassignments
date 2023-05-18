//Write a program to adddition of two numbers.
// statring step by step with basics

  import java.util.Scanner;
      public class add{
	public static void main(String[] ards) {
	  int num1, num2, sum;
	Scanner sc = new Scanner(System.in);

	System.out.print("enter first number: ");
	num1 = sc.nextInt();
	
	System.out.print("enter second number: ");
	num2 = sc.nextInt();
	
	sum = num1 + num2;
	System.out.println("sum of "+ num1 +" and " + num2+"is"+ sum); 
  }
}