package bank;

import java.util.ArrayList;

public class Bank {

    String name;
    ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String bname, String cname, Double initA) {
        Branch branch = findBranch(bname);
        if (branch != null) {
            return branch.addNewCustomer(cname, initA);
        }
        return false;
    }

    public boolean addCustomerTransaction(String bname, String cname, Double amount) {
        Branch branch = findBranch(bname);
        if (branch != null) {
            return branch.addCustomerTransaction(cname, amount);
        }
        return false;
    }

    private Branch findBranch(String bname) {
        for (int i = 0; i < branches.size(); i++) {
            Branch existingBranch = branches.get(i);
            if (existingBranch.getName().equals(bname)) {
                return existingBranch;
            }

        }
        return null;
    }

    public boolean listCustomers(String bname, boolean showTransaction) {
        Branch branch = findBranch(bname);
        if (branch != null) {
            System.out.println("Customer Detail for Branch " + branch.getName() + " :");
            ArrayList<Customer> branchCustomer = branch.getCustomers();
            for (int i = 0; i < branchCustomer.size(); i++) {
                Customer c = branchCustomer.get(i);
                System.out.println("Customer: " + c.getName() + "[" + i + "]");
                if (showTransaction) {
                    System.out.println("Transactions:");
                    ArrayList<Double> transactions = c.getTransactions();
                    for(int x=0; x<transactions.size();x++){
                        System.out.println(" "+(x+1)+". Amount "+transactions.get(x));
                    }
                }
            }
            return true;
        }
        else{
        return false;
        }
    }

}
