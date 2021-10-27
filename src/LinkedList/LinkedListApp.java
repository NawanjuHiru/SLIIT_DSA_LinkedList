package LinkedList;

public class LinkedListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkList thelink = new LinkList();
		
		thelink.insertFirst("Nipuna",53.5);
		thelink.insertFirst("Aravinda",78.0);
		thelink.insertFirst("Prashani",69.5);
		
		thelink.displayList();
		
		thelink.deleteLink("Aravinda");
		thelink.displayList();
	}

}
