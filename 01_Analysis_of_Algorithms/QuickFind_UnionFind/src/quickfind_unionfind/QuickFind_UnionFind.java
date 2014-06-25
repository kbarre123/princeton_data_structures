/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quickfind_unionfind;

/**
 *
 * @author kcb
 */
public class QuickFind_UnionFind
{
    private int[] id;
    
    // Constructs data structure with N items
    public QuickFind_UnionFind(int N)
    {
        id = new int[N];
        for (int i = 0; i < N; i++)
        {
            id[i] = i;
        }
    }
    
    // Checks to see it two items are connected
    public boolean connected(int p, int q)
    {
        return id[p] == id[q];
    }
    
    // Joins two items, changing the id of the first to that of the second
    public void union(int p, int q)
    {
        int pID = id[p];
        int qID = id[q];
        for (int i = 0; i < id.length; i++)
        {
            if (id[i] == pID) id[i] = qID ;
        }
    }
}
