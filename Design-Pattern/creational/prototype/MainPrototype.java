package creational.prototype;

public class MainPrototype {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        try {
            Shape clonedCircle = (Shape) circle.clone();
            Shape clonedRectangle = (Shape) rectangle.clone();

            clonedCircle.draw();
            clonedRectangle.draw();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
