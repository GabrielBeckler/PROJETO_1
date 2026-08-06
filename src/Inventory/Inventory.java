package Inventory;

import Product.Product;

import java.util.ArrayList;

public class Inventory {
    private int quantity;
    private ArrayList<Product> products;
    public Inventory() {
        products = new ArrayList<Product>();
        quantity = 0;

    }

}
