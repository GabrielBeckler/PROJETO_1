import Customer.Customer;
import Order.Order;
import Order.OrderItem;
import Payment.Payment;
import Payment.PaymentMethod;
import Product.Product;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Gabriel", "Silva", LocalDate.now(),
                "01001-000", "gabriel@email.com", "11999999999");
        Product product = new Product("Notebook", "NOTE-001", "Notebook for work", 2500.00);

        Order order = new Order(LocalDate.now(), customer);
        OrderItem item = new OrderItem(product, 2);
        order.addItem(item);
        order.finishOrder();

        Payment payment = new Payment("PAY-001", LocalDate.now().toString(), order,
                order.getTotalValue(), PaymentMethod.PIX);
        payment.payOrder();

        System.out.println("Cliente: " + customer.getFistName());
        System.out.println("Produto: " + product.getName());
        System.out.println("Quantidade: " + item.getQuantity());
        System.out.printf("Total: R$%.0f%n", order.getTotalValue());
        System.out.println("Pedido: " + order.getStatus());
        System.out.println("Pagamento: " + payment.getStatus());
    }
}
