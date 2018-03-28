package com.nur;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	Employee se = new SalariedEmployee("Nur" , "baybara " , "abc",1200);
	Employee he = new HourlyEmployee("Sefa", "baybara","asdf",4.2,15);
	Employee ce = new commisionEmployee("Elif","naz","ert" , 12.5 , 125);
	Employee bpce = new BasePlusCommisionEmployee("Tuna","suat","nurr",23.5 ,100,1300);

        ArrayList<Employee> employeList = new ArrayList<Employee>() ;
        employeList.add(se);
        employeList.add(he);
        employeList.add(ce);
        employeList.add(bpce);

        for (Employee e : employeList)
            System.out.println(e.earnings()+" "+e);

   }
}
