package assignment11;

import java.util.ArrayList;
import java.util.List;

abstract class Product {
    private String name;
    public String description;
    public double price;

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public abstract String getDescription();
    public abstract double getPrice();

    public String getName() {
        return name;
    }

    public String getBasicInfo() {
        return "Name: " + name + ", Price: $" + price;
    }
}

class ElectronicsProduct extends Product {
    private String brand;
    private String warranty;

    public ElectronicsProduct(String name, String description, double price, String brand, String warranty) {
        super(name, description, price);
        this.brand = brand;
        this.warranty = warranty;
    }

    public String getDescription() {
        return super.getBasicInfo() + ", Brand: " + brand + ", Warranty: " + warranty;
    }

    public double getPrice() {
        return price; 
    }

    public String getBrand() {
        return brand;
    }

    public String getWarranty() {
        return warranty;
    }
}

class ClothingProduct extends Product {
    private String size;
    private String material;

    public ClothingProduct(String name, String description, double price, String size, String material) {
        super(name,description,price);
        this.size = size;
        this.material = material;
    }

    public String getDescription() {
        return super.getBasicInfo() +",Brand: "+ description + ", Size: " + size + ", Material: " + material;
    }

    public double getPrice() {
        return price; 
    }

    public String getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }
}

class BookProduct extends Product {
    private String author;
    private String isbn;

    public BookProduct(String name, String description, double price, String author, String isbn) {
        super(name, description, price);
        this.author = author;
        this.isbn = isbn;
    }

    public String getDescription() {
        return super.getBasicInfo() + ", Author: " + author + ", ISBN: " + isbn;
    }

    public double getPrice() {
        return price; 
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}

class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayProducts() {
        System.out.println("Products in your shopping cart:");
        for (Product product : products) {
            System.out.println(product.getDescription());
        }
    }

    public double calculateTotalPrice() {
        double total = 0.0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}


public class ProductManagementSystem {
	public static void main(String[] args) {
        ElectronicsProduct laptop = new ElectronicsProduct(
            "Laptop", "High-performance laptop", 65000, "Lenovo", "2 years");
        
        ClothingProduct tshirt = new ClothingProduct(
            "Top", "Avaasa", 499, "S", "Cotton");
        
        BookProduct javaBook = new BookProduct(
            "Java Programming", "Learn Java programming", 350, "John Doe", "123-456");

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(laptop);
        cart.addProduct(tshirt);
        cart.addProduct(javaBook);
        cart.displayProducts();

        System.out.println("\nTotal Price: Rs." + cart.calculateTotalPrice());
    }
}

