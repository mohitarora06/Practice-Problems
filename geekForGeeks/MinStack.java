package geekForGeeks;

import java.util.Stack;

public class MinStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st= new Stack();
		Stack stMin= new Stack();
		
		MinStack mn= new MinStack();
		mn.pushValue(2, st, stMin);
		mn.pushValue(8, st, stMin);
		mn.pushValue(1, st, stMin);
		mn.pushValue(5, st, stMin);
		mn.pushValue(5, st, stMin);
		mn.pushValue(4, st, stMin);
		mn.pushValue(1, st, stMin);
		mn.pushValue(3, st, stMin);
		
		System.out.println(mn.minValue(stMin));
		System.out.println(mn.pullValue(st, stMin));
		System.out.println(mn.minValue(stMin));
		System.out.println(mn.pullValue(st, stMin));
		System.out.println(mn.minValue(stMin));
		System.out.println(mn.pullValue(st, stMin));
		System.out.println(mn.minValue(stMin));
		System.out.println(mn.pullValue(st, stMin));
		System.out.println(mn.minValue(stMin));
		System.out.println(mn.pullValue(st, stMin));
		System.out.println(mn.minValue(stMin));
		System.out.println(mn.pullValue(st, stMin));
		System.out.println(mn.minValue(stMin));
		System.out.println(mn.pullValue(st, stMin));
		

	}
	
	public void pushValue(int obj, Stack st, Stack stMin){
		if(stMin.isEmpty()){
			stMin.push(obj);
			st.push(obj);
		}
		
		else{
			int minValue= (int) stMin.peek();
			if(obj<= minValue){
				stMin.push(obj);
				st.push(obj);
			}
			else{
				st.push(obj);
			}
		}
		
	}
	public int pullValue(Stack st, Stack stMin){
		int returnValue=0;
		if((int)stMin.peek() == (int)st.peek()){
			returnValue= (int)st.pop();
			stMin.pop();
		}
		else{
			returnValue= (int)st.pop();
		}
		return returnValue;
	}
	public int minValue(Stack stMin){
		return (int) stMin.peek();
	}
}
