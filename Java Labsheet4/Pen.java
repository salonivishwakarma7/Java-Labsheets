public class Pen {
    String color;
    String type;
    static String manufacturer = "Cello";

    Pen(String penColor, String penType) {
        color = penColor;
        type = penType;
    }

    void displayDetails() {
        String penColor = color;
        String penType = type;

        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Pen Color: " + penColor);
        System.out.println("Pen Type: " + penType);
    }

    public static void main(String[] args) {
        String color = "Blue";
        String type = "Ballpoint";

        Pen pen = new Pen(color, type);
        pen.displayDetails();
    }
}
