package main;

import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;

public class TopologicalSort {

	private Queue<Node> stack;
	private Set<Node> visited;

	public Set<Node> topSort(Graph graph) {
		stack = new ArrayBlockingQueue<Node>(graph.getNodes().size());
		visited = new HashSet();
		for (Node node: graph.getNodes()) {
			if(visited.contains(node)) {
				continue;
			} else {
				topSortUtil(node, stack, visited);
			}
		}
		return null;
	}

	private void topSortUtil(Node node, Queue<Node> stack, Set<Node> visited) {
		visited.add(node);
		for (Node child: node.getAdjacent()) {
			if(visited.contains(node)) {
				continue;
			} else {
				topSortUtil(node, stack, visited);
			}
		}
		stack.offer(node);
	}

}
