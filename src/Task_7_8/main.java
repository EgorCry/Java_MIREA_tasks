package Task_7_8;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        Random random = new Random();

        Company obj = new Company();
        String[] names = {"Jack", "Rose", "Anna", "Gregory", "Liam", "Olivia", "Emma", "Noah",
                "Ava", "Elijah", "Lucas", "Mia", "Ethan", "Emily", "Charlotte", "Isabella"};
        String[] secondNames = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia",
                "Miller", "Davis", "Rodriguez", "Martinez", "Hernandez", "Lopez", "Gonzales", "Wilson", "Anderson"};

        for (int i=0;i<180;i++){
            obj.hire(new Employee(names[random.nextInt(names.length)],
                        secondNames[random.nextInt(secondNames.length)], Math.random()*(50000.0-30000.0+1.0)+30000.0,
                        new Operator()));
        }
        for (int i=0;i<80; i++){
            obj.hire(new Employee(names[random.nextInt(names.length)],
                    secondNames[random.nextInt(secondNames.length)], Math.random()*(80000.0-70000.0+1.0)+70000.0,
                    new Manager()));
        }
        System.out.println();
        for (int i=0; i<10; i++){
            obj.hire(new Employee(names[random.nextInt(names.length)],
                    secondNames[random.nextInt(secondNames.length)], Math.random()*(100000.0-90000.0+1.0)+90000.0,
                    new TopManager()));
        }

        List<Employee> top = obj.getTopSalaryStaff(15);
        List<Employee> bottom = obj.getLowestSalaryStaff(30);
        System.out.println("Top");
        for(int i=0;i<15;i++){
            System.out.println(Math.round(top.get(i).getBaseSalary()*1000)/1000 + " " + "руб.");
        }
        System.out.println();
        System.out.println("Bottom");
        for(int i=0;i<30;i++){
            System.out.println(Math.round(bottom.get(i).getBaseSalary()*1000)/1000 + " " + "руб.");
        }

        for(int i=0;i<135;i++){
            obj.fire(random.nextInt(270-1-i));
        }

        System.out.println();
        top = obj.getTopSalaryStaff(15);
        bottom = obj.getLowestSalaryStaff(30);
        System.out.println("Top");
        for(int i=0;i<15;i++){
            System.out.println(Math.round(top.get(i).getBaseSalary()*1000)/1000 + " " + "руб.");
        }

        System.out.println();
        System.out.println("Bottom");
        for(int i=0;i<30;i++){
            System.out.println(Math.round(bottom.get(i).getBaseSalary()*1000)/1000 + " " + "руб.");
        }
    }
}

