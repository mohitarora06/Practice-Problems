package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SherlockAndArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int numberOfSamples= in.nextInt();
		
		for(int j=0; j<numberOfSamples; j++){
			ArrayList<Integer> number= new ArrayList<Integer>();
			int numberOfElements= in.nextInt();
			for(int i=0; i<numberOfElements; i++){
				number.add(in.nextInt());
			}
			String result= findingSeparableElement(number);
			System.out.println(result);
		}	
	}

	private static String findingSeparableElement(ArrayList<Integer> number) {
		// TODO Auto-generated method stub
		//Collections.sort(number);
		int start= 0;
		int end= number.size()-1;
		int sumEnd=0;
		int sumFront=0;
		while(start<end && end>start){
			if(sumFront>sumEnd){
				sumEnd= sumEnd+ number.get(end);
				--end;
			}
			else if(sumFront<sumEnd){
				sumFront= sumFront + number.get(start);
				++start;
			}
			else{
				sumEnd= sumEnd+ number.get(end);
				sumFront= sumFront + number.get(start);
				--end;
				++start;
			}
		}
		if(sumEnd== sumFront){
			return "YES";
		}
		else{
			return "NO";
		}
	}

}
