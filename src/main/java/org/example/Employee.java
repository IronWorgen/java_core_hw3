package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Comparable<Employee> {
    private String name;
    private String position;
    private int phoneNumber;
    private long salary;
    private Date brithDay;


    @Override
    public int compareTo(Employee o) {
        return this.getBrithDay().compareTo(o.getBrithDay());
    }

}
