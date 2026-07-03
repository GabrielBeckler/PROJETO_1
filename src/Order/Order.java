package Order;

import Customer.Customer;

import java.time.LocalDate;
import java.util.ArrayList;

public class Order {

    private static int countId = 1;

    private final int id;
    private LocalDate dateOrder;
    private Customer customer;
    private ArrayList<OrderItem> items;
    private double totalValue;
    private String status;

    public Order(LocalDate dateOrder, Customer customer, String status) {

        this.id = countId++;
        this.dateOrder = dateOrder;
        this.customer = customer;
        this.status = status;
        this.items = new ArrayList<>();
        this.totalValue = 0;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(LocalDate dateOrder) {
        this.dateOrder = dateOrder;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<OrderItem> getItems() {
        return items;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}