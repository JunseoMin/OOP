import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Outlier {
    public static boolean isodd(int x) {
        if (x%2==0) {
            return false;
        }
        else return true;
        }

    public static int findOutlier(int[] integers) {
        //your code here
        boolean flag=true;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i]<0) {
                integers[i]=integers[i]*-1;
            }
            if ((i+1<integers.length) & (isodd(integers[i])==isodd(integers[i+1]))) {
                flag=isodd(integers[i]);
            }
        }
        for (int i = 0; i < integers.length; i++) {
            if(isodd(integers[i])!=flag){
                return integers[i];
            }
        }
        return 0;
    }
    
    @Test
    public void test () {
        // test integer arrays
        int[] ints1 = {2,6,8,10,3}; //odd at the back
        int[] ints2 = {2,6,8,200,700,1,84,10,4}; //odd in the middle
        int[] ints3 = {17,6,8,10,6,12,24,36}; //odd in the front
        int[] ints4 = {2,1,7,17,19,211,7}; //even in the front
        int[] ints5 = {1,1,1,1,1,44,7,7,7,7,7,7,7,7}; //even in the middle
        int[] ints6 = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,35,5,5,5,5,5,5,5,5,5,5,7,7,7,7,1000}; //even at the end
        int[] ints7 = {2,-6,8,-10,-3}; //odd at the back, negative
        int[] ints8 = {2,6,8,2,-66,34,-35,66,700,1002,-84,10,4}; //odd in the middle, negative
        int[] ints9 = {-1* Integer.MAX_VALUE,-18,6,-8,-10,6,12,-24,36}; //odd in the front, negative
        int[] ints10 = {-20,1,7,17,19,211,7}; //even in the front, negative

        // assertEquals(expected, actual)
        assertEquals(3, Outlier.findOutlier(ints1));
        assertEquals(1, Outlier.findOutlier(ints2));
        assertEquals(17, Outlier.findOutlier(ints3));
        assertEquals(2, Outlier.findOutlier(ints4));
        assertEquals(44, Outlier.findOutlier(ints5));
        assertEquals(1000, Outlier.findOutlier(ints6));
        assertEquals(-3, Outlier.findOutlier(ints7));
        assertEquals(-35, Outlier.findOutlier(ints8));
        assertEquals(-1 * Integer.MAX_VALUE, Outlier.findOutlier(ints9));
        assertEquals(-20, Outlier.findOutlier(ints10));
    }
}
