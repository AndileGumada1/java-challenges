package com.andile;

import com.andile.model.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //create an object list of employees
        List<Employee> employees = new ArrayList<>();

        //add employees in the list:
        employees.add(new Employee( "Tiger Nixon",40 ,20));
        employees.add(new Employee( "Jenette Caldwell" ,23 ,2));
        employees.add(new Employee("Doris Wilder",45 ,16));
        employees.add(new Employee("Rhona Davidson", 22 ,1));
        employees.add(new Employee("Colleen Hurst",45,16));
        employees.add(new Employee( "Michael Silva", 43 ,13));
        employees.add(new Employee("Paul Byrd",46 ,15));
        employees.add(new Employee("Gloria Little",39 ,10));
        employees.add(new Employee("Brielle Williamson",27,7));
        employees.add(new Employee("Caesar Vance" ,37 ,7));



        List<Employee> sortedList = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getAge).reversed())//we supply the Employees age, via method reference
                .collect(Collectors.toList());


        sortedList.forEach(System.out::println);
    }
}
