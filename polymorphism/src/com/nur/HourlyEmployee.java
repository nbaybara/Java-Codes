package com.nur;

public class HourlyEmployee extends  Employee{
    private double wage ; //price per hour
    private double hours ;

    public HourlyEmployee(String firstName, String lastName, String ssn, double wage, double hours) {
        super(firstName, lastName, ssn);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    @Override
    public double earnings() {

        if (hours<40)
            return wage * hours;
        else
            return 40 * wage + (hours -40) * wage *1.5;
    }
}
