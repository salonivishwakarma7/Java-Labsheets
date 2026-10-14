public class Product {
    int id;
    String name;
    double price;
    static double discountRate = 10.0;

    Product(int productId, String productName, double productPrice) {
        id = productId;
        name = productName;
        price = productPrice;
    }

    void calculateFinalPrice() {
        double discount = price * discountRate / 100;
        double finalPrice = price - discount;

        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Original Price: Rs. " + price);
        System.out.println("Discount: " + discountRate + "%");
        System.out.println("Discount Amount: Rs. " + discount);
        System.out.println("Final Price: Rs. " + finalPrice);
    }

    public static void main(String[] args) {
        int id = 101;
        String name = "Keyboard";
        double price = 1000;

        Product product = new Product(id, name, price);
        product.calculateFinalPrice();
    }
}
