package com.strings;

import java.io.File;
import java.util.Scanner;

public class CountOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		{
		
			        String name;            //String for user input
			
			        String name1 = null;
			
			        String letter;          //Letter that the user enters
			
			        char charLetter;        //Get the character in string
			
			        int i;                  //For counting number of characters in string
			
			        int count = 0;          //For counting how many characters in string
			
			         
		
			        //Create scanner object
			
			       Scanner keyboard = new Scanner(System.in);
		
			         
			
			        //Get the file name
			
			        System.out.println("Enter file name test.txt to open that file");
			
			    name = keyboard.nextLine();
			
			         
			
			        //Open the file
			
			        File file = new File(name);
			
			        Scanner inputFile = new Scanner(file);
			
			         
			
			        //Read all lines from the file
			
			        while (inputFile.hasNext())
			
			        {
			
		          name1 = inputFile.nextLine();
			
			        }


	}

}
	  //Get the character to count
	
	        System.out.println("Please enter any letter in the file.");
	
	        letter = keyboard.nextLine();
	
	        charLetter = letter.charAt(0);
	
	         

	        //Controlled loop to count characters
	
	        for (i = 0; i < name1.length(); i++)

	        {
	Object name1;
	Object charLetter;
	if (((Object) name1).charAt() == charLetter)

	            {
	
	                int count;
					count++;
	
	            }
	
	        }
	
	        System.out.println("The number of times the entered letter appears in " +
	
	                            "text.txt is  " + count);
	
	        inputFile.close();
	
	    }
	
	}

