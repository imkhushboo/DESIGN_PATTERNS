package Decorator_Design_Pattern;

public class ExtraCheese extends Toppings{
    BasePizza obj;

    ExtraCheese(BasePizza obj){
        this.obj = obj;
    }

    @Override
    public int cost() {
        return this.obj.cost()+10;
    }
}
