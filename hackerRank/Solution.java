package hackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	Scanner in = new Scanner(System.in);
        int res;
        
        int a_size = Integer.parseInt(in.nextLine());
        int[][] a = new int[a_size][a_size];
        int a_item;
        
        
        for(int i = 0; i < a_size; i++) {
        	String next = in.nextLine();
        	String[] next_split= next.split("(?!^)");
        	for(int j = 0; j < a_size; j++){
                	a_item = Integer.parseInt(next_split[j]);
                    a[i][j] = a_item;	
        	}
            
        }
        for(int i = 0; i < a_size; i++) {
        	for(int j = 0; j < a_size; j++){
        		int x=0;
        		if(j!=0 && j!=a_size-1){
        			if(a[i][j-1]<a[i][j] && a[i][j+1]<a[i][j]){
        				//x=a[i][j];
        				//a[i][j]= -1;
        				System.out.print("X");
        				continue;
        			}
        		}
        		
        			System.out.print(a[i][j]);
        		
        		
        	}
        	System.out.println();
            
        }
        
    }
    
   
}