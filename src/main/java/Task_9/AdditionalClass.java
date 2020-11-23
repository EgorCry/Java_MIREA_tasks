package Task_9;

public class AdditionalClass implements EmployeeSelector{
    private double salary;

    public AdditionalClass(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean isNeed(Employee employee) {
        return employee.getSalary()<salary;
    }
}
