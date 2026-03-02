package lesson4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class RecursionMaxValueTest {
    @Test
    void maxValueTest(){
        int[]arr={5, -3, 6, 1, 9, 4};
        RecursionMaxValue ob=new RecursionMaxValue();
        int op= ob.maxValue(arr,0);
        int eop=9;
        assertEquals(eop,op);
    }
}