package LinkedList;

public class LinkList {
	private Link first;
	
	public LinkList() {
		first = null;
	}
	
	public boolean isEmpty() {
		return(first == null);
	}
	
	public void insertFirst(String name, double avg) {
		Link newlink = new Link(name,avg);
		newlink.Next = first;
		first = newlink;
	}
	
	public Link deleteFirst() {
		Link temp = first;
		first = first.Next;
		return temp;
	}
	
	public void displayList() {
		System.out.println("List from first link to the last link.");
		Link current = first;
		
		while(current != null) {
			current.displayDetails();
			current = current.Next;
		}
	}
	
	public Link deleteLink(String name) {
		Link current = first;
		Link previous = first;
		
		while(current.Name != name) {
			if(current.Next == null) {
				return null;
			}
			else {
				previous = current;
				current = current.Next;
			}
		}
		
		if(current == first) {
			first = current.Next;
		}
		else {
			previous.Next = current.Next;
		}
		
		return current;
	}
}
