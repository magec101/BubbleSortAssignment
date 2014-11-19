import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;
 
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Unit tests for the BubbleSortAssignment
 */
public class BubbleSortAssignmentTest 
extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public BubbleSortAssignmentTest( String testName )
    {
        super( testName );
    }

    /** 
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( BubbleSortAssignmentTest.class );
    }

    /**
     * Simple Test :-)
     */
    public void test_Simple()
    {
        int unsortedArray[] = new int[]{67, 89, 23, 91, 45, 3 };
        int sortedArray[]   = new int[]{ 3, 23, 45, 67, 89, 91};
        
        BubbleSortAssignment.bubbleSort(unsortedArray);
        assertArrayEquals(unsortedArray, sortedArray);
    }
}
