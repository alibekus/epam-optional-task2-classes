package kz.akbar.model;

import java.util.Date;

public class Product {
    private int id;
    private String name;
    private String upc;
    private Manufacturer manufacturer;
    private double price;
    private Date expireDate;
    private int quantity;

    public Product(String name, String upc, Manufacturer manufacturer, double price, Date expireDate, int quantity) {
        this.id = IdGenerator.generateId();
        this.name = name;
        this.upc = upc;
        this.manufacturer = manufacturer;
        this.price = price;
        this.expireDate = expireDate;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUpc() {
        return upc;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public int getQuantity() {
        return quantity;
    }
}
