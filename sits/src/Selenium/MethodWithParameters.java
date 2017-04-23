package Selenium;

public class MethodWithParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int b =30;
		
		addTwoNumbers(a,b);
		substration(a,b);
	}

	private static void substration(int a, int b) {
		// TODO Auto-generated method stub
		int c =b-a;
		System.out.println("The difference of the given numbers:"+c);
	}

	private static void addTwoNumbers(int a, int b) {
		// TODO Auto-generated method stub
		int c =b+a;
		System.out.println("The sum of the given numbers:"+c);
		
	}

}
