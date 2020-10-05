package Task_9;

import java.util.ArrayList;

public class Company {
    private ArrayList<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    void HireEmployee(Employee employee){
        employees.add(employee);
    }

    void FireEmployee(int index){
        employees.remove(index);
    }


    public void doSomething(EmployeeSelector selector, HandleEmployee handle){
        int count = 0;
        for(Employee employee : employees){
            if(selector.isNeed(employee)){
                handle.handleEmployee(employee, count);
            }
            count++;
        }
        System.out.println(count);
    }
}
