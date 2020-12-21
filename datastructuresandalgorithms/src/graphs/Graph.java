package graphs;

//an undirected graph  program
import java.util.LinkedList;

public class Graph {
	int vertices;
	LinkedList<Integer> Adjlist[];

	public Graph(int vertices) {
		this.vertices = vertices;
		this.Adjlist = new LinkedList[vertices];
		for (int i = 0; i < vertices; i++) {
			Adjlist[i] = new LinkedList<>();
		}
	}

	public void addEdge(int source, int destination) {
		Adjlist[source].add(destination);
		Adjlist[destination].add(source);
	}

	public void displayGraph() {
		for (int i = 0; i < vertices; i++) {
			if (Adjlist[i].size() > 0) {
				System.out.println("vertex" + i + "is connected to->");
				for (int j = 0; j < Adjlist[i].size(); j++) {
					System.out.print(Adjlist[i].get(j) + " ");
				}
				System.out.println();
			}
		}
	}
	
	public static void main(String [] args) 
	{
		Graph g=new Graph(3);
		g.addEdge(0, 1);
		g.addEdge(1,2);
		g.addEdge(2,0);
		g.displayGraph();

	}

}
