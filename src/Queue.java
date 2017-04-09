
public class Queue {   // Fields to keep track of front and back of queue, as well as size
	private Link head;
	private Link tail;
	private int size;
	
	public void enqueue(String color){//Method to add a new Link to the queue
		if(head == null){
			Link newLink = new Link(color, null);//If there is nothing, first Link is made
			head = newLink;	
			tail = newLink;
			size++;
			System.out.println("enqueue("+color+")");//To show that an item is being added
		}
		else{
			if(head.next == null){
			Link newLink = new Link(color, null); //If there is only one item in the queue
			tail = newLink;							//Adds the new link in front of head
			head.next = tail;
			size++;
			System.out.println("enqueue("+color+")");
			}
			else{
				Link temp = head;  //iterates through the queue to add the new link to the end
				while(temp.next != null){
					temp = temp.next;
				}
				Link newLink = new Link(color, null);
				tail = newLink;
				temp.next = tail;
				size++;
				System.out.println("enqueue("+color+")");
			}
		}
	}
	public void dequeue(){//Method to remove a link
		if(head == null){
			System.out.println("Empty List");//if its empty you can't remove anything
		}
		else{
			Link temp = head;
			System.out.println("dequeue("+temp.color+")");//set head to the next node which
			head = temp.next;						//removes it by changing pointers
			size--;
	}
	}
	public Link peek(){//Views the head link without altering it
		return head;
	}
	public void printList(){//Prints the items in the queue in order
		Link temp = head;
		while(temp != null){
			System.out.println(temp.color);
			temp = temp.next;
		}
	}
	public int getSize(){//returns size of queue
		return size;
	}

}
