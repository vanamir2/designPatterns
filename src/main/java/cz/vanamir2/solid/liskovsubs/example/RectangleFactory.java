package cz.vanamir2.solid.liskovsubs.example;

// if you want an explicit Rectangle inicialization - you use factory, not inherited class
public class RectangleFactory {

    public static Rectangle newRectangle(int width, int height) {
        return new Rectangle(width, height);
    }

    public static Rectangle newSquare(int side) {
        return new Rectangle(side, side);
    }

}
