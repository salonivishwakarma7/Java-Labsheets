class GeometricShape {
    double calculateArea() {
        return 0;
    }
}

class CircularShape extends GeometricShape {
    double radius;

    CircularShape(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class RectangularShape extends GeometricShape {
    double length;
    double width;

    RectangularShape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

public class ShapeAreaOverriding {
    public static void main(String[] args) {
        CircularShape circle = new CircularShape(5);
        RectangularShape rectangle = new RectangularShape(10, 4);

        System.out.printf("Area of Circle: %.2f%n", circle.calculateArea());
        System.out.printf("Area of Rectangle: %.2f%n", rectangle.calculateArea());
    }
}
