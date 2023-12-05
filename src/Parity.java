import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Parity {

    public static int numchecker(int x) {
        if (x==0) {
            return 0;            
        }
        if (x==1) {
            return 1;
        }


        if (x>0) {
            if (x%2 == 0) {
                return numchecker(x/2)+0;
            } 
            else{
                return numchecker(x/2)+1;
            }
        }
        else{
            if (x%2 == 0) {
                return numchecker(x/2)+1;
            } 
            else{
                return numchecker(x/2)+0;
            }            
        }
        
    }

    public static short getParity(int x) {
        // your code here
        if (numchecker(x)%2==0) {
            return 0;
        }
        else return 1;
    }

    @Test
    public void test() {
        // assertEquals(expected, actual)
        assertEquals(1, Parity.getParity(42));
        assertEquals(0, Parity.getParity(10));
        assertEquals(0, Parity.getParity(-100));
        assertEquals(1, Parity.getParity(-50));
        assertEquals(0, Parity.getParity(12345));
        // assertEquals(1, Parity.getParity(85318817));
    }    
}
