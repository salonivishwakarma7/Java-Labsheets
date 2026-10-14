public class Circle {
    double radius;
    static final double PI = 3.14;

    Circle(double r) {
        radius = r;
    }

    void calculateCircle() {
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }

    public static void main(String[] args) {
        double radius = 7.0;

        Circle circle = new Circle(radius);
        circle.calculateCircle();
    }
}
