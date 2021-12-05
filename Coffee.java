
public class Coffee extends Beverage {
	private boolean xShot;
	private boolean xSyrup;
	private final double xtra = 0.5;
	
	//PARAMETERIZED CONTRUCTOR
	public Coffee(String name,SIZE size, boolean xShot,boolean xSyrup) {
		super(name,size,TYPE.COFFEE);
		this.xShot = xShot;
		this.xSyrup = xSyrup;
	}
	
	public String toString() {
		String string = getBevName() + getSize();
	
		//DETERMINE IF ADDED XTRA SHOT OR SYRUP
		if(xShot) {
			string += "Add COFFEE";
		}
		else if(xSyrup) {
			string += "Add SYRUP";
		}
		//ADD PRICE
		string += calcPrice();
		return string;
	}
	
	public double calcPrice() {
		double price;
		price = super.getBasePrice();
		//IF STATEMENT FOR SIZE PRICE
		if(super.getSize() == SIZE.MEDIUM) {
			price += super.getSizePrice();
		}
		else if(super.getSize() == SIZE.LARGE) {
			price = 2 * super.getSizePrice();
		}
		//IF STATEMENT FOR EXTRA COFFEE AND SYRUP
		if(xShot) {
			price += xtra;
		}
		else if(xSyrup) {
			price += xtra;
		}
		return price;
	}
	
	public boolean equal(Coffee cf) {
		if (super.equals(cf) && xShot==cf.getXShot() && xSyrup==cf.getXSyrup()) 
			return true;
		else
			return false;
	}
	
	
	public void setXShot(boolean xShot) {
		this.xShot = xShot;
	}
	public void setXSyrup(boolean xSyrup) {
		this.xSyrup = xSyrup;
	}
	public boolean getXShot() {
		return xShot;
	}
	public boolean getXSyrup() {
		return xSyrup;
	}
	public double getXTRA() {
		return xtra;
	}
}
