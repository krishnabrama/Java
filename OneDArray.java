package n.demensional.arrays;

import java.util.Arrays;

public class OneDArray {

	public static void main(String[] args) {
		
  	    int[] marks = new int[5];
		marks[0] = 65;
		marks[1] = 64;
		marks[2] = 73;
		marks[3] = 78;
		marks[4] = 89;

		    System.out.println(Arrays.toString(marks));
		
		double total = 0;
		for(int mark:marks) {
			total = total + mark;
		}
		
		double percentage = total/marks.length;
		
		System.out.println("percentage" + percentage);
			}

		
		
}
