package harun_bhai;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
	
//		int e=2;
//		int a=9;
//		int b=8;
//		int c=3;
//		double d=12.90;
//		double equation = a+b*b-c+e;
//			
	//	System.out.println(a+b);
      //  System.out.println(b-c);
        //System.out.println(b*d);
		//System.out.println(equation);
		
		equation();
	}
		
		public static void equation(){
		
		Scanner input=new Scanner(System.in);	
			
		System.out.print("give me a 1st number:");
	
		int p=input.nextInt();
		
		System.out.print("2nd num:");
		int s=input.nextInt();
		
		System.out.println(s+p);
		int result=s+p;
		
		if (result==result) {
			System.out.println("answer is right");
		}
		
		else{
			System.out.println("answer is wrong ");
		}
		
		}
			
		
		
		
		
		
		
	}


