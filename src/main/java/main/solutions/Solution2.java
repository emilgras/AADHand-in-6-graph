package main.solutions;

import main.Edge;
import main.Graph;
import main.Node;
import main.TopologicalSort;

import java.util.*;

public class Solution2 {
	public static void main(String[] args) {
		Graph graph = Solution2.GenereateDirectedAcyclicGraph();
		TopologicalSort ts = new TopologicalSort();
		Stack<Node> stack = ts.topSort(graph);
		while(!stack.isEmpty()) {
			System.out.println(stack.pop().getId());
		}
	}

	public static Graph GenereateDirectedAcyclicGraph() {
		Node n1 = new Node(1, new ArrayList<Edge>());
		Node n2 = new Node(2, new ArrayList<Edge>());
		Node n3 = new Node(3, new ArrayList<Edge>());
		Node n4 = new Node(4, new ArrayList<Edge>());
		Node n5 = new Node(5, new ArrayList<Edge>());
		Node n6 = new Node(6, new ArrayList<Edge>());
		Node n7 = new Node(7, new ArrayList<Edge>());

		n1.addEdgeTo(1, n2);
		n1.addEdgeTo(1, n3);
		n2.addEdgeTo(1, n4);
		n3.addEdgeTo(1, n4);
		n3.addEdgeTo(1, n5);
		n4.addEdgeTo(1, n7);
		n5.addEdgeTo(1, n6);
		n6.addEdgeTo(1, n4);

		/*n2.addEdgeTo(1, n3);
		n2.addEdgeTo(1, n5);
		n3.addEdgeTo(1, n4);
		n4.addEdgeTo(1, n6);
		n5.addEdgeTo(1, n6);
		n6.addEdgeTo(1, n7);*/

		/*n1.addEdgeTo(1, n2);
		n2.addEdgeTo(1, n3);
		n3.addEdgeTo(1, n4);
		n4.addEdgeTo(1, n5);
		n5.addEdgeTo(1, n6);
		n6.addEdgeTo(1, n7);*/


		List<Node> nodeList = new ArrayList<Node>();

		nodeList.add(n1);
		nodeList.add(n2);
		nodeList.add(n3);
		nodeList.add(n4);
		nodeList.add(n5);
		nodeList.add(n6);
		nodeList.add(n7);

		return new Graph(nodeList);
	}
}
