package hackerRank;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class LargestPerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String size= in.nextLine();
		String arraySize[]= size.split(" ");
		
		int noOfrows= Integer.parseInt(arraySize[0]);
		int noOfColumns= Integer.parseInt(arraySize[1]);
		TreeMap<Integer, ArrayList<String>> points= new  TreeMap<Integer, ArrayList<String>>();
		for(int i=0; i< noOfrows;i++){
				ArrayList<String> rowValues= new ArrayList<String>();
				String rows= in.nextLine();
				String[] rowElements= rows.split("(?!^)");
				for(int k=0; k< rowElements.length;k++){
					rowValues.add(rowElements[k]);
				}
			points.put(i,rowValues);
		}
		
		int perimeter= findPerimeter(points);
		if(perimeter==0){
			System.out.println("impossible");
		}
		else{
			System.out.println(perimeter);
		}
		
		
			
		
	}

	private static int findPerimeter(TreeMap<Integer, ArrayList<String>> points) {
		// TODO Auto-generated method stub
		int start=0;
		int end= points.size()-1;
		
		while(end>start){
			ArrayList<String> first= points.get(start);
			ArrayList<String> second= points.get(end);
			int size= first.size();
			if(first.contains("x") || second.contains("x")){
				if((first.get(0)).equals("x")  || (first.get(first.size()-1).equals("x"))){
					start++;
				}
				else if((second.get(0)).equals("x")  || (second.get(first.size()-1).equals("x"))){
					end--;
				}
				else{
					return(2*((end-start)+(first.size()-1)));
				}
			}
			else{
				return(2*((end-start)+(first.size()-1)));
			}
			
		
		}
		return 0;
	}

}
