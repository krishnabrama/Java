package bynary.operators;

public class HelloJava {

	public static void main(String[] args) {
		
	
		 char ch;
		ch = 'J';
		//a--97+25--122
		// lower --- 97 -- 156
		// upper ----65 -90---- A--Z
		
		System.out.println(ch+ " ...ascii value-->"+(int)ch);
		if ( (ch >= 97) && (ch <= 122)) {
			System.out.println("Character is Lower Case");
		}
		else if ( (ch >= 65) && (ch <= 90)) {
			System.out.println("Character is Upper Case");
		}
		
	}

}
	
		