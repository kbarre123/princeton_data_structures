/**
 * Implementation of XYZ. See client program at MAIN.java.
 */

package quickfind;

/**
 * @author kcb
 */
public class StopWatch 
{
    private long start = 0;

   /**
     * Create a stopwatch object.
     */
    public StopWatch() {
        start = System.currentTimeMillis();
    } 


   /**
     * Return elapsed time (in seconds) since this object was created.
     * @return run time in milliseconds (wall-time)
     */
    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }
}
