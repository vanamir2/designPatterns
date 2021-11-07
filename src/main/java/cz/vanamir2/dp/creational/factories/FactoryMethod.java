package cz.vanamir2.dp.creational.factories;

class Point {
    private double x, y;

    protected Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // singleton field
    public static final Point ORIGIN = new Point(0, 0);

    // factory method
    public static Point newCartesianPoint(double x, double y) {
        return new Point(x, y);
    }

    public static Point newPolarPoint(double rho, double theta) {
        return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
    }

    // in case you do not want public constructor
    public static class Factory {
        public static Point newCartesianPoint(double x, double y) {
            return new Point(x, y);
        }
    }
}

class FactoryMethod {
    public static void main(String[] args) {
        // this would be the solution when using just a constructor instead of factory
        // Point point = new Point(2, 3, CoordinateSystem.CARTESIAN);
        // Point origin = Point.ORIGIN;

        // Solution1 - Factory method
        Point point2 = Point.newCartesianPoint(1, 2);
        // Solution2 - Factory - Factory is inner class to hide private constructor
        Point point1 = Point.Factory.newCartesianPoint(1, 2);
    }
}
