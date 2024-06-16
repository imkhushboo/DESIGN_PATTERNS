package Decorator_Design_Pattern;

public class Jalepino extends Toppings{
    BasePizza pizza;

    Jalepino(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost()+20;
    }
}
