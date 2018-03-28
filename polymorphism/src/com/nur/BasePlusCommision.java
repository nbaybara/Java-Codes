package com.nur;

class BasePlusCommisionEmployee extends commisionEmployee{

    private double baseSalary ;

    public BasePlusCommisionEmployee(String firstName, String lastName, String ssn, double commissionRate, double grossSale, double baseSalary) {
        super(firstName, lastName, ssn, commissionRate, grossSale);
        setBaseSalary(baseSalary);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    @Override
    public double earnings(){
        return super.earnings() + baseSalary ;
    }
}
