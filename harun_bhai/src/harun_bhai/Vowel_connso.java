package harun_bhai;

import java.util.Scanner;

public class Vowel_connso {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner input=new Scanner(System.in);	
		char ch;
		System.out.print("Enter a letter: ");
		ch =input.next().charAt(0);
		
	
	
		if (ch=='a'|| ch=='e' || ch=='i'|| ch=='o'|| ch=='u') {
			
		System.out.println("letter is vowel");
	
		}
		else 
				System.out.println("letter is conson");
			
		
		
		
		
		
		
		
	}

}
