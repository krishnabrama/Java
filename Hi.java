package bynary.operators;

public class Hi {

	public static void main(String[] args) {

		// 9 % 5--- 1
		// 5 --1
		// 2 ---2
		
		int note=17, n5=0,n2=0,n1=0;
		if(note >= 5) {
			n5 = note/5;
			note = note % 5;
		}
		if(note >=2) {
			n2 = note/2;
			note = note % 2;
			
		}
		if(note<2 && note>0) {// 1
			n1 = 1; 
		}
		
		System.out.println("5 notes---->"+n5);
		System.out.println("2 notes---->"+n2);
		System.out.println("1 coins---->"+n1);
		
		
	}
}
