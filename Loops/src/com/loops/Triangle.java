package com.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Triangle {

	public static void main ( String arg[] ){
        InputStreamReader istream = new InputStreamReader(System.in) ;
        BufferedReader read = new BufferedReader(istream) ;
        System.out.print("Enter Triangle Size : ");
        int num=0;
        try{
            num=Integer.parseInt( read.readLine() );
        } catch(Exception Number){
            System.out.println("Invalid Number!");
        }
            for(int i=1;i<=num;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                
                System.out.println();
            }
    }

}
