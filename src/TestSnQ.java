
public class TestSnQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s = new Stack();
		s.push("Red");
		s.push("Orange");
		s.push("Purple");
		s.push("Gold");
		s.printList();
		s.pop();
		System.out.println();
		s.printList();
		
		System.out.println();
		Queue q = new Queue();
		q.enqueue("Green");
		q.enqueue("Brown");
		q.enqueue("Yellow");
		q.enqueue("Gray");
		q.printList();
		System.out.println();
		q.dequeue();
		q.printList();
		
		System.out.println("Moving a Stack to a Queue");
		

	}

}
