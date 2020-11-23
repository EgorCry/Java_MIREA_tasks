package Task_7_8;

public class Employee{
    private String first_name, second_name;
    private double baseSalary;
    private EmployeePosition position;

    public void setNewEmployee(String first_name, String second_name, double baseSalary, EmployeePosition position){
        this.first_name = first_name;
        this.second_name = second_name;
        this.baseSalary = baseSalary;
        this.position = position;
    }

    public Employee(String first_name, String second_name, double baseSalary, EmployeePosition position) {
        this.first_name = first_name;
        this.second_name = second_name;
        this.baseSalary = baseSalary;
        this.position = position;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = position.calcSalary(baseSalary);
    }

    public String getPosition() {
        return position.GetJobTitle();
    }

    public void setPosition(EmployeePosition position) {
        this.position = position;
    }
}
