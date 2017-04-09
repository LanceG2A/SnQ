
public class Link { //Class to store each Link of a stack or queue
	Link next;		//Fields to store color name and next link
	String color;
	
	
	public Link(String color){		
		this.next = null;
		this.color = color;
	}
	public Link(String color, Link next){//Constructor takes in data and next link
		this.color = color;
		this.next = next;
	}

}
