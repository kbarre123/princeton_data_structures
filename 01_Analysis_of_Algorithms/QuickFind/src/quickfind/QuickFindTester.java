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
        // Time the program
        StopWatch timer = new StopWatch();
        
        int N = StdIn.readInt();
        StdOut.println(N + " nodes:");
        QuickFind uf = new QuickFind(N);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            StdOut.println(p + "-" + q);
        }
        // Once done entering pairs, hit ctrl-D to skip to this
        StdOut.println("Final: " + uf.count() + " components");
        StdOut.println("id[]: " + uf.idPrint());
        StdOut.println("Run-time(ms): " + timer.elapsedTime());
    }
}
