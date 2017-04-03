
public class Stack {
	private Link head;
	private int size;

	public void push(String color){
		if(head == null){
			Link newLink = new Link(color, null);
			head = newLink;
			size++;
			System.out.println("push("+color+")");
		}
		else{
			Link newLink = new Link(color, head);
			head = newLink;
			size++;
			System.out.println("push("+color+")");
		}
		
	}
	public void pop(){
		Link temp = head;
		System.out.println("Removing: " + temp.color);
		head = temp.next;
		
	}
	public Link peek(){
		return head;
	}
	public void printList(){
		Link current = head;
		while(current != null){
			System.out.println(current.color);
			current = current.next;
		}
	}
	
	public int getSize(){
		return size;
	}

}
