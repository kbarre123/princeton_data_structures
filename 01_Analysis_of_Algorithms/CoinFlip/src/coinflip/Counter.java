/*
 * Models a coin flip. Taken from Section 1.2.
 */

package coinflip;

/**
 * The <tt>Counter</tt> class is a mutable data type to encapsulate a counter.
 * @author kcb
 */

public class Counter implements Comparable<Counter>
{
    private final String name;  // Counter name
    private int count;          // Current value
    
    /**
     * Initializes a new counter starting at 0, with the given id.
     * @param id the name of the counter
     */
    public Counter(String id)
    {
        name = id;
    }
    
    /**
     * Increments the counter by 1.
     */
    public void increment()
    {
        count++;
    }
    
    /**
     * Returns the current count.
     * @return count
     */
    public int tally()
    {
        return count;
    }
    
    /**
     * Returns a string representation of this counter.
     * @return string representation of this counter
     */
    @Override
    public String toString()
    {
        return count + " " + name;
    }

    @Override
    public int compareTo(Counter that)
    {
        if      (this.count < that.count) return -1;
        else if (this.count > that.count) return  1;
        else                              return  0;
    }
}
