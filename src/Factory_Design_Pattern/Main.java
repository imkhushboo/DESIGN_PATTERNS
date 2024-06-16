package Factory_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory obj = new ShapeFactory();
        Shape sh = obj.getShape("Circle");
        sh.draw();
    }
}
