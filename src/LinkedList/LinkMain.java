package LinkedList;

public class LinkMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Link L1 = new Link("Nipuna",53.5);
		Link L2 = new Link("Aravinda",78.0);
		Link L3 = new Link("Prashani",69.5);
		
		L1.Next = L2;
		L2.Next = L3;
		L3.Next = null;
		
		L1.displayDetails();
		L2.displayDetails();
		L3.displayDetails();
	}

}
