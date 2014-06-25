/*
 * Only one value in the array is changed when you union two connected components.
 * The root of the two components are joined, changing the first to the second.
 * Still too slow. Trees can get tall and there could be N array accesses in the
 * worst case scenario. Linear speed (N array accesses at most; better than N^2
 * with Quick Find.
 */

package quickunion;

/**
 *
 * @author kcb
 */
public class QuickUnion
{
    private int[] id;
    
    // Constructor
    public QuickUnion(int N)
    {
        id = new int[N];
        for (int i = 0; i < N; i++) 
        {
            id[i] = i;
        }
    }
    
    // Chase parent pointers until reach root
    private int root(int i)
    {
        while (i != id[i]) 
        {            
            i = id[i];
        }
        return i;
    }
    
    // Check if p & q have the same root
    public boolean connected(int p, int q)
    {
        return root(p) == root(q);
    }
    
    // Change root of p to point to root of q
    public void union(int p, int q)
    {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}
