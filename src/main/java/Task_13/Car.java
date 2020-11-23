package Task_13;

import java.util.concurrent.Future;

public class Car {
    private int year;
    private int weight;
    private String model;

    public Car(int year, int weight, String model) {
        this.year = year;
        this.weight = weight;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) throws FutureModelException {
        if (year>2020){
            throw new FutureModelException();
        }
        this.year = year;
    }

    public int getWeight() throws WeightException{
        if (weight<2000 || weight>3000){
            throw new WeightException();
        }
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                '}';
    }
}
