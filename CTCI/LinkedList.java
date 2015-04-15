package CTCI;

public class LinkedList {

	LinkedList next;
	Object data;
	
	/*public LinkedList(){
		//next = new LinkedList(data);
		this.data = null;
	}*/
	
	public void add(Object data){
		LinkedList ls= new LinkedList();
		if(next==null){
			ls.next= null;
			ls.data = data;
			next= ls;
			//ls.data= null;
		}
		else{
			ls= next;
			while(ls.next != null){
				ls= ls.next;
			}
			LinkedList ls1= new LinkedList();
			ls1.data= data;
			ls1.next= null;
			ls.next= ls1;
			//ls.data= data;
		}	
	}
	public void remove(int count){
		LinkedList ls= new LinkedList();
		ls= next;
		int i=0;
		while(i != count-1){
			i++;
			ls= ls.next;
		}
		ls.next= ls.next.next;
	}
	public void print(LinkedList ls){
		while(ls!= null){
			System.out.println(ls.data);
			ls= ls.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ls= new LinkedList();
		ls.add("Mohit");
		ls.add("Mohit 1");
		ls.add("Mohit 2");
		ls.add("Mohit 3");
		ls.add("Mohit 4");
		ls.remove(2);
		ls.print(ls);
	}
	

}
