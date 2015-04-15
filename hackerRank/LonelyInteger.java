package hackerRank;

import java.io.*;
import java.io.ObjectInputStream.GetField;
import java.util.*;
import java.util.Map.Entry;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LonelyInteger {
static int lonelyinteger(int[] a) {
    if(a.length!=0){
        if(a.length==1){
            return a[0];
        }
        else{
        	TreeMap<Integer, Integer> values= new TreeMap<Integer, Integer>();
        	int count=1;
            for(int i=0; i<a.length; i++ ){
                if(i==0){
                	count=1;
                	values.put(a[i], count);
                }else{
                	if(values.containsKey(a[i])){
                		count= 1+ values.get(a[i]);
                		values.put(a[i], count);
                	}
                	else{
                		count=1;
                		values.put(a[i], count);
                	}
                }
            }
            int minimumValue= Collections.min(values.values());
            for(Entry<Integer, Integer> entry : values.entrySet()) {  
            if (entry.getValue()==minimumValue) {
                return entry.getKey();
            	}
            }
        }
    }
    
return 0;

    }
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        
        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        
        res = lonelyinteger(_a);
        System.out.println(res);
        
    }
}