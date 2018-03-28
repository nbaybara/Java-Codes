package com.nur;

public  abstract class Employee {
    private String firstName ;
    private String lastName ;
    private String ssn ;

    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    public abstract double earnings();
    @Override
    public String toString()
    {
        return this.firstName +" " +this.lastName +" " + this.ssn+ " "+ earnings() ;
    }
}

