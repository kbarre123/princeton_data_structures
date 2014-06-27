package quickunionweighted;
import edu.princeton.cs.introcs.*;

/**
 * Reads in a sequence of pairs of integers (between 0 and N-1) from standard
 * input, where each integer represents some object; if the objects are in
 * different components, merge the two components and print the pair to standard
 * output.
 */

public class QuickUnionWeightedTester
{
    public static void main(String[] args) 
    {     
        int N = StdIn.readInt();
        StdOut.println(N + " nodes:");
        QuickUnionWeighted uf = new QuickUnionWeighted(N);
        while (!StdIn.isEmpty()) 
        {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            StdOut.println(p + "-" + q);
        }
        // Once done entering pairs, hit ctrl-D to skip to this
        StdOut.println("Final: " + uf.count() + " components");
        StdOut.println("id[]: " + uf.idPrint());
    }
}