/*
 * Quick Find has a speed of n^2, which is way too slow.
 */

package quickfind_unionfind;

/**
 *
 * @author kcb
 */
public class QuickFind_UnionFind_Tester
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        QuickFind_UnionFind mySet = new QuickFind_UnionFind(10);
        
        mySet.union(9, 2);
        mySet.union(9, 4);
        mySet.union(4, 3);
        
        System.out.printf("9 is connected to 2: %s%n", mySet.connected(9, 2));
        System.out.printf("9 is connected to 4: %s%n", mySet.connected(9, 4));
        System.out.printf("9 is connected to 3: %s%n", mySet.connected(4, 3));
        System.out.printf("9 is connected to 2: %s%n", mySet.connected(9, 3));
    }
}
