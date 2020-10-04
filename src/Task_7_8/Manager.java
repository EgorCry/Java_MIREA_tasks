package Task_7_8;

public class Manager implements EmployeePosition{
    @Override
    public String GetJobTitle() {
        return "Manager";
    }

    @Override
    public double calcSalary(double baseSalary) {
        double income = Math.random()*(140000-115000+1)+115000;
        return baseSalary + income*0.05;
    }
}
