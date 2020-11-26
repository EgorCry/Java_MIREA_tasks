package Task_21_22;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    static Scanner scanner = new Scanner(System.in);
    static Gson gson = new Gson();

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Choose which one we will use (1)File or (2)Server?");
        int choice = scanner.nextInt();
        while(choice<1 || choice>2){
            System.out.println("Well... Try again");
            System.out.println("Choose which one we will use (1)File or (2)Server?");
            choice = scanner.nextInt();
        }
        if(choice==1){
            TheJobThatHasTobeDone_File();
        }
        else {
            TheJobThatHasTobeDone_Server();
        }
    }

    static Item createObject(){
        System.out.println("Print Id");
        int id = scanner.nextInt();
        System.out.println("Print data");
        scanner.nextLine();
        String data = scanner.nextLine();
        System.out.println("Print is good this object or not (true/false)");
        boolean isGood = scanner.nextBoolean();
        System.out.println("Print description 'bout this object");
        scanner.nextLine();
        String description = scanner.nextLine();
        Item item = new Item(id, data, isGood, description);
        return item;
    }

    static void info(){
        System.out.println("Smart choice... I guess");
        System.out.println("Ok. As you now can see I have some instructions:");
        System.out.println("1 - get all objects from archive without description");
        System.out.println("2 - get one specified object from archive by using Id");
        System.out.println("3 - add object in archive");
        System.out.println("4 - edit one specified object in archive by replacing him with new object");
        System.out.println("5 - delete one specified object from archive by telling what this object about. I could" +
                "use Id, but educator of my handsome and smart creator pointed on object in TS, so suffer!");
        System.out.println("    I meant, type object completely");
        System.out.println("0 - finish the program");
        System.out.println("-1 - if you need all commands see again");
    }

    static void TheJobThatHasTobeDone_File() throws IOException {
        FileWork work = new FileWork();
        info();
        int choice=-1;
        while(choice!=0){
            choice = scanner.nextInt();
            while(choice<-1 || choice>5){
                System.out.println("From 0 to 5. Try again please");
                choice = scanner.nextInt();
            }
            switch(choice){
                case(-1):{
                    info();
                    break;
                }
                case(0):{
                    break;
                }
                case(1):{
                    List<Item> objects = work.getAll();
                    System.out.println("[");
                    for (int i = 0; i < objects.size(); i++) {
                        System.out.println("\t{\n\t\t\"id\": " + "\"" + objects.get(i).getId() + "\"," + "\n\t\t\"data\": " + "\""
                                + objects.get(i).getData()
                                + "\"," + "\n\t\t\"isGood\": " + "\"" + objects.get(i).isGood() +  "\"" + "\n\t}");
                    }
                    System.out.println("]");
                    System.out.println("Input new instruction(-1 - 5)");
                    break;
                }
                case(2):{
                    System.out.println("Print Id");
                    int tempId = scanner.nextInt();
                    Item object = work.get(tempId);
                    System.out.println("\t{\n\t\t\"id\": " + "\"" + object.getId() + "\"," + "\n\t\t\"data\": " + "\""
                            + object.getData()
                            + "\"," + "\n\t\t\"isGood\": " + "\"" + object.isGood() +  "\"," + "\n\t\t\"description\": " +
                            "\"" +object.getDescription() + "\"" + "\n\t}");
                    System.out.println("Input new instruction(-1 - 5)");
                    break;
                }
                case(3):{
                    Item item = createObject();
                    work.addItem(item);
                    System.out.println("Input new instruction(-1 - 5)");
                    break;
                }
                case(4):{
                    Item item = createObject();
                    work.editItem(item);
                    System.out.println("Input new instruction(-1 - 5)");
                    break;
                }
                case(5):{
                    Item item = createObject();
                    work.deleteItem(item);
                    System.out.println("Input new instruction(-1 - 5)");
                    break;
                }
            }
        }
    }

    static void TheJobThatHasTobeDone_Server() throws IOException, InterruptedException {
        ServerWork work = new ServerWork();
        info();
        int choice=-1;
        while(choice!=0){
            choice = scanner.nextInt();
            while(choice<-1 || choice>5){
                System.out.println("From 0 to 5. Try again please");
                choice = scanner.nextInt();
            }
            switch(choice){
                case(-1):{
                    info();
                    break;
                }
                case(0):{
                    break;
                }
                case(1):{
                    List<Item> objects = work.getAll();
                    String temp = gson.toJson(objects);
                    Type founderListType = new TypeToken<ArrayList<Item>>(){}.getType();
                    List<Item> list = gson.fromJson(temp, founderListType);
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));
                    }
                    System.out.println("Input new instruction(-1 - 5)");
                    break;
                }
                case(2):{
                    System.out.println("Print Id");
                    int tempId = scanner.nextInt();
                    Item object = work.get(tempId);
                    System.out.println(object);
                    System.out.println("Input new instruction(-1 - 5)");
                    break;
                }
                case(3):{
                    Item item = createObject();
                    work.addItem(item);
                    System.out.println("Input new instruction(-1 - 5)");
                    break;
                }
                case(4):{
                    Item item = createObject();
                    work.editItem(item);
                    System.out.println("Input new instruction(-1 - 5)");
                    break;
                }
                case(5):{
                    Item item = createObject();
                    work.deleteItem(item);
                    System.out.println("Input new instruction(-1 - 5)");
                    break;
                }
            }
        }
    }
}