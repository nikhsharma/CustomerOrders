package models;

public class Order {

    private String description;
    private int quantity;
    private int id;

    public Order(String description, int quantity) {
        this.description = description;
        this.quantity = quantity;
    }

    public Order() { }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
