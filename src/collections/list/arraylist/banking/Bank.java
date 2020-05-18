package collections.list.arraylist.banking;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    public static void main(String[] args) {

        List<Customer> customers = new ArrayList<>();
        transactions.add(10.0);
        Customer customer = new Customer("test1", transactions);
        customers.add(customer);
        Branch branch = new Branch("branch1", customers);
        branches.add(branch);

        List<Double> transactions2;
        transactions2 = new ArrayList<>();
        List<Customer> customers2 = new ArrayList<>();
        transactions2.add(10.0);
        Customer customer2 = new Customer("test2", transactions);
        customers2.add(customer2);
        Branch branch2 = new Branch("branch2", customers2);
        addBranch(branch2);
        Customer customer3 = new Customer("test3", transactions);
        addCustomer(branch2, customer3);
        addTransaction(branch2, customer3, 5.0);
        showCustomerDetails();
    }
    private static List<Double> transactions = new ArrayList<>();
    private static List<Branch> branches = new ArrayList<>();

    private static void addBranch(Branch branch){
        branches.add(branch);
    }

    private static void addCustomer(Branch branch, Customer customer){
        branch.addNewCustomer(customer);
    }

    private static void addTransaction(Branch branch, Customer customer, double transaction){
        transactions.add(transaction);
        customer.setTransactions(transactions);
        branch.updateTransactions(customer);
    }

    private static void showCustomerDetails() {
        for (Branch branch : branches) {
            for (Customer customer : branch.getCustomers()) {
                System.out.println("Details:: BranchName: " + branch.getName() + " - " + customer.getName()
                + ", " + customer.getTransactions().toString());
            }
        }
    }
}
