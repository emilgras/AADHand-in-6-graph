package main.solutions;

import main.Edge;
import main.Graph;
import main.MinimumSpanningTree;
import main.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ebbe Nielsen on 18/05/2017.
 */
public class Solution3 {
    public static void main(String[] args) {

        Graph graph = generateGraph();
        MinimumSpanningTree mst = new MinimumSpanningTree();
        List<Edge> edges = mst.getMST(graph);

        for (Edge edge : edges) {
            System.out.println(edge.getFrom().getId() + " , "  + edge.getTo().getId());
        }

    }

    public static Graph generateGraph() {
        Node n1 = new Node(1, new ArrayList<Edge>());
        Node n2 = new Node(2, new ArrayList<Edge>());
        Node n3 = new Node(3, new ArrayList<Edge>());
        Node n4 = new Node(4, new ArrayList<Edge>());
        Node n5 = new Node(5, new ArrayList<Edge>());
        Node n6 = new Node(6, new ArrayList<Edge>());

        n1.addEdgeTo(1, n2);
        n1.addEdgeTo(2, n4);
        n1.addEdgeTo(3, n5);

        n2.addEdgeTo(1, n1);
        n2.addEdgeTo(5, n3);
        n2.addEdgeTo(2, n4);
        n2.addEdgeTo(6, n6);

        n3.addEdgeTo(5, n2);
        n3.addEdgeTo(2, n5);
        n3.addEdgeTo(3, n6);

        n4.addEdgeTo(2, n1);
        n4.addEdgeTo(2, n2);
        n4.addEdgeTo(1, n5);

        n5.addEdgeTo(3, n1);
        n5.addEdgeTo(2, n3);
        n5.addEdgeTo(1, n4);
        n5.addEdgeTo(4, n6);

        n6.addEdgeTo(6, n2);
        n6.addEdgeTo(3, n3);
        n6.addEdgeTo(4, n5);

        final List<Node> nodeList = new ArrayList<Node>();
        nodeList.add(n1);
        nodeList.add(n2);
        nodeList.add(n3);
        nodeList.add(n4);
        nodeList.add(n5);
        nodeList.add(n6);

        return new Graph(nodeList);
    }
}
