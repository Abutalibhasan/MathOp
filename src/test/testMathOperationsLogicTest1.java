package test;
import model.MathOperatios;
import model.MathOperationsLogic;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Abutalib Hasan - amhasan
 * 202101 CIS171 12928
 * Feb 3, 2021
 */
public class testMathOperationsLogicTest1 {
	MathOperatios m = new MathOperatios("+");
	MathOperationsLogic l = new MathOperationsLogic();

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsMultiplication() {
		m.setOp("*");
		assertTrue(l.isMultiplication(m));
		
	}
	
	

}
