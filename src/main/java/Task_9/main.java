package Task_9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class main {
    public static void main(String[] args) {

        String[] names = {"Jack", "Rose", "Anna", "Gregory", "Liam", "Olivia", "Emma", "Noah",
                "Ava", "Elijah", "Lucas", "Mia", "Ethan", "Emily", "Charlotte", "Isabella"};
        String[] secondNames = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia",
                "Miller", "Davis", "Rodriguez", "Martinez", "Hernandez", "Lopez", "Gonzales", "Wilson", "Anderson"};

        Company obj = new Company();
        Random r = new Random();

        for (int i = 0; i < 50; i++) {
            obj.HireEmployee(new Employee(names[r.nextInt(16)], secondNames[r.nextInt(15)],
                    "Hamburg", "8-800-555-35-35", LocalDate.of(r.nextInt(2005-1990+1)+1990,
                    ((r.nextInt(12-1)+1)), (r.nextInt(28)+1)),
                    45000.0 + 5000.0 * r.nextDouble()));
        }

        obj.doSomething(
                new AdditionalClass(48_500.0),
                ((employee, index) -> System.out.println("employee " + index + ":" + employee))
        );

        obj.doSomething(new EmployeeSelector() {
            @Override
            public boolean isNeed(Employee employee) {
                return employee.getSalary() > 48_500.0;
            }
        }, new HandleEmployee() {
            @Override
            public void handleEmployee(Employee employee, int index) {
                System.out.println("=====" + index + "=====");
                System.out.println(employee);
            }
        });

        ArrayList<Employee> selection = new ArrayList<>();
        obj.doSomething(
                employee -> employee.getSalary() < 46_000.0 || employee.getSalary() > 48_000.0,
                ((employee, index) -> selection.add(employee))
        );
        for (int i = 0; i < selection.size(); i++) {
            System.out.println("+++++" + i + "+++++");
            System.out.println(selection.get(i));
        }
    }
}
