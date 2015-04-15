package hackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

			
		 public static void main(String[] args)
		    {
			 
			 int maxnumber=0;
		       Scanner stdin = new Scanner(System.in);
		       while(stdin.hasNextLine()) 
		       {
		           String str= stdin.nextLine();
		           if(str.length()>2){
		        	   for(int i=2; i<=str.length();i++){
		                   for (int j = 0; j <= str.length(); j++) {
		                       int k = i + j - 1;
		                       if (k >= str.length())
		                           continue;
		                       String s1 = str.substring(j, i + j);
		                       if (s1.equals(new StringBuilder(s1).reverse().toString())) {
		                    	   int number=0;
		                           for(int x=0; x<s1.length();x++){
		                        	   if(s1.charAt(x)=='A'){
		                        		   number=number+1;
		                        	   }
		                        	   else{
		                        		  // int abc= s1.charAt(x);
		                        		   number= number+(s1.charAt(x)-'A')+1;
		                        	   }
		                           }
		                         if(number>maxnumber){
		                        	 maxnumber= number;
		                         }
		                       }
		                   }

			           }
		           }
		           
		       }
		       stdin.close();
		       System.out.println(maxnumber);
		    }
 }

