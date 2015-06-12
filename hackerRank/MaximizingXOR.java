package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class MaximizingXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        ArrayList<Integer> results= new ArrayList<Integer>();
        for(int i= _l; i<=_r; i++){
        	for(int j= i; j<= _r; j++){
        		res = maxXor(i,j);
        		results.add(res);
        	}
        }
        Collections.sort(results);
        System.out.println(results.get(results.size()-1));
        
	}

	 static int maxXor(int l, int r) {
		 int result;
		 String dummy= "0";
		 String left= Integer.toString(l,2);
		 String right = Integer.toString(r, 2);
		 String res= "";
		 if(right.length()<=left.length()){
			 int mid= left.length()- right.length();
			 for(int i =0; i<left.length(); i++){
				 if(i<mid && mid!=0){
					 String midRes = Integer.toString(left.charAt(i)^dummy.charAt(0));
					 res= res+ midRes;
				 }
				 else{
					 String midRes = Integer.toString(left.charAt(i)^right.charAt(i-mid));
					 res= res+ midRes; 
				 } 	
			}
		 }
		 else{
			 int mid= right.length()- left.length();
			 for(int i =0; i<right.length(); i++){
				 if(i<mid){
					 String midRes = Integer.toString(right.charAt(i)^dummy.charAt(0));
					 res= res+ midRes;
				 }
				 else{
					 String midRes = Integer.toString(left.charAt(i- mid)^right.charAt(i));
					 res= res+ midRes; 
				 } 	
			}
		 }
		 

		 result= Integer.parseInt(res, 2);
		 return result;
		 
	 }
}
