import db.DBCustomer;
import models.Customer;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Bob", "Bob", "12 Street Street");
        DBCustomer.save(customer1);

        List<Customer> customers = DBCustomer.getCustomers();
    }
}