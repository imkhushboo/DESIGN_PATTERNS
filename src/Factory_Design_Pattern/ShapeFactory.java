package Factory_Design_Pattern;

public class ShapeFactory {
    Shape getShape(String input){
        switch (input){
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            default:
                return new Circle();
        }
    }
}
