package headfirst.designpatterns.factory.pizzafm;

public class NYPizzaStorePizza extends PizzaStore {

	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else if (item.equals("Halal")) {
			return new NYStyleHalal();
		}
		else return null;
	}
}
