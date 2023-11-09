package n.demensional.arrays;

import java.util.Arrays;

public class ThreeDimensionalArray {

	public static void main(String[] args) {
	
		 int [][][]marks = {
				 {
					 {70,71},
					 {72,73}
					 
					 
				 },
				 {
					 {74,75},
					 {76,77}
					 
					 
				 }
				 
				 
				 
				 
				 
		 };
		
		System.out.println(Arrays.deepToString(marks));
		
		// int marks [][][] = new int[2][2][2]
		
		   for(int i = 0; i < 2; i++) {
			   for(int j = 0; j < 2; j++) {
				   for(int k = 0; k < 2; k++) {
					   System.out.println("marks: "+ marks[i][j][k]);
				   }
			   }
		   }
		       
		        	
		        		
		      
		        	
		        		
		        
		    	
		    	
		    
		
		

	}

}
