package org.school;
class Article {
    private String code;
    private String description;
    private double cost;
    private int quantity;
    private String shelf;

    // Constructor to initialize an Article object
    public Article(String code, String description, double cost, int quantity, String shelf) {
        this.code = code;
        this.description = description;
        this.cost = cost;
        this.quantity = quantity;
        this.shelf = shelf;
    }

    // Getter methods for retrieving article attributes
    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getShelf() {
        return shelf;
    }

    // Setter method for updating article quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Code: " + code + "\nDescription: " + description + "\nCost: " + cost
                + "\nAvailable Quantity: " + quantity + "\nShelf: " + shelf + "\n";
    }
}

