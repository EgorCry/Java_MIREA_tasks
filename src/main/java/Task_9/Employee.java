package Task_9;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Employee {
    private final String name, city, number;
    private String surname;
    private final LocalDate date;
    private final double salary;

    public Employee(String name, String surname, String city, String number, LocalDate date, double salary) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.number = number;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.date = date;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCity() {
        return city;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumber() {
        return number;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", number='" + number + '\'' +
                ", surname='" + surname + '\'' +
                ", date=" + date +
                ", salary=" + salary +
                '}';
    }
}
