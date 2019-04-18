package headfirst.designpatterns.factory.pizzafm;

public class NYStyleHalal extends Pizza{
    public NYStyleHalal() {
        name = "NY Style Halal Pizza";
        dough = "Thin Crust Dough";
        sauce = "Hawaiian Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Grill Bacon");
    }
}
