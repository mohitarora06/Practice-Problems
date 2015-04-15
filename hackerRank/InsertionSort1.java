package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in= new Scanner(System.in);
			int s= in.nextInt();
			
			String array= in.nextLine();
			String[] arrayPart= array.split(" ");
			int[] ar= new int[s];
			for(int i=0; i<s; i++){
				ar[i]= Integer.parseInt(arrayPart[i]);
			}
			insertIntoSorted(ar);
			
	}
	 public static void insertIntoSorted(int[] ar) {
		 int number= ar.length;
		 int placement= ar[number-1];
			
			for(int i=number-2; i>=0; i--){
				if(ar[i]>placement){
					ar[i+1]= ar[i];
					System.out.println(Arrays.toString(ar));
				}
				else{
					ar[i+1]= placement;
					System.out.println(Arrays.toString(ar));
					break;
				}
			}
	 }

}
