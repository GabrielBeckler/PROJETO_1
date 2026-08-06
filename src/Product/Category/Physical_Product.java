package Product.Category;

import Product.Product;

public class Physical_Product extends Product {

    private int quantity;
    private int minimumQuantity;
    private double weight;
    private double height;
    private double width;
    private double length;
    private String manufacturer;
    private String warehouseLocation;

    public Physical_Product(String name,
                           String code,
                           String description,
                           double price,
                           int quantity,
                           int minimumQuantity,
                           double weight,
                           double height,
                           double width,
                           double length,
                           String manufacturer,
                           String warehouseLocation) {

        super(name, code, description, price);

        this.quantity = quantity;
        this.minimumQuantity = minimumQuantity;
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.length = length;
        this.manufacturer = manufacturer;
        this.warehouseLocation = warehouseLocation;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getMinimumQuantity() {
        return minimumQuantity;
    }

    public void setMinimumQuantity(int minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getWarehouseLocation() {
        return warehouseLocation;
    }

    public void setWarehouseLocation(String warehouseLocation) {
        this.warehouseLocation = warehouseLocation;
    }

    public void increaseStock(int Quantity) {

    }




}