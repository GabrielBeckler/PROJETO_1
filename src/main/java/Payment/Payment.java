package Payment;

import Order.Order;
import Order.OrderStatus;

public class Payment {
    private String id;
    private String dateRegister;
    private Order order;
    private double value;
    private PaymentMethod method;
    private PaymentStatus status;

    public Payment() {
        this.method = PaymentMethod.CREDIT_CARD;
        this.status = PaymentStatus.PENDING;
    }

    public Payment(String id, String dateRegister, Order order, double value) {
        this(id, dateRegister, order, value, PaymentMethod.CREDIT_CARD, PaymentStatus.PENDING);
    }

    public Payment(String id, String dateRegister, Order order, double value, PaymentMethod method) {
        this(id, dateRegister, order, value, method, PaymentStatus.PENDING);
    }

    public Payment(String id, String dateRegister, Order order, double value, PaymentStatus status) {
        this(id, dateRegister, order, value, PaymentMethod.CREDIT_CARD, status);
    }

    public Payment(String id, String dateRegister, Order order, double value,
                   PaymentMethod method, PaymentStatus status) {
        this.id = id;
        this.dateRegister = dateRegister;
        this.order = order;
        this.value = value;
        this.method = method;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(String dateRegister) {
        this.dateRegister = dateRegister;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public PaymentMethod getMethod() {
        return method;
    }

    public void setMethod(PaymentMethod method) {
        this.method = method;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public boolean isPaid() {
        return status == PaymentStatus.PAID;
    }

    public void payOrder() {
        if (isPaid()) {
            throw new IllegalStateException("java.Payment has already been completed.");
        }

        status = PaymentStatus.PAID;
        if (order != null) {
            order.setStatus(OrderStatus.PAID);
        }
    }

    public void cancelOrder() {
        status = PaymentStatus.FAILED;
    }

    public void refundOrder() {
        status = PaymentStatus.REFUNDED;
    }
}
