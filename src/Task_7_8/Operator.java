package Task_7_8;

public class Operator implements EmployeePosition{

    @Override
    public String GetJobTitle() {
        return "Operator";
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary;
    }
}
