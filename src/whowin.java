import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WhoWin {
    public static String rps(String p1, String p2) {
        //your code here
        //rock =4, scissors = 7, paper = 5
        switch (p1.length()) {
            case 4:
                switch (p2.length()) {
                    case 4:
                        System.out.println("Draw!");
                        break;
                
                    case 7:
                        System.out.println("Player 1 won!");
                        break;

                    case 5:
                        System.out.println("Player 2 won!");
                        break;
                    default:
                        break;
                }
                break;
        
        
            case 7:
                switch (p2.length()) {
                    case 4:
                        System.out.println("Player 2 won!");
                        break;
                
                    case 7:
                        System.out.println("Draw!");
                        break;

                    case 5:
                        System.out.println("Player 1 won!");
                        break;
                    default:
                        break;
                }
                break;
        
            case 5:
                switch (p2.length()) {
                    case 4:
                        System.out.println("Player 2 won!");
                        break;
                
                    case 7:
                        System.out.println("Player 1 won!");
                        break;

                    case 5:
                        System.out.println("Draw!");
                        break;
                    default:
                        break;
                
                break;

            default:
                break;
        }


        
        return null;
    }
        
    @Test
    public void test1() {
        System.out.println("Fixed Tests Player 1 won!");
        assertEquals("Player 1 won!", WhoWin.rps("rock", "scissors"));
        assertEquals("Player 1 won!", WhoWin.rps("scissors", "paper"));
        assertEquals("Player 1 won!", WhoWin.rps("paper", "rock"));
    }
    @Test
    public void test2() {
        System.out.println("Fixed Tests Player 2 won!");
        assertEquals("Player 2 won!", WhoWin.rps("scissors", "rock"));
        assertEquals("Player 2 won!", WhoWin.rps("paper", "scissors"));
        assertEquals("Player 2 won!", WhoWin.rps("rock", "paper"));
    }
    @Test
    public void test3() {
        System.out.println("Fixed Tests Draw!");
        assertEquals("Draw!", WhoWin.rps("scissors", "scissors"));
        assertEquals("Draw!", WhoWin.rps("paper", "paper"));
        assertEquals("Draw!", WhoWin.rps("rock", "rock"));
    }
}