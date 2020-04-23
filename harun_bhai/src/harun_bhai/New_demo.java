package harun_bhai;

import java.util.Scanner;

public class New_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int i=2;
   double d=5.2;
   int x=4;
   int a=7;
   int b=3;
   int c=20;
   sum(a,b,c);
   min(a,b);
  mul(i,x); 
	div(i,c);
	
	
	}
	
	public static void min(int a,int b) {
		
		System.out.println(a-b);
	}
	
	 public static void mul(int i, int x) {
		System.out.println(i*x);
	}
	public static void div(int i, int c) {
		System.out.println(i/c);
	}
	public static void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
		public static void abc() {
			
			Scanner input =new Scanner(System.in);
			System.out.print("Give me a number :");
		 int sum=input.nextInt();
}}
