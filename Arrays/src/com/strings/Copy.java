package com.strings;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		      try {
		          FileReader fr=new FileReader("1.txt");
		          FileWriter fw=new FileWriter("2.txt");
		          int c=fr.read();
		          while(c!=-1) {
		            fw.write(c);
		          }
		      } catch(IOException e) {
		          System.out.println(e);
		      } finally() { 
		          fr.close();
		          fw.close();
		      }
		    }
		
	}

}
