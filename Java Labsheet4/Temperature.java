public class Temperature {
    double celsius;
    static String scale = "Celsius";

    Temperature(double celsius) {
        this.celsius = celsius;
    }

    void convertTemperature() {
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        double kelvin = celsius + 273.15;

        System.out.println("Temperature in " + scale + ": " + celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        System.out.println("Temperature in Kelvin: " + kelvin);
    }

    public static void main(String[] args) {
        double temperature = 25.0;

        Temperature t = new Temperature(temperature);
        t.convertTemperature();
    }
}
