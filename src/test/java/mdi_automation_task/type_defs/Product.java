package mdi_automation_task.type_defs;

public class Product {
    private String name, price, quantity;

    public Product(String name, String price, String quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getSubtotal() {
        //Convert price and quantity to int to calculate the subtotal then reconvert them to string again
        return String.valueOf((Integer.parseInt(price) * Integer.parseInt(quantity)));
    }
}
