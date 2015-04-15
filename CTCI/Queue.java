package CTCI;

public class Queue {
	Queue head;
	Queue tail;
	Queue next;
	Object data;
	Queue previous;
	
	public void enqueue(Object data){
		if(head== null && tail== null){
			head= new Queue();
			head.data= data;
			tail= new Queue();
			head.next= tail;
			tail.previous= head;
		}
		else if(head.next== tail){
			Queue q= new Queue();
			q.data= data;
			head.next= q;
			tail.previous= q;
			q.next= tail;
			q.previous= head;
		}
		else if(head.next!= tail){
			Queue q= new Queue();
			q.data = data;
			Queue q1= tail.previous;
			q1.next= q;
			q.next= tail;
			q.previous= q1;
			tail.previous= q;
		}
	}
	public Object dequeue(Queue q){
		Object obj= new Object();
		if(q.head== null){
			obj= "queue is empty";
		}
		else if(q.head.next != q.tail){
			obj= q.head.data;
			Queue q1= head.next;
			q.head= q1;
			q1.previous = null;
		}
	
		else if(q.head.next== q.tail){
			obj= q.head.data;
			q.head= null;
			q.tail= null;
		}
		
		return obj;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue q= new Queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);

		System.out.println(q.dequeue(q));
		System.out.println(q.dequeue(q));
		System.out.println(q.dequeue(q));
		System.out.println(q.dequeue(q));
		System.out.println(q.dequeue(q));
	}

}
