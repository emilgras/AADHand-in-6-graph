
package graphs;


public interface GraphBuilder
{
    public BuildNode createNode(String name);
    public void createEdge(BuildNode begin, BuildNode end);
    public Graph build();
}
