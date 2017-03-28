
public class TestSnQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s = new Stack();
		System.out.println("Creating a Stack and adding Strings then printing:");
		s.push("Red");
		s.push("Orange");
		s.push("Purple");
		s.push("Gold");
		s.printList();
		System.out.println("\nPopping an item then printing the list again:");
		s.pop();
		System.out.println();
		s.printList();
		
		System.out.println();
		Queue q = new Queue();
		System.out.println("Adding Strings to a Queue then printing elements ");
		q.enqueue("Green");
		q.enqueue("Brown");
		q.enqueue("Yellow");
		q.enqueue("Gray");
		q.printList();
		System.out.println("\nRemoving an element using dequeue and then printing again:");
		
		q.dequeue();
		q.printList();
		
		System.out.println("\nMoving a Stack to a Queue"
				+ "\nUsing the same stack from before: " + "\n");
		Link temp = s.peek();
		Queue q2 = new Queue();
		while(temp != null){
			q2.enqueue(temp.color);
			temp = temp.next;
		}
		System.out.println("Printing the new Queue(Copying first stack): ");
		q2.printList();
		
		
		
		
		

	}

}
