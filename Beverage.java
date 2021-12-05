
public abstract class Beverage {
	private String bevName;
	private TYPE type;
	private SIZE size;
	private final double basePrice = 2.0;
	private final double sizePrice = 1.0;
	
	//PARAMETERIZED CONSTRUCTOR
	public Beverage(String name,SIZE size,TYPE type) {
		this.bevName = name;
		this.size = size;
		this.type = type;
	}
	
	
	public abstract double calcPrice();
	
	
	public String toString() {
		return bevName+","+size;
	}
	
	public boolean equal(Beverage bev) {
		if (bevName.equals(bev.getBevName()) && type==bev.getType() && size==bev.getSize()) {
			return true;
		}
		else 
			return false;
	}
	
	
	public void setName(String name) {
		this.bevName = name;
	}
	public void setType(TYPE type) {
		this.type = type;
	}
	public void setSize(SIZE size) {
		this.size = size;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public double getSizePrice() {
		return sizePrice;
	}
	public String getBevName() {
		return bevName;
	}
	public TYPE getType() {
		return type;
	}
	public SIZE getSize() {
		return size;
	}
	
}
