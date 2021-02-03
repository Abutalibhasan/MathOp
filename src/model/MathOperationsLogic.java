package model;

/**
 * Abutalib Hasan - amhasan
 * 202101 CIS171 12928
 * Feb 3, 2021
 */
public class MathOperationsLogic {
	
	public int Add(MathOperatios m) {
		//m.setX(5);
		//m.setY(5);
		//m.setOp("+");
		return m.getX() + m.getY();	
	}
	
	public int Sub(MathOperatios m) {
		//m.setX(5);
		//m.setY(5);
		m.setOp("-");
		return m.getX() - m.getY();	
	}
	
	public int Mult(MathOperatios m) {
		//m.setX(5);
		//m.setY(5);
		m.setOp("*");
		return m.getX() * m.getY();	
	}
	
	public double Div(MathOperatios m) {
		//m.setX(5);
		//m.setY(5);
		m.setOp("/");
		return (double)(m.getX()/ m.getY());	
	}
	
	public  double Mod(MathOperatios m) {
		//m.setX(5);
		//m.setY(5);
		m.setOp("%");
		return (double)(m.getX() - m.getY());	
	}
	
	public boolean isMultiplication(MathOperatios m) {
		String s = "*";
		boolean z;
		m.setOp(s);
		if(m.getOp().equals(s)) {
			z = true;
		}else {
			z = false;
		}
		return z;
	}

}
