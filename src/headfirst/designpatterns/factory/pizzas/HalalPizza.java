package headfirst.designpatterns.factory.pizzas;

public class HalalPizza extends Pizza{
    public HalalPizza() {
        name = "Halal Pizza";
        dough = "Thin crust";
        sauce = "Pig sauce";
        toppings.add("Bacon");
        toppings.add("Pork ball");
    }
}
