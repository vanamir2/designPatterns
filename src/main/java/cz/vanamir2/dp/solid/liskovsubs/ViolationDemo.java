package cz.vanamir2.dp.solid.liskovsubs;

public class ViolationDemo {

    static void useIt(Rectangle rectangle) {
        int width = rectangle.getWidth();
        rectangle.setHeight(10);
        // area = width * 10
        System.out.println("Expected area of " + (width * 10) + ", got " + rectangle.getArea());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        useIt(rectangle);

        // Square is subclass of Rectangle
        Square square = new Square();
        square.setHeight(5);
        useIt(square);
    }
}
