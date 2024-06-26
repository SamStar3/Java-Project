package bill;

public class DeluxPizza extends Pizza{
	
	public DeluxPizza(boolean veg) {
		
		super(veg);
		
	}
	
	public void addExtraCheese() {
		
		this.price += extraCheesePrice;
		
	}
	
	public void addExtraToppings() {
		
		this.price += extraToppingsPrice;
		
	}

}
