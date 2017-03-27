
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
			Link newLink = new Link(color, tail);
			tail = newLink;
			size++;
		}
	}
	public void dequeue(){
		Link temp = tail;
		int i = 0;
		while(i == 0){
			if(temp.next == head){
				temp.next = null;
				i++;
			}
			else{
				temp = temp.next;
			}
			
		}
		head = temp;
		size--;
	}
	public Link peek(){
		return head;
	}
	public void printList(){
		Link temp = tail;
		while(temp != null){
			System.out.println(temp.color);
			temp = temp.next;
		}
	}
	public int getSize(){
		return size;
	}

}
