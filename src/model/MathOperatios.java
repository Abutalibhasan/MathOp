package model;

/**
 * Abutalib Hasan - amhasan
 * 202101 CIS171 12928
 * Feb 3, 2021
 */
public class MathOperatios {
	private int x;
	private int y;
	private String op;
	
	
	public MathOperatios() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public MathOperatios(String op) {
		super();
		this.op = op;
	}


	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * @return the op
	 */
	public String getOp() {
		return op;
	}
	/**
	 * @param op the op to set
	 */
	public void setOp(String op) {
		this.op = op;
	}
	
	

}
