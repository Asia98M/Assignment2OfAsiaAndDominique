package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class quadraticEquationTest {

	@Test
	void testNoRealRoot(){
		Exception exception = new Exception();
		assertThrows(IllegalArgumentException.class, () -> {quadraticEquation.findRoots(1, 1, 1);});
	}
	@Test
    public void testDistinctRealRoots() {
        double[] roots = quadraticEquation.findRoots(1, -3, 2); 
        assertArrayEquals(new double[]{2.0, 1.0}, roots, "Expected roots are 2.0 and 1.0");
	}

	@Test
	public void testCoefficientAIsZero(){
	    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	        quadraticEquation.findRoots(0, 2, 1);
	    });
	    assertEquals("Coefficient 'a' cannot be zero.", exception.getMessage());
	   }
	@Test
    public void testNegativeCoefficients() {
        double[] roots = quadraticEquation.findRoots(-1, -3, 2); 
        assertArrayEquals(new double[]{-1.0, 2.0}, roots, "Expected roots are -1.0 and 2.0");
    }
	
}
