public class Rectangle {
    double length;
    double breadth;
    static String shapeName = "Rectangle";

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    void calculateArea() {
        double area = length * breadth;

        System.out.println("Shape: " + shapeName);
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        double length = 10.0;
        double breadth = 5.0;

        Rectangle rectangle = new Rectangle(length, breadth);
        rectangle.calculateArea();
    }
}
