package Assignment6;

import junit.framework.TestCase;
public class CalculatorTest extends TestCase {
    Calculator operation;
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        operation= new Calculator();
    }

    public void TestAdd(){
        int expected= 60;
        int actual= operation.addition(40,20);
        assertEquals(expected,actual);
    }

    public void TestSub(){
        int expected= 20;
        int actual= operation.subtraction(40,20);
        assertEquals(expected,actual);
    }

    public void TestMul(){
        int expected= 800;
        int actual= operation.multiplication(40,20);
        assertEquals(expected,actual);
    }

    public void TestDiv(){
        int expected= 2;
        int actual= operation.division(40,20);
        assertEquals(expected,actual);
    }
}
