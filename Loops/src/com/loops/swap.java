package com.loops;

import java.util.Scanner;

public class swap {

	public void swap1() {

		int a = 10;
		int b = 20;
		System.out.println("value of a and b before swapping, a: " + a + " b: " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("value of a and b after swapping, a: " + a + " b: " + b);
	
	}
	
	public void swap2(){

		int x, y, temp;
		System.out.println("Enter x and y");
		Scanner in = new Scanner(System.in);

		x = in.nextInt();
		y = in.nextInt();

		System.out.println("Before Swapping\nx = " + x + "\ny = " + y);

		temp = x;
		x = y;
		y = temp;

		System.out.println("After Swapping\nx = " + x + "\ny = " + y);
	}
	
	public static void main(String[] args) {
		swap s=new swap();
		s.swap1();
		s.swap2();

	}

}
