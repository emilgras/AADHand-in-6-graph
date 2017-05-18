package main;

import java.util.Comparator;

/**
 * Created by Ebbe Nielsen on 18/05/2017.
 */
public class EdgeComparator  implements Comparator<Edge> {

    public int compare(Edge edge1, Edge edge2) {
        if (edge1.getWeight() <= edge2.getWeight()) {
            return -1;
        } else {
            return 1;
        }
    }
}
