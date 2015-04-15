package CTCI;



public class Stack {
	
	Stack next;
	Object data;
	Stack head;
	
	public void push(Object data){
		Stack st= new Stack();
		if(head== null){
			head= new Stack();
			head.data= data;
			head.next= null;
		}
		else{
			st= head;
			Stack st1= new Stack();
			st1.data= data;
			st1.next= st;
			head= st1;
		}
	}
	public Object pop(Stack st){
		Object data= new Object();
		if(st.head != null){
			data= head.data;
			st.head= head.next;
		}
		else{
			data= null;
		}
		
	return 	data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Stack st= new Stack();
			st.push(1);
			st.push(2);
			st.push(3);
			st.push(4);
			System.out.println(st.pop(st));
			System.out.println(st.pop(st));
			System.out.println(st.pop(st));
			System.out.println(st.pop(st));
	}

}
