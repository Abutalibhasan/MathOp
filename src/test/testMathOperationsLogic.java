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
public class testMathOperationsLogic {
	MathOperatios m1 = new MathOperatios("+");
	MathOperationsLogic m2 = new MathOperationsLogic();

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAdd() {
		m1.setX(10);
		m1.setY(3);
		assertEquals(13, m2.Add(m1));
	}
	
	@Test
	public void testMod() {
		m1.setX(10);
		m1.setY(3);
		assertNotEquals(6.0, m2.Mod(m1),0.1);
	}
	
	
	

}
