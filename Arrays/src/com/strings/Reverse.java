package com.strings;

public class Reverse {

	public static String main(String[] args) {
		// TODO Auto-generated method stub
		       String reverseMe(String s){
			   StringBuilder sb = new StringBuilder();
			   for(int i = s.length() - 1; i >= 0; --i)
			     sb.append(s.charAt(i));
			   return sb.toString();
			 }
	}

}
