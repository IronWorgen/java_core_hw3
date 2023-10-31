package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = new Employee(
                "Ivan", "Just man", 8906, 1000,
                new GregorianCalendar(1998, 9, 30).getTime());

        Employee boss1 = (Boss) new Boss(
                "God", "Just man", 8906, 100000,
                new GregorianCalendar(1998, 8, 30).getTime());

        Employee employee2 = new Employee(
                "Stas", "Just man", 8907, 1000,
                new GregorianCalendar(2000, 1, 30).getTime());

        Employee boss2 = new Boss(
                "Main", "Just man", 8906, 100000,
                new GregorianCalendar(1998, 8, 10).getTime());

        employeeList.add(employee1);
        employeeList.add(boss1);
        employeeList.add(employee2);
        employeeList.add(boss2);

        printList(employeeList);
        ((Boss) boss1).boostSalary(employeeList, 100);

        System.out.println();
        printList(employeeList);
        System.out.println();

        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getSalary() == o2.getSalary()) {
                    return o1.compareTo(o2);
                } else if (o1.getSalary() > o2.getSalary()) {
                    return 1;
                } else {
                    return -1;
                }

            }
        });
        printList(employeeList);

    }

    private static <T> void printList(List<T> list) {
        for (T item :
                list) {
            System.out.println(item.toString());
        }
    }
}