package bank;

import java.util.ArrayList;

public class Branch {

    private String name;
    ArrayList<Customer> customers;

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<Customer>();
    }

    public boolean addNewCustomer(String customerName, Double initialAmount) {
        if(findCustomer(customerName) == null)
        {
         this.customers.add(new Customer(customerName,initialAmount));   
         return true;
        }
        
        return false;
    }
    public boolean addCustomerTransaction(String customerName, Double Amount){
        Customer existingCustomer= findCustomer(customerName);
        if(findCustomer(customerName) != null){
            existingCustomer.addTransaction(Amount);
            return true;
        }
        return false;
    }
    private Customer findCustomer(String cname){
        for(int i=0; i<customers.size();i++){
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(cname)){
                return this.customers.get(i);
            }
        }
        return null;
    }
   
}