package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;


public class Boss extends Employee {
    public Boss(String name, String position, int phoneNumber, long salary, Date brithDay) {
        super(name, position, phoneNumber, salary, brithDay);
    }

    public void boostSalary(List<Employee> employees, long volume) {
        for (Employee currentEmployee :
                employees) {
            if (!currentEmployee.getClass().equals(this.getClass())) {
                currentEmployee.setSalary(currentEmployee.getSalary() + volume);
            }
        }
    }


}
