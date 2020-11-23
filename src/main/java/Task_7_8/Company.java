package Task_7_8;

import java.util.*;

public class Company {
    private double income = 0;
    private List<Employee> employees = new ArrayList<>();
    private List<Double> incomes = new ArrayList<>();

    public List<Employee> getLowestSalaryStaff(int count){
        if (count<1){
            return null;
        }
        List<Employee> LowestSalaryStaff = new ArrayList<>(count);
        Collections.sort(employees, Comparator.comparingDouble(Employee::getBaseSalary));
        for(int i=0;i<count;i++){
            LowestSalaryStaff.add(employees.get(i));
        }
        return LowestSalaryStaff;
    }

    public List<Employee> getTopSalaryStaff(int count){
        if (count<1){
            return null;
        }
        List<Employee> TopSalaryStaff = new ArrayList<>(count);
        Collections.sort(employees, Comparator.comparingDouble(Employee::getBaseSalary));
        Collections.reverse(employees);
        for(int i=0;i<count;i++){
            TopSalaryStaff.add(employees.get(i));
        }
        return TopSalaryStaff;
    }

    public void sumIncome(double plus){
        this.income += plus;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Double> getIncomes() {
        return incomes;
    }

    public void setIncomes(List<Double> incomes) {
        this.incomes = incomes;
    }

    public void hire(Employee employee){
        employees.add(employee);
        if (employee.getPosition()=="Top-manager" && getIncome()>10000000.0){
            employee.setBaseSalary(employee.getBaseSalary()*2.5);
        }
        if (employee.getPosition()=="Manager"){
            double temp = employee.getBaseSalary();
            employee.setBaseSalary(employee.getBaseSalary());
            sumIncome((employee.getBaseSalary() - temp) * 20);
            incomes.add((employee.getBaseSalary() - temp) * 20);
        }
        else{
            incomes.add(0.0);
        }
    }

    public void hireAll(List<Employee> employeesToHire){
        for(Employee employee: employeesToHire){
            employees.add(employee);
        }
    }

    public void fire(int number){
        sumIncome(-incomes.get(number));
        incomes.remove(number);
        if(income<10000000.0){
            for (Employee employee : employees) {
                if (employee.getPosition() == "Top-manager" && employee.getBaseSalary() > 100000.0) {
                    employee.setBaseSalary(employee.getBaseSalary() / 2.5);
                }
            }
        }
        employees.remove(number);
    }

    public double getIncome(){
        return income;
    }

    public void setPosition(int number, String position, double baseSalary){
        income -= incomes.get(number);
        String name = employees.get(number).getFirst_name();
        String secondName = employees.get(number).getSecond_name();
        employees.remove(number);
        employees.add(number, new Employee(name, secondName, baseSalary, (position=="Top-manager" ?
            new TopManager() : position=="Manager" ? new Manager() : new Operator())));
        if (employees.get(number).getPosition()=="Top-manager" && getIncome()>10000000.0){
                employees.get(number).setBaseSalary(employees.get(number).getBaseSalary()*2.5);
        }
        if (employees.get(number).getPosition()=="Manager"){
            double temp = employees.get(number).getBaseSalary();
            employees.get(number).setBaseSalary(employees.get(number).getBaseSalary());
            sumIncome((employees.get(number).getBaseSalary() - temp) * 20);
            incomes.add((employees.get(number).getBaseSalary() - temp) * 20);
        }
        else{
            incomes.add(number, 0.0);
        }
    }
}
