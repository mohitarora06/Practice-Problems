package geekForGeeks;

import java.util.LinkedHashMap;
import java.util.Map;

public class RunLengthEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string= "fafafffddddssssaaaaaeeeeerrrrr";
		RunLengthEncoding runLengthEncoding= new RunLengthEncoding();
		System.out.println(runLengthEncoding.runLengthEncoding(string));
		System.out.println(runLengthEncoding.allSameTogether(string));
	}

	public String runLengthEncoding(String string){
		String returnResult= "";
			for(int i= 0; i<string.length(); i++){
				char initial= string.charAt(i);
				int count = 1;
					while(i+1!= (string.length()) && initial== string.charAt(i+1)){
						i++; 
						count++; 
					}	
				
				returnResult= returnResult+ initial+count;
			}
		return returnResult;
	}
	public String allSameTogether(String string){
		String returnString= "";
		LinkedHashMap<String,Integer> count= new LinkedHashMap<String, Integer>();
			for(int i=0; i<string.length(); i++){
				if(count.size()!=0 && count.containsKey(Character.toString(string.charAt(i)))){
					int countNumber= count.get(Character.toString(string.charAt(i)));
					count.put(Character.toString(string.charAt(i)), (countNumber+1));
				}
				else{
					count.put(Character.toString(string.charAt(i)), 1);
				}
			}
			for(Map.Entry<String,Integer> entry : count.entrySet()){
				returnString= returnString+ entry.getKey()+entry.getValue();
			}
		return returnString;
	}
}
