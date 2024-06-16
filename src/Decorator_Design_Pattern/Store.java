package Decorator_Design_Pattern;

public class Store {
    public static void main(String[] args) {
        BasePizza obj = new Jalepino(new ExtraCheese(new Margherita()));

        System.out.println(obj.cost());
    }

}
