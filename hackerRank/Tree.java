package hackerRank;

import java.util.Arrays;

public class Tree {

	
	public static void main(String[] args) {
		
		
		 int A[] ={2, 2, 3, 4, 3, 3, 2, 2, 1, 1, 2, 5};
		    int n = A.length;
		   
		    int extrema =0;
		    for(int i =0;i<n;i++){
		        int smaller =0,larger=0;
		       
		        if(i ==0){
		            while(i< n-1 && A[i] == A[i+1])
		                i++;
		            extrema++;       
		        }else{
		           
		            if(A[i] <A[i-1])
		                smaller =1;
		            else if(A[i]> A[i-1])   
		                larger =1;
		            while(i<n-1 && A[i] == A[i+1] ){
		                i++;
		            }
		            if(i<=n-2){
		                if(A[i] <A[i+1] && smaller ==1)
		                    extrema++;       
		                else if(A[i] > A[i+1] && larger ==1)
		                    extrema++;
		            }if(i ==n-1){
		                extrema++;
		            }
		        }
		    }
		    System.out.println(extrema);
	}

}
