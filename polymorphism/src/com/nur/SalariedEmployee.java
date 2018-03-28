package com.nur;

public class SalariedEmployee extends Employee {
    private double weeklySalary ;

    public SalariedEmployee(String firstName, String lastName, String ssn, double weeklySalary) {
        super(firstName, lastName, ssn);
        setWeeklySalary(weeklySalary);
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
    @Override
    public double earnings()
    {
        return weeklySalary * 1.2 ;
    }
}
