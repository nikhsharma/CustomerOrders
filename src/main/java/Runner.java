import db.DBCustomer;
import db.DBOrder;
import models.Customer;
import models.Order;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Bob", "Bob", "12 Street Street");
        DBCustomer.save(customer1);

        Customer customer2 = new Customer("Fred", "Fred", "12 Street Street");
        DBCustomer.save(customer2);

        DBCustomer.delete(customer1);

        customer2.setAddress("14 Street Street");
        DBCustomer.update(customer2);

        List<Customer> customers = DBCustomer.getCustomers();


        Order order1 = new Order("order", 3);
        DBOrder.save(order1);

        Order order2 = new Order("order2", 5);
        DBOrder.save(order2);

        DBOrder.delete(order1);

        order2.setQuantity(10);
        DBOrder.update(order2);

        List<Order> orders = DBOrder.getOrders();
    }
}
