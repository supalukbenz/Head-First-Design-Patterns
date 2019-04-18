package headfirst.designpatterns.factory.pizzafm;

public class ChicagoStyleHalalPizza extends Pizza{
    public ChicagoStyleHalalPizza() {
        name = "Chicago Halal Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Chocolate Sauce";

        toppings.add("Mozzarella Cheese");
        toppings.add("Olives oil");
        toppings.add("Egg");
        toppings.add("Grill Bacon");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
