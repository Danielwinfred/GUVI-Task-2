import java.util.Scanner;

class Product {
    int pid;
    double price;
    int quantity;

    // Constructor
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}

class XYZ {
    // Method to calculate total amount spent on all products
    public static double calculateTotalAmount(Product[] products) {
        double totalAmount = 0;
        for (Product product : products) {
            totalAmount += product.price * product.quantity;
        }
        return totalAmount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        // Accepting product information from the user
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter product ID for product " + (i + 1) + ": ");
            int pid = scanner.nextInt();

            System.out.print("Enter price for product " + (i + 1) + ": ");
            double price = scanner.nextDouble();

            System.out.print("Enter quantity for product " + (i + 1) + ": ");
            int quantity = scanner.nextInt();

            products[i] = new Product(pid, price, quantity);
        }

        // Finding the product with the highest price
        int highestPricePid = products[0].pid;
        double highestPrice = products[0].price;

        for (int i = 1; i < products.length; i++) {
            if (products[i].price > highestPrice) {
                highestPrice = products[i].price;
                highestPricePid = products[i].pid;
            }
        }

        System.out.println("Product ID with the highest price: " + highestPricePid);

        // Calculating total amount spent
        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: $" + totalAmount);

        scanner.close();
    }
}
