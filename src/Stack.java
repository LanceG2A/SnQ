
public class Stack {
	private Link head;//Fields for head link and size of stack
	private int size;

	public void push(String color){//Adding a new item to the stack
		if(head == null){
			Link newLink = new Link(color, null);//Empty list creates first link
			head = newLink;
			size++;
			System.out.println("push("+color+")");
		}
		else{
			Link newLink = new Link(color, head);//Otherwise the link is added at the front
			head = newLink;
			size++;
			System.out.println("push("+color+")");
		}
		
	}
	public void pop(){//to remove an item from stack
		Link temp = head;
		System.out.println("Removing: " + temp.color);//changing pointers removes items
		head = temp.next;
		size--;
		
	}
	public Link peek(){//to view head without altering it
		return head;
	}
	public void printList(){//prints contents of stack
		Link current = head;
		while(current != null){
			System.out.println(current.color);//iterates through stack and prints
			current = current.next;
		}
	}
	
	public int getSize(){//returns size of stack
		return size;
	}

}
