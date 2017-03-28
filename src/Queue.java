
public class Queue {
	private Link head;
	private Link tail;
	private int size;
	
	public void enqueue(String color){
		if(head == null){
			Link newLink = new Link(color, null);
			head = newLink;	
			tail = newLink;
			size++;
		}
		else{
			if(head.next == null){
			Link newLink = new Link(color, null);
			tail = newLink;
			head.next = tail;
			size++;
			}
			else{
				Link temp = head;
				while(temp.next != null){
					temp = temp.next;
				}
				Link newLink = new Link(color, null);
				tail = newLink;
				temp.next = tail;
				size++;
			}
		}
	}
	public void dequeue(){
		if(head == null){
			System.out.println("Empty List");
		}
		else{
			Link temp = head;
			head = temp.next;
	}
	}
	public Link peek(){
		return head;
	}
	public void printList(){
		Link temp = head;
		while(temp != null){
			System.out.println(temp.color);
			temp = temp.next;
		}
	}
	public int getSize(){
		return size;
	}

}
