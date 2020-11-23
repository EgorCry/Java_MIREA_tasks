package Task_2;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[] {"Joe", "Rogue", "Asap"};
        int[] ages = new int[] {2, 4, 1};
        Dog first = new Dog(names[0], ages[0]);
        Dog second = new Dog(names[1], ages[1]);
        Dog third = new Dog(names[2], ages[2]);
        Dog[] dogs = new Dog[] {first, second, third};
        System.out.println("Питомник 09.15.20");
        for (int i=0; i<dogs.length;i++){
            System.out.println(i+1 + ": " + dogs[i].toString());
        }
        second.setName("Rory");
        second.setAge(1);
        System.out.println("Питомник 10.15.20");
        for (int i=0;i<dogs.length;i++){
            System.out.println(i+1 + ": " + dogs[i].toString());
        }
    }
}