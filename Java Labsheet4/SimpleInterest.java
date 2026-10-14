public class SimpleInterest {
    double principal;
    double rate;
    double time;
    static String bank = "ABC Bank";

    SimpleInterest(double p, double r, double t) {
        principal = p;
        rate = r;
        time = t;
    }

    void calculateInterest() {
        double interest = (principal * rate * time) / 100;
        double totalAmount = principal + interest;

        System.out.println("Bank: " + bank);
        System.out.println("Principal: Rs. " + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: Rs. " + interest);
        System.out.println("Total Amount: Rs. " + totalAmount);
    }

    public static void main(String[] args) {
        double principal = 10000;
        double rate = 5;
        double time = 2;

        SimpleInterest si = new SimpleInterest(principal, rate, time);
        si.calculateInterest();
    }
}
