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
    private OrderStatus status;

    public Order(LocalDate dateOrder, Customer customer) {
        this(dateOrder, customer, OrderStatus.CREATED);
    }

    public Order(LocalDate dateOrder, Customer customer, OrderStatus status) {

        this.id = countId++;
        this.dateOrder = dateOrder;
        this.customer = customer;
        this.status = status;
        this.items = new ArrayList<>();
        this.totalValue = 0;
    }

    @Deprecated
    public Order(LocalDate dateOrder, Customer customer, String status) {
        this(dateOrder, customer, OrderStatus.valueOf(status.toUpperCase()));
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

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null.");
        }
        items.add(item);
        item.setOrder(this);
        calculateTotal();
    }

    public void removeItem(OrderItem item) {
        if (items.remove(item)) {
            item.setOrder(null);
            calculateTotal();
        }
    }

    public void calculateTotal() {
        totalValue = 0;
        for (OrderItem item : items) {
            totalValue += item.getSubtotal();
        }
    }

    public void finishOrder() {
        if (items.isEmpty()) {
            throw new IllegalStateException("It is not possible to finish an order without items.");
        }
        status = OrderStatus.PAYMENT_PENDING;
    }

    public void cancelOrder() {
        status = OrderStatus.CANCELLED;
    }
}
