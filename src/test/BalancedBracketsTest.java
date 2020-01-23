package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void onlyOneRightFacingBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void onlyOneLeftFacingBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void twoLeftFacingBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]"));
    }
    @Test
    public void twoRightFacingBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }
    @Test
    public void opposingBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void noBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("abcde"));
    }
    @Test
    public void balancedBracketsContainsOtherCharacters(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("ab[65]cd"));
    }
    @Test
    public void hasWrongBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("{}"));
    }
    @Test
    public void hasMultipleUnbalancedBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }
    @Test
    public void hasMultipleBalancedBracket(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
}
