package collections.list.arraylist.banking;

import java.util.ArrayList;
import java.util.List;

public class Branch {

    private String name;
    List<Customer> customers = new ArrayList<>();

    public Branch(String name, List<Customer> customers) {
        this.name = name;
        this.customers = customers;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addNewCustomer(Customer customer){
        if (findCustomer(customer) >= 0) {
            return false;
        }
        return customers.add(customer);
    }

    public boolean updateTransactions(Customer customer){
        int index = findCustomer(customer);
        if (index >= 0) {
            customers.set(index, customer);
            return true;
        }
        return false;
    }

    private int findCustomer(Customer customer){
        for (int i = 0; i < customers.size(); i++){
            if (customer.getName().equals(customers.get(i).getName()))
                return i;
        }
        return -1;
    }
}
