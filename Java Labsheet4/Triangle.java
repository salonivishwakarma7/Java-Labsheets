public class Triangle {
    double a, b, c;
    static String type = "Scalene/Isosceles/Equilateral";

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void checkTriangle() {
        boolean valid = a > 0 && b > 0 && c > 0
                && a + b > c
                && a + c > b
                && b + c > a;

        System.out.println("Triangle Type Categories: " + type);

        if (!valid) {
            System.out.println("The given sides do not form a valid triangle.");
        } else if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
    }

    public static void main(String[] args) {
        double side1 = 5;
        double side2 = 5;
        double side3 = 8;

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.checkTriangle();
    }
}
