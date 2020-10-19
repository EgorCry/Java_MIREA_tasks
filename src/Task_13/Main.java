package Task_13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car model = new Car(2018, 2017, "SoftlyCar");

        try {
            int weight = Integer.parseInt(new Scanner(System.in).nextLine());
            model.setWeight(1950);
            model.setYear(3506);
        }
        catch (FutureModelException ex){
            System.out.println("Wow, you are from future, aren't you?!");
        }
        catch (WeightException ex){
            System.out.println("Our lines cannot work with models of this weights, sowwy");
        }
        finally {
            System.out.println(model);
        }


    }
}
