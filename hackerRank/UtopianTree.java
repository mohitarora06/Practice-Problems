package hackerRank;

import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int value= Integer.parseInt(sn.nextLine());
		for(int i =0; i<value; i++){
			int cycles= Integer.parseInt(sn.nextLine());
			int height= 1;
			for(int j=1; j<=cycles; j++){
				if(j%2 == 0){
					height= height+1;
				}
				else{
					height = height *2;
				}
			}
			System.out.println(height);
		}
		
	}

}
