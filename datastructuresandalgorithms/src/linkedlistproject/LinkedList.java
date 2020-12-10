package linkedlistproject;

public class LinkedList {

	public class Node {
		public String Name;
		public String PhoneNumber;
		public String Address;
		public Node next;

		public Node(String name, String phno, String address) {
			this.Name = name;
			this.PhoneNumber = phno;
			this.Address = address;
			this.next = null;
		}
	}

	// initially head and tail are null
	public Node head = null;
	public Node tail = null;

	// function to create a contact
	public void create(String name, String phno, String address) {
		Node newNode = new Node(name, phno, address);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	// display the data using this method
	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println("list is empty");
			return;
		}
		System.out.println("Data in the contacts are:");
		while (current != null) {
			System.out.println(current.Name + " " + current.PhoneNumber + " " + current.Address);
			current = current.next;
		}
		System.out.println();

	}
	
	//Main method
	public static void main(String[] args) {
		LinkedList s = new LinkedList();
		//creating a demo contact with details
		s.create("Sairaj", "9000555941", "Hyderabad");
		s.create("xyz", "000000000", "loccc");
		s.display();
	}

}
