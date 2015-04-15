package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sn = new Scanner(System.in);
			int value= Integer.parseInt(sn.nextLine());
			
			int size= Integer.parseInt(sn.nextLine());
			int[] arrayOfIntegers= new int[size];
			String next = sn.nextLine();
	        String[] next_split = next.split(" ");
			for(int i=0; i<size;i++){
				arrayOfIntegers[i]= Integer.parseInt(next_split[i]);
			}
			
			for(int i=0;i<size;i++){
				if(value==arrayOfIntegers[i]){
					System.out.println(i);
				}
			}
	}

}
