package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class SumOfNumbersInArray {

	public static void main(String[] args) {
     
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
        int noOfTests = in.nextInt();
        //int notoAddTo= in.nextInt();
       
        for(int i=0;i<noOfTests;i++){
        	int notoAddTo= in.nextInt();
        	int noOfElements= in.nextInt();
        	 ArrayList<Integer> ar = new ArrayList<Integer>();
        	for(int j=0; j<noOfElements; j++){
        		ar.add(in.nextInt());
        	}
        	if(ar.size()>1){
           ArrayList<Integer> forSort= new ArrayList<Integer>();
           forSort.addAll(ar);
           Collections.sort(forSort);
           
           int start= 0;
           int end= forSort.size()-1;
           int count=0;
           while(start<end){
        	   if((forSort.get(start)+forSort.get(end))>notoAddTo){
        		   end--;
        		  continue;
        	   }
        	   if((forSort.get(start)+forSort.get(end))<notoAddTo){
        		   start++;
        		   continue;
        	   }
        	   if((forSort.get(start)+forSort.get(end))== notoAddTo){
        		   if(forSort.get(start)== forSort.get(end)){
        			   int first= ar.indexOf(forSort.get(start))+1;
            		   int second= ar.indexOf(forSort.get(end))+2;
            		   System.out.println(first+ " "+second);
        		   }
        		   else{
        			   int first= ar.indexOf(forSort.get(start))+1;
            		   int second= ar.indexOf(forSort.get(end))+1;
            		   System.out.println(first+ " "+second);
        		   }
        		   
        		   
        		   break;
        	   }
           }
        	}
        	else{
        		System.out.println(ar.get(0));
        	}
        }
        
       // partition(ar);
    }
}
