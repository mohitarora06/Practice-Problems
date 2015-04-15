package CTCI;

public class QueueUsingStack {

	Stack stack1= new Stack();
	Stack stack2 = new Stack();
	
	public void enqueue(Object data){
		stack1.push(data);
		
	}
	
	public Object dequeue(){
		Object obj= new Object();
		if(stack2.head== null){
			while(stack1.head!= null){
				stack2.push(stack1.pop(stack1));		
			}
		}

			obj= stack2.pop(stack2);
		
		
		return obj;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingStack qus= new QueueUsingStack();
		qus.enqueue(1);
		qus.enqueue(2);
		qus.enqueue(3);
		qus.enqueue(4);
		
		System.out.println(qus.dequeue());
		System.out.println(qus.dequeue());
		System.out.println(qus.dequeue());
		System.out.println(qus.dequeue());
		System.out.println(qus.dequeue());
	}

}
