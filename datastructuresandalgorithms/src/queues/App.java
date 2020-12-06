package queues;

public class App {

	public static void main(String[] args) {
		queue q=new queue(5);
		q.insert(10);
		q.insert(20);
		q.insert(30);
		q.insert(40);
		q.insert(50);
		q.display();
		//System.out.println(q.remove());
		System.out.println(q.peekFront());
		

	}

}
