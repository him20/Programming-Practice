package com.arrays;

public class Largest {

	
		// TODO Auto-generated method stub
		   public static void main(String[] args) {
			   
			           int[] numbers = {88,33,55,23,64,123};
			   
			          int largest = Integer.MIN_VALUE;
			   
			         
			   
			           for(int i =0;i<numbers.length;i++) {
			   
			               if(numbers[i] > largest) {
			   
			                largest = numbers[i];
			   
			               }
			   
			           }
			   
			           System.out.println("Largest number in array is : " +largest);
			 
			      

	}

}
