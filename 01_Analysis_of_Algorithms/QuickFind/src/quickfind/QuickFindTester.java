/**
 * Client program to test implementation of QuickFind.java.
 */

package quickfind;
import edu.princeton.cs.introcs.*;

/**
 * @author kcb
 */
public class QuickFindTester 
{   
    /**
     * Reads in a sequence of pairs of integers (between 0 and N-1) from standard input, 
     * where each integer represents some object;
     * if the objects are in different components, merge the two components
     * and print the pair to standard output.
     * @param args
     */
    public static void main(String[] args) {
        int N = StdIn.readInt();
        QuickFind uf = new QuickFind(N);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            StdOut.println(p + "-" + q);
            StdOut.println(uf.count() + " components");
        }
        // Once done entering pairs, hit ctrl-D to skip to this
        StdOut.println(uf.count() + " components");
    }
}
