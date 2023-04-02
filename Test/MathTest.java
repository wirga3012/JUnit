import org.junit.Test;

import static org.junit.Assert.*;

public class MathTest{
    @Test
    public void MathRoundTest(){
        assertEquals(31,Math.round(30.6556565));
    }
    @Test
    public void MathMaxTest(){
        int result = Math.max(121,150);
        assertEquals(150,result);
    }
    @Test
    public void MathDecrementTest(){
        assertEquals(65,Math.decrementExact(66));
    }
    @Test
    public void MathFloorTest(){
        assertEquals(3,Math.floor(3.123));
    }
    @Test
    public void MathCeilTest(){
        assertEquals(4,Math.ceil(3.123));
    }
    @Test
    public void MathDivideTest(){
        assertEquals(2,Math.divideExact(4,2));
    }
    @Test
    public void MathMultiplyTest(){
        assertEquals(8,Math.multiplyExact(2,4));
    }
    @Test
    public void MathMinTest(){
        assertEquals(3,Math.min(100,3));
    }
    @Test
    public void MathAddExactTest(){
        assertEquals(3,Math.addExact(1,2));
    }



}
