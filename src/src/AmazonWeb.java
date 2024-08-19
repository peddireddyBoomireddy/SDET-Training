// Abstraction and Encapsulation: Amazon class
class Amazon {
    private String orderId;
    private String product;

    // Constructor
    public Amazon(String orderId, String product) {
        this.orderId = orderId;
        this.product = product;
    }

    // Getter and Setter for orderId (Encapsulation)
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    // Getter and Setter for product (Encapsulation)
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    // Method to display order details (Polymorphism - Method Overriding)
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId + ", Product: " + product);
    }
}

// Inheritance: Electronics class inherits from Amazon
class Electronics extends Amazon {
    private String warranty;

    // Constructor
    public Electronics(String orderId, String product, String warranty) {
        super(orderId, product); // Calling the parent class constructor
        this.warranty = warranty;
    }

    // Getter and Setter for warranty (Encapsulation)
    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    // Overriding the displayOrderDetails method (Polymorphism)
    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails(); // Calling the parent class method
        System.out.println("Warranty: " + warranty);
    }
}

// Main class to demonstrate OOP concepts
public class AmazonWeb {
    public static void main(String[] args) {
        // Creating an Amazon object
        Amazon order1 = new Amazon("ORD123", "Book");
        order1.displayOrderDetails();

        // Creating an Electronics object
        Electronics order2 = new Electronics("ORD124", "Smartphone", "2 Years");
        order2.displayOrderDetails(); // This will call the overridden method in Electronics class
    }
}
