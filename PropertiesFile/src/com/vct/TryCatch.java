package com.vct;

public class TryCatch {
	public void m1() {
		try {
			int a = 10/0;
					System.out.println("try block");
		}	
		
		//System.out.println();
		
		catch (Exception e) {
			System.out.println("catch block");
		}
		finally {
			System.out.println("finally bock");
		}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		}
}