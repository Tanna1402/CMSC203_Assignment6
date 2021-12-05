
public class Alcohol extends Beverage {
	private boolean weather;
	private final double wknCost = 0.6;
	
	//PARAMETERD CONSTRUCTOR
	public Alcohol(String name, SIZE size, boolean weather) {
		super(name,size,TYPE.ALCOHOL);
		this.weather = weather;
	}
	
	
	public String toString() {
		String s = super.getBevName() + super.getSize();
		if(weather) {
			s += "Weather";
		}
		s += calcPrice();
		return s;
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
		if (weather) {
			price += wknCost;
		}
		return price;
	}
	
	
	public boolean equals(Alcohol a) {
		if (super.equals(a) && weather == a.getWeather()) {
			return true;
		}
		else 
			return false;
	}
		
	public void setWeather(boolean weather) {
		this.weather = weather;
	}
	public boolean getWeather() {
		return weather;
	}
	public double getWknCost() {
		return wknCost;
	}
	
}
