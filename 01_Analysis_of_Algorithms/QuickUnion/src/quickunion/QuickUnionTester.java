package quickunion;

/**
 *
 * @author kcb
 */
public class QuickUnionTester
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Construct
        QuickUnion mySet = new QuickUnion(10);
        
        // Create forest
        mySet.union(6, 2);
        mySet.union(2, 5);
        mySet.union(5, 9);
        mySet.union(9, 1);
        mySet.union(1, 7);
        mySet.union(5, 3);
        
        // Test connections
        System.out.printf("6, 2: %s%n", mySet.connected(6, 2));
        System.out.printf("6, 7: %s%n", mySet.connected(6, 7));
        System.out.printf("6, 3: %s%n", mySet.connected(6, 3));
    }
    
}
