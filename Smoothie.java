
public class Smoothie extends Beverage {
	private int numOfFruits;
	private boolean protein;
	private final double fruitCost = 0.5;
	private final double proteinCost = 1.50;
	
	//PARAMETERIZED CONSTRUCTOR
	public Smoothie(String name, SIZE size, int fruit, boolean protein) {
		super(name,size,TYPE.SMOOTHIE);
		this.numOfFruits = fruit;
		this.protein = protein;
	}
	
	
	public String toString() {
		String str = super.getBevName() + super.getSize() + numOfFruits;
		if(protein) {
			str += calcPrice();
		}
		return str;
	}
	
	
	public double calcPrice() {
		double price;
		price = super.getBasePrice();
		
		//ADD THE COST FOR SIZE
		if(super.getSize() == SIZE.MEDIUM) {
			price += super.getSizePrice();
		}
		else if(super.getSize() == SIZE.LARGE) {
			price = 2*super.getSizePrice();
		}
		//ADD COST FOR FRUIT
		if(numOfFruits>0) {
			price += fruitCost*numOfFruits;
		}
		//ADD COST FOR PROTEIN POWDER
		if(protein) {
			price += proteinCost;
		}
		return price;
	}
	
	
	public boolean equal(Smoothie s) {
		
		if(super.equals(s)&& numOfFruits==s.getNumOfFruits() && protein==s.getProtein()) {
			return true;
		}
		else 
			return false;
	}
	
	
	public void setFruit(int fruit) {
		this.numOfFruits = fruit;
	}
	public void setProtein(boolean protein) {
		this.protein = protein;
	}
	public int getNumOfFruits() {
		return numOfFruits;
	}
	public boolean getProtein() {
		return protein;
	}
	public double getFruitCost() {
		return fruitCost;
	}
	public double getProteinCost() {
		return proteinCost;
	}
	
}
