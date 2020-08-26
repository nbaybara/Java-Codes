package bank;

public class Main {
    public static void main(String[] args){
        Bank bank = new Bank("Ziraat");
        bank.addBranch("Istanbul");
        bank.addCustomer("Ziraat", "Nur", 0.0);
        bank.addCustomer("Ziraat", "Elif", 40.0);
        bank.addCustomer("Ziraat", "Merve", 70.0);
        
        bank.addBranch("Karabük");
        bank.addCustomer("Karabük", "Nurum", 0.0);
        bank.addCustomer("Karabük", "Elifim", 90.0);
        bank.addCustomer("Karabük", "Mervem", 70.0);
        
        bank.addCustomerTransaction("Karabük","Nurum",45.0);
        bank.addCustomerTransaction("Karabük","Elifim",80.0);
        bank.addCustomerTransaction("Karabük","Mervem",90.0);
        
        bank.addCustomerTransaction("Ziraat","Nur",45.0);
        bank.addCustomerTransaction("Ziraat","Elif",80.0);
        bank.addCustomerTransaction("Ziraat","Merve",90.0);
        
        bank.listCustomers("Karabük", true);
        bank.listCustomers("Ziraat", true);
    }
}
