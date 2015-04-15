package hackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Stick {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		
		Scanner in = new Scanner(System.in);
        int res;
        
        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        int b= _a.length;
        int b_array[]= null;
        System.out.println(_a.length);
        while(b!=1){
        	
        	
        	if(b_array==null){
        		b_array =sticks(_a);
        	}
        	else{
        		b_array =sticks(b_array);
        	}
        	b= b_array.length;
        	System.out.println(b);
        }
    }
	
	private static int[] sticks(int[] _a) {
		// TODO Auto-generated method stub
		int smallest=0;
		int returnArray[];
    	ArrayList<Integer> b_list= new ArrayList<Integer>();
    	for(int i=0; i<_a.length;i++){
    		if(i==0){
    			smallest=_a[i];
    		}
    		else{
    			if(_a[i]<smallest){
        			smallest=_a[i];
        		}
    		}
    		
    	}
    	for(int i=0;i<_a.length;i++){
    		int b= _a[i]-smallest;
    		
    		if(b!=0){
    		b_list.add(b);
    		}
    	}
    	returnArray= new int[b_list.size()];
    	for(int i=0;i<b_list.size();i++){
    		returnArray[i]= b_list.get(i);
    	}
		return returnArray;
	}
}
