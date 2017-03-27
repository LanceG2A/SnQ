
public class Link {
	Link next;
	String color;
	
	
	public Link(String color){
		this.next = null;
		this.color = color;
	}
	public Link(String color, Link next){
		this.color = color;
		this.next = next;
	}

}
