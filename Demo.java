package demo;

public class Demo {

	public static void main(String[] args) {
int s1,s2,s3;
		
		s1=15;
		s2=70;
		s3=9;
		
		// 1. find  pass or fail
		// 2. passed in one subject---
		// 3. passed in 2 subjects
		
		if((s1>35) && (s2>35) && (s3>35)) {
			System.out.println("Pass");
				
		}
		else {
			System.out.println("Fail");
		}
		
		if( ( (s1>35) &&(s2>35) ) || ( (s1>35) &&(s3>35) )
				||( (s2>35) &&(s3>35) ) 
				
		 ) {
			System.out.println("Passed in 2 Subjects");
		}
		else {
			System.out.println("Not Passed in 2 Subjects");
		}
		
		
		if((s1 > 35) ||  (s2 > 35) ||  (s3 > 35)) {
			System.out.println("Passed in 1 Subjects");
		}
		else {
			System.out.println("not Passed in 1 Subjects");
		}
	}

	}


