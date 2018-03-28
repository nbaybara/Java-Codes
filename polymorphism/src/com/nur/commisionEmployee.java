package com.nur;

public class commisionEmployee extends Employee {
    private double commissionRate;
    private double grossSale;

    public commisionEmployee(String firstName, String lastName, String ssn, double commissionRate, double grossSale) {
        super(firstName, lastName, ssn);
        setCommissionRate(commissionRate);
        setGrossSale(grossSale);

    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getGrossSale() {
        return grossSale;
    }
    @Override
    public double earnings()
    {
        return commissionRate * grossSale ;
    }
}
