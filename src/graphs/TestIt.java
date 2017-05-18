
package graphs;

import graphs.algorithms.BreadthFirst;
import graphs.simpleimpl.GraphBuilderImpl;


public class TestIt
{
    public static void main(String[] args)
    {
        GraphBuilder gb = new GraphBuilderImpl();
        
        BuildNode a = gb.createNode("A");
        BuildNode b = gb.createNode("B");
        BuildNode c = gb.createNode("C");
        BuildNode d = gb.createNode("D");
        BuildNode e = gb.createNode("E");
        
        gb.createEdge(a, b);
        gb.createEdge(b, a);
        gb.createEdge(a, d);
        gb.createEdge(d, a);
        gb.createEdge(b, c);
        gb.createEdge(c, d);
        gb.createEdge(c, c);
        gb.createEdge(c, e);
        gb.createEdge(e, d);
        
        Graph g = gb.build();
        Iterable<Node> res = BreadthFirst.runBreadthFirst(g.findNode("A"));
        
        for(Node n : res)
        {
            System.out.println(n.getName());
        }
    }
}
