package geekForGeeks;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= "MMMmmm AAA aaa asss dsdsaasas s f";
		NonRepeatingCharacter nc= new NonRepeatingCharacter();
		
		System.out.println(nc.nonRepeatingElement(name));
	}
	
	public char nonRepeatingElement(String string){
		char nonrepElement= ' ';
		LinkedHashMap<Character,Integer> chars= new LinkedHashMap<Character, Integer>();
			for(int i =0; i<string.length(); i++){
				if(chars.size()!=0){
					if(chars.containsKey(string.charAt(i))){
						chars.put(string.charAt(i),(chars.get(string.charAt(i))+1));
					}
					else{
						chars.put(string.charAt(i), 1);
					}
				}
				else{
					chars.put(string.charAt(i), 1);
				}
			}
			for(Map.Entry<Character, Integer> entry : chars.entrySet()){
				if(entry.getValue()== 1){
					nonrepElement= entry.getKey();
					break;
				}
			}
		
		return nonrepElement;	
	}
}
