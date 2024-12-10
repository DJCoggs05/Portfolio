package Project3;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Customer> customers;

    public Bank() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    public Customer getCustomerByPin(String pin) {
        return customers.stream()
                .filter(cust -> cust.getPin().equals(pin))
                .findFirst()
                .orElse(null);
    }

    public String getAllCustomersInfo() {
        if (customers.isEmpty()) return "No customers available.";
        StringBuilder sb = new StringBuilder();
        customers.forEach(customer -> sb.append(customer.toString()).append("\n"));
        return sb.toString();
    }
}
