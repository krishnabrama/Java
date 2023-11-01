package bynary.operators;

public class Relationalop {

	public static void main(String[] args) {
		int x = 10, y = 22;
		String n = "22";
		System.out.println(x == y);
		
		x = x*2;
		System.out.println(x <= y);
		
		
		x += 2;
		System.out.println(x == y);
		System.out.println(x != y);
		
		System.out.println(x >= y);
		
		int age = 18;
		
		if(age >= 18) {
			  System.out.println("the person is elgible to vote");	
		}
		else {
			 System.out.println("the person is not elgible to vote");  
		}
	}

}
