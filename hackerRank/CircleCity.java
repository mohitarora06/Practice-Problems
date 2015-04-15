package hackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CircleCity {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner in = new Scanner(System.in);
        int noOfTests = in.nextInt();
        //int notoAddTo= in.nextInt();
       
        for(int i=0;i<noOfTests;i++){
        	int sqrOfradius= in.nextInt();
        	double noOfPosts= in.nextDouble();
        	int count=0;
        	double radius= Math.sqrt(sqrOfradius);
        	for(int j=0; j<(int)radius; j++){
        		int number= sqrOfradius- (j*j);
        		double secondNumber= Math.sqrt(number);
        		if(secondNumber== (int)secondNumber){
        			count++;
        		}
        	}
        	if(noOfPosts>=(count*4)){
        		System.out.println("Possible");
        	}
        	else{
        		System.out.println("Impossible");
        	}
        }
	}

}
