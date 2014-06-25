/*
 * Client program to test implementation of Counter.java. Reads two CLI integers
 * N and T; creates N counters; increments T counters at random; prints results.
 */

package coinflip;

import edu.princeton.cs.introcs.*;

/**
 * @author kcb
 */
public class CoinFlipTester
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        int T = Integer.parseInt(args[1]);
        
        // Create N counters
        Counter[] hits = new Counter[N];
        for (int i = 0; i < N; i++) 
        {
            hits[i] = new Counter("counter" + i);
        }
        
        // Increment T counters at random
        for (int t = 0; t < T; t++) 
        {
            hits[StdRandom.uniform(N)].increment();
        }
        
        // Prints results
        for (int i = 0; i < N; i++) 
        {
            StdOut.println(hits[i]);
        }
    }
}
