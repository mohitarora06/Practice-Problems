package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QuickSort1 {
	// static ArrayList<Integer> finalList= new ArrayList<Integer>();
	static ArrayList<Integer> partition(ArrayList<Integer> ar) {
		if(ar.size()<=1){
			return ar;
		}
		 ArrayList<Integer> bigger= new ArrayList<Integer>();
	     ArrayList<Integer> smaller= new ArrayList<Integer>();
	     int pe= ar.get(0);
        if(ar.size()!=0){
        	
        	for(int i=0; i<ar.size();i++){
        		if(pe<ar.get(i)){
        			bigger.add(ar.get(i));
        		}
        		else if(pe>ar.get(i)){
        			smaller.add(ar.get(i));
        		}
        	}
        	
            	 partition(smaller);
            	 partition(bigger);
            	//return bigger;
            
        }
        
        ArrayList<Integer> list= new ArrayList<Integer>();
        list.addAll(smaller);
        list.add(pe);
        list.addAll(bigger);
        printArray(list);
        return list;
      
       
    }   

static void printArray(ArrayList<Integer> ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
           ar.add(in.nextInt()); 
        }
        
        partition(ar);
    }    
}
