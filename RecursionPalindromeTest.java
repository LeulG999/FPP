package lesson4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class RecursionPalindromeTest {
    @Test
    void palindromeTestTrue(){
        boolean op=RecursionPalindrome.isPalindrome(121);
        boolean eop=true;
        assertEquals(eop,op);
    }
    @Test
    void palindromeTestFalse(){
        boolean op=RecursionPalindrome.isPalindrome(102);
        boolean eop=false;
        assertEquals(eop,op);
    }
}