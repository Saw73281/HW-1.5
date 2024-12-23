import org.example.Fibonacci;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FibonacciTest {
    @Test
    public void testIterativeFibonacci() {
        assertEquals(0, Fibonacci.iterativeFibonacci(0));
        assertEquals(1, Fibonacci.iterativeFibonacci(1));
        assertEquals(8, Fibonacci.iterativeFibonacci(6));
    }

    @Test
    public void testRecursiveFibonacci() {
        assertEquals(0, Fibonacci.recursiveFibonacci(0));
        assertEquals(1, Fibonacci.recursiveFibonacci(1));
        assertEquals(8, Fibonacci.recursiveFibonacci(6));
    }

    @Test
    public void testDynamicFibonacci() {
        assertEquals(0, Fibonacci.dynamicFibonacci(0));
        assertEquals(1, Fibonacci.dynamicFibonacci(1));
        assertEquals(8, Fibonacci.dynamicFibonacci(6));
    }
}
