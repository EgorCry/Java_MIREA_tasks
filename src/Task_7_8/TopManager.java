package Task_7_8;

public class TopManager implements EmployeePosition{

    @Override
    public String GetJobTitle() {
        return "Top-manager";
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary;
    }
}
