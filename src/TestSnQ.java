
public class TestSnQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s = new Stack();
		System.out.println("Creating a Stack and adding Strings then printing:");
		s.push("Red");
		s.push("Orange");
		s.push("Purple");
		s.push("Gold");
		System.out.println();
		s.printList();
		System.out.println("\nPopping an item then printing the list again:");
		s.pop();
		System.out.println("Printing Stack: ");
		s.printList();
		
		System.out.println();
		Queue q = new Queue();
		System.out.println("Adding Strings to a Queue then printing elements ");
		q.enqueue("Green");
		q.enqueue("Brown");
		q.enqueue("Yellow");
		q.enqueue("Gray");
		System.out.println("Printing Queue: ");
		q.printList();
		System.out.println("\nRemoving an element using dequeue and then printing again:");
		
		q.dequeue();
		System.out.println("Printing Queue now: ");
		q.printList();
		
		System.out.println("\nMoving a Stack to a Queue"
				+ "\nUsing the same stack from before: " + "\n");
		Link temp = s.peek();
		Queue q2 = new Queue();
		while(temp != null){
			q2.enqueue(temp.color);
			temp = temp.next;
		}
		System.out.println("Printing the new Queue(Copy of first stack): ");
		q2.printList();
		System.out.println("\nNow printing the stack again to compare: ");
		s.printList();
		System.out.println("Now a new queue will be created and its contents printed: ");
		Queue qTs = new Queue();
		qTs.enqueue("Brown");
		qTs.enqueue("Teal");
		qTs.enqueue("Burgundy");
		qTs.enqueue("Tan");
		System.out.println("\nPrinitng the queue that was just made: ");
		qTs.printList();
		
		
		System.out.println("\nNow moving the Queue that was made to a Stack");
		Stack s2 = new Stack();
		String[] tempArray = new String[qTs.getSize()];
		Link temp2 = qTs.peek();
		for(int i = 0; i < tempArray.length; i++){
			tempArray[i] = temp2.color;
			temp2 = temp2.next;
		}
		int k = tempArray.length;
		while(k != 0){
			s2.push(tempArray[k-1]);
			k--;
		}
		System.out.println("The Strings from the Queue was transfered to the new Stack");
		s2.printList();
		
		
		

	}

}
