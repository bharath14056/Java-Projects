import java.util.*;

class User {

    String username;
    long phno;
    int userid;

    public User(String username, long phno, int userid) {
        this.username = username;
        this.phno = phno;
        this.userid = userid;
    }

    void userdetails() {
        System.out.println("\t\tUser Details:");
        System.out.println("\t\tUsername: " + username);
        System.out.println("\t\tPhone Number: " + phno);
        System.out.println("\t\tUser ID: " + userid);
    }
}

class Product {

    String productname;
    double price;

    public Product(String productname, double price) {
        this.productname = productname;
        this.price = price;
    }

    void productdetails() {
        System.out.println("\t\tProduct Details:");
        System.out.println("\t\tProduct Name: " + productname);
        System.out.println("\t\tPrice: " + price);
    }
}

interface payment {
    String pay(double amount);
}

class UPI implements payment {
   @Override
    public String pay(double amount) {
        return "Payment of " + amount + " made through UPI.";
    }
}

class Card implements payment {
    
    public String pay(double amount) {
        return "Payment of " + amount + " made through Card.";
    }
}

class Cash implements payment {
    @Override
    public String pay(double amount) {
        return "Payment of " + amount + " made through Cash.";
    }
}

public class Ecomerce {

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        System.out.println("Welcome to Ecomerce world ");

        // User
        User user1 = new User("John Doe", 1234567890L, 1);
        user1.userdetails();
        // Product
        Product product1 = new Product("Laptop", 999.99);
        product1.productdetails();

        // Payment choice
        System.out.println("\n\t\tChoose Payment Method (UPI / CARD / CASH):");
        String paymentmethod = sc.next();

        payment payObj = null;

        if (paymentmethod.equalsIgnoreCase("UPI")) {
            payObj = new UPI();
        } 
        else if (paymentmethod.equalsIgnoreCase("CARD")) {
            payObj = new Card();
        } 
        else if (paymentmethod.equalsIgnoreCase("CASH")) {
            payObj = new Cash();
        } 
        else {
            System.out.println("Invalid payment method selected.");
            return;
        }

        // Payment processing
        System.out.println(payObj.pay(product1.price));
    }
}