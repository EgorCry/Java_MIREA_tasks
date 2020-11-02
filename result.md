#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Additional_Task_1\Main.java
```java
package Additional_Task_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int c = 0;
        for(int j=0; j<=(a/3); j++){
            for(int k=0; k<=(a/3); k++){
                if(3*j+5*k>a){
                    break;
                }
                else{
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\com\company\Main.java
```java
package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\ForTests\Threads.java
```java
package ForTests;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class Threads {
    static int totalSum;
    static int totalSum1;
    static ReentrantLock lock = new ReentrantLock();
    static long[] sum = new long[12];

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            final int localI = i;
            Thread thread = new Thread(() -> work(localI));
            thread.start();
            threads.add(thread);
        }
        for (Thread t : threads) {
            t.join();
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
        long result = 0;
        for (int i = 0; i < sum.length; i++) {
            result += sum[i];
        }
        System.out.println(result);
    }

    private static void work(int i){
        long startTime = System.currentTimeMillis();
        long result = doHardWork(i * 1000, 100_000_000, i);
        long endTime = System.currentTimeMillis();

        System.out.println(i + ": " + result + " | " + (endTime-startTime));
    }

    private static long doHardWork(int start, int count, int j){
        long a =0;
        long b =0;
        for (int i = 0; i < count; i++) {
            a += (start+i) * (start + i) * Math.sqrt(start+i);
            totalSum++;
            b++;
        }
        sum[j]+=b;
        return a;
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_1\Main.java
```java
package Task_1;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static int fact(int number){
        int result = 1;
        for(int k=1; k <= number; k++){
            result *= k;
        }
        return result;
    }

    public static void main(String[] args) {
        //Программа для вывода суммы в массиве
        int[] massive = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int s1 = 0, s2 = 0, s3 = 0;
        for (int i = 0; i < massive.length; i++) {
            s1 += massive[i];
        }
        int i = 0;
        while (i < massive.length) {
            s2 += massive[i];
            i++;
        }
        i = 0;
        do {
            s3 += massive[i];
            i++;
        } while (i < massive.length);
        System.out.println("Сумма элементов массива");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        //Программа для вывода аргументов командной строки
        for (i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        //Гармонический ряд
        for (i = 1; i < 11; i++) {
            System.out.format("%.3f", (double) 1 / i);
            System.out.print(" ");
        }
        System.out.println();
        //Рандомный массив с рандомными числами
        int size_m = (int) (Math.random() * (20) + 1) + 5;
        int[] massive_r = new int[size_m];
        Random number = new Random();
        for (i = 0; i < size_m; i++) {
            int r = number.nextInt((100) + 1) + 1;
            massive_r[i] = r;
        }
        for (i=0; i<size_m; i++){
            System.out.print(massive_r[i] + " ");
        }
        Arrays.sort(massive_r);
        System.out.println();
        for(i=0;i<size_m;i++){
            System.out.print(massive_r[i] + " ");
        }
        //Факториал
        int factorial = (int)(Math.random()*(10)+1)+1;
        System.out.println();
        System.out.println(fact(factorial));
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_10\Calculator.java
```java
package Task_10;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.text.DecimalFormat;

public class Calculator extends JFrame{
        public Calculator(){

            DecimalFormat precision = new DecimalFormat("#.####");

            setTitle("Calculator");
            setSize(480, 830);
            setResizable(false);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//Close the app

            Color color = new Color(190, 50, 76);

            ImageIcon icon = new ImageIcon("src\\Task_10\\Pictures\\naruto.png");
            setIconImage(icon.getImage());//Set new icon

            JLabel background;
            ImageIcon image = new ImageIcon("src\\Task_10\\Pictures\\BorutoCalc.jpg");
            background = new JLabel("", image, JLabel.CENTER);
            background.setBounds(0,0,480,800);
            add(background);//For adding background

            JLabel result = new JLabel("Dattebayo!", JLabel.CENTER);
            result.setFont(new Font("Ninja Naruto", Font.BOLD, 35));
            result.setForeground(Color.BLACK);
            result.setBounds(77, 648, 312, 96);
            result.setBackground(color);

            JButton plus = new JButton();
            plus.setBounds(180, 112, 50, 55);
            plus.setIcon(new ImageIcon("src\\Task_10\\Pictures\\plus.png"));
            background.add(plus);

            JButton minus = new JButton();
            minus.setBounds(235, 112, 50, 55);
            minus.setIcon(new ImageIcon("src\\Task_10\\Pictures\\minus.png"));
            background.add(minus);

            JButton multi = new JButton();
            multi.setBounds(180, 172, 50, 55);
            multi.setIcon(new ImageIcon("src\\Task_10\\Pictures\\multi.png"));
            background.add(multi);

            JButton division = new JButton();
            division.setBounds(235, 172, 50, 55);
            division.setIcon(new ImageIcon("src\\Task_10\\Pictures\\division.png"));
            background.add(division);

            JButton erase1 = new JButton();
            erase1.setBounds(180, 232, 50, 55);
            erase1.setIcon(new ImageIcon("src\\Task_10\\Pictures\\erase.png"));
            background.add(erase1);

            JButton erase2 = new JButton();
            erase2.setBounds(235, 232, 50, 55);
            erase2.setIcon(new ImageIcon("src\\Task_10\\Pictures\\erase.png"));
            background.add(erase2);

            JLabel left = new JLabel();
            left.setBounds(19, 159, 145, 90);
            left.setIcon(new ImageIcon("src\\Task_10\\Pictures\\back.png"));
            JTextField leftWright = new JTextField(JTextField.CENTER);
            leftWright.setBounds(19, 159, 146, 90);
            leftWright.setBackground(color);
            leftWright.setFont(new Font("Ninja Naruto", Font.BOLD, 20));
            leftWright.setForeground(Color.BLACK);

            JLabel right = new JLabel();
            right.setBounds(300, 159, 145, 90);
            right.setIcon(new ImageIcon("src\\Task_10\\Pictures\\back.png"));
            JTextField rightWright = new JTextField(JTextField.CENTER);
            rightWright.setBounds(300, 159, 146, 90);
            rightWright.setBackground(color);
            rightWright.setFont(new Font("Ninja Naruto", Font.BOLD, 20));
            rightWright.setForeground(Color.BLACK);

            leftWright.addCaretListener(action -> {
                try{
                    int value1 = Integer.parseInt(leftWright.getText());
                    leftWright.setText(String.valueOf(value1));
                }
                catch (NumberFormatException ex){
                    System.out.println(ex);
                }
            });

            rightWright.addCaretListener(action -> {
                try{
                    int value2 = Integer.parseInt(rightWright.getText());
                    rightWright.setText(String.valueOf(value2));
                }
                catch (NumberFormatException ex){
                    System.out.println(ex);
                }
            });

            plus.addActionListener(action -> {
                try {
                    double first = Double.parseDouble(leftWright.getText());
                    double second = Double.parseDouble(rightWright.getText());
                    double c = first + second;
                    result.setFont(new Font("Ninja Naruto", Font.BOLD, 35));
                    result.setText(String.valueOf(precision.format(c)));
                }
                catch (NumberFormatException ex){
                    result.setFont(new Font("Ninja Naruto", Font.BOLD, 18));
                    result.setText("Error  in  left  or  right!");
                }
            });

            minus.addActionListener(action -> {
                try {
                    double first = Double.parseDouble(leftWright.getText());
                    double second = Double.parseDouble(rightWright.getText());
                    double c = first - second;
                    result.setFont(new Font("Ninja Naruto", Font.BOLD, 35));
                    result.setText(String.valueOf(precision.format(c)));
                }
                catch (NumberFormatException ex){
                    result.setFont(new Font("Ninja Naruto", Font.BOLD, 18));
                    result.setText("Error  in  left  or  right!");
                }
            });

            multi.addActionListener(action -> {
                try {
                    double first = Double.parseDouble(leftWright.getText());
                    double second = Double.parseDouble(rightWright.getText());
                    double c = first * second;
                    result.setFont(new Font("Ninja Naruto", Font.BOLD, 35));
                    result.setText(String.valueOf(precision.format(c)));
                }
                catch (NumberFormatException ex){
                    result.setFont(new Font("Ninja Naruto", Font.BOLD, 18));
                    result.setText("Error  in  left  or  right!");
                }
            });

            division.addActionListener(action -> {
                try {
                    double first = Double.parseDouble(leftWright.getText());
                    double second = Double.parseDouble(rightWright.getText());
                    if(second == 0){
                        result.setFont(new Font("Ninja Naruto", Font.BOLD, 18));
                        result.setText("You've written zero in the right!");
                    }
                    else {
                        result.setFont(new Font("Ninja Naruto", Font.BOLD, 35));
                        double c = first / second;
                        result.setText(String.valueOf(precision.format(c)));
                    }
                }
                catch (NumberFormatException ex){
                    result.setFont(new Font("Ninja Naruto", Font.BOLD, 18));
                    result.setText("Error  in  left  or  right!");
                }
            });

            erase1.addActionListener(action -> {
                result.setFont(new Font("Ninja Naruto", Font.BOLD, 35));
                leftWright.setText("0.0");
            });

            erase2.addActionListener(action -> {
                result.setFont(new Font("Ninja Naruto", Font.BOLD, 35));
                rightWright.setText("0.0");
            });

            background.add(left);
            background.add(leftWright);
            background.add(result);
            background.add(right);
            background.add(rightWright);
        }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_10\Main.java
```java
package Task_10;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Music obj = new Music();
            obj.LoopMusic("src\\Task_10\\Music\\Naruto.wav");//Music plays after 3 sec. Idk. This is original track

            Calculator app = new Calculator();
            app.setVisible(true);
        });
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_10\Music.java
```java
package Task_10;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Music {
    public void LoopMusic(String location){

        try
        {
            File musicPath = new File(location);

            if(musicPath.exists()) {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            }
            else{
                System.out.println("Can't find");
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_11\Main.java
```java
package Task_11;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    static AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            final int localI = i;
            Thread thread = new Thread(() -> work(localI));
            thread.start();
            threads.add(thread);
        }
        for (Thread t : threads){
            t.getState();
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("total time: " + (endTime - startTime));
        System.out.println("total sum: " + count);
    }

    private static void work(int i){
        long startTime = System.currentTimeMillis();
        long result = calc(((int)((i+2)*Math.sqrt((i+5)*10))));
        long endTime = System.currentTimeMillis();
        System.out.println(i + ": " + result + " time: " + (endTime-startTime));
    }

    private static long calc(int i) {
        long result = 0;
        for (int j = 0; j < 1_000_000; j++) {
            count.incrementAndGet();
            result += (long) (Math.sqrt(i * 1000 / Math.PI) * Math.sqrt(i * 1000 / Math.PI) - 1 + Math.log((double) i));
        }
        return result;
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_12\Colours.java
```java
package Task_12;

public class Colours {
    public static final String reset = "\u001B[0m";
    public static final String red = "\u001B[31m";
    public static final String green = "\u001B[32m";
    public static final String yellow = "\u001B[33m";
    public static final String blue = "\u001B[34m";
    public static final String purple = "\u001B[35m";
    public static final String cyan = "\u001B[36m";
    public static final String white = "\u001B[37m";

    public void print(String line, String colour){
        switch(colour){
            case ("red"):
                System.out.println(red + line + reset);
                break;
            case ("green"):
                System.out.println(green + line + reset);
                break;
            case ("yellow"):
                System.out.println(yellow + line + reset);
                break;
            case ("blue"):
                System.out.println(blue + line + reset);
                break;
            case ("purple"):
                System.out.println(purple + line + reset);
                break;
            case ("cyan"):
                System.out.println(cyan + line + reset);
                break;
            case ("white"):
                System.out.println(white + line + reset);
                break;
        }
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_12\Main.java
```java
package Task_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Colours obj = new Colours();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String colour = scanner.nextLine();
        obj.print(line, colour);
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_13\Car.java
```java
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
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_13\FutureModelException.java
```java
package Task_13;

public class FutureModelException extends RuntimeException{
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_13\Main.java
```java
package Task_13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car model = new Car(2018, 2017, "SoftlyCar");

        try {
            int weight = Integer.parseInt(new Scanner(System.in).nextLine());
            model.setYear(3506);
            model.setWeight(1950);
        }
        catch (FutureModelException ex){
            System.out.println("Wow, you are from future, aren't you?!");
        }
        catch (WeightException ex){
            System.out.println("Our lines cannot work with models of this weights, sowwy");
        }
        finally {
            System.out.println("Nice car!");
        }

        throw new RuntimeException();
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_13\WeightException.java
```java
package Task_13;

public class WeightException extends RuntimeException{
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_14\Main.java
```java
package Task_14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //Data entry
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        Map<String, String> rules = new HashMap<>();
        for (int i = 0; i < N; i++) {
            rules.put(scanner.next(), scanner.next());
        }
        String string = scanner.next();

        //Regex method
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < rules.size(); i++) {
            stringBuilder.append(rules.keySet().toArray()[i]);
            if(i != rules.size()-1){
                stringBuilder.append("|");
            }
        }
        Pattern pattern = Pattern.compile(stringBuilder.toString());
        Matcher matcher = pattern.matcher(string);

        //Non-regex method
        String nonregex = string;
        int length = nonregex.length();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < rules.size(); j++) {
                String temp = (String)rules.keySet().toArray()[j];
                String rule = (String)rules.values().toArray()[j];
                if (i + temp.length() < nonregex.length() && nonregex.substring(i, i + temp.length()).equals(temp)) {
                    nonregex = nonregex.replace(temp, rule + " ");
                    i += rule.length();
                    break;
                }
            }
        }
        nonregex = nonregex.replaceAll(" ", "");

        //Data output
        System.out.println(matcher.replaceAll(x -> rules.get(x.group())));
        System.out.println(nonregex);
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_15_16\List.java
```java
package Task_15_16;

public class List {
    private Node S1 = new Node();
    private Node S2 = new Node();
    private Node S3 = new Node();
    private Node S4 = new Node();
    private Node S5 = new Node();
    private Node current = S1;

    public List() {
        S1.make(0, "create_project", S2);
        S1.make(1, "add_library", S5);
        S2.make(0, "test", S3);
        S2.make(1, "drop_db", S4);
        S3.make(0, "drop_db", S4);
        S3.make(1, "add_library", S5);
        S4.make(0, "restart", S3);
        S4.make(1, "deploy", S5);
        S5.make(0, "deploy", S1);
        S5.make(1, "restart", S3);
    }

    public void execution(int link) {
        for (int i = 0; i < current.getLink().size(); i++) {
            if (current.getLink().get(i) == link) {
                System.out.println(current.getMessage().get(link));
                current = current.getState().get(link);
                break;
            }
        }
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_15_16\Main.java
```java
package Task_15_16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List list = new List();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0;; i++) {
            int link = scanner.nextInt();
            if (link == -1) {
                break;
            }
            list.execution(link);
        }
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_15_16\Node.java
```java
package Task_15_16;

import java.util.ArrayList;

public class Node {
    private ArrayList<Integer> links = new ArrayList<>();
    private ArrayList<String> messages = new ArrayList<>();
    private ArrayList<Node> states = new ArrayList<>();

    public void make(int link, String message, Node state){
        links.add(link);
        messages.add(message);
        states.add(state);
    }

    public ArrayList<Integer> getLink() {
        return links;
    }

    public ArrayList<String> getMessage() {
        return messages;
    }

    public ArrayList<Node> getState() {
        return states;
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_17_18\Main.java
```java
package Task_17_18;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        try(Stream<Path> walk = Files.walk(Paths.get("C:\\Users\\roger\\IdeaProjects\\Java_MIREA_true\\src"))){
            List<String> result = walk
                    .filter(Files::isRegularFile)
                    .map(x -> x.toString())
                    .collect(Collectors.toList());
            PrintWriter writer = new PrintWriter("result.md");
            for (int i = 0; i < result.size(); i++) {
                if(result.get(i).endsWith(".java")){
                    Scanner sc = new Scanner(System.in);
                    try(BufferedReader reader = new BufferedReader(new FileReader(result.get(i)))){
                        writer.append("#### " + result.get(i) + "\n" + "```java" + "\n");
                        String line = reader.readLine();
                        while(line != null){
                            writer.append(line + "\n");
                            line = reader.readLine();
                        }
                        writer.append("```\n");
                    } catch (FileNotFoundException e){
                        e.printStackTrace();
                    } catch (IOException e){
                        e.printStackTrace();
                    }
                }
                result.forEach(System.out::println);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_2\Ball.java
```java
package Task_2;

public class Ball {
    private String name;
    private int height, width, square;
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_2\Book.java
```java
package Task_2;

public class Book {
    private String name;
    private int height, width, square;
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_2\Dog.java
```java
package Task_2;

public class Dog {
    private String name;
    private int age;
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int AgeHuman() {
        return age * 7;
    }
    public String toString(){
        return getName() + " " + getAge();
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_2\Main.java
```java
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
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_2\Shape.java
```java
package Task_2;

public class Shape {
    private String name;
    private int height, width, square;
    public String toString(){
        return name + " " + height + " " + width + " " + square;
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_3\FirstTask\Circle.java
```java
package Task_3.FirstTask;

public class Circle {
    private int radius, length, area;

    public void setRadius(int radius) {
        this.radius = radius;
        setLength(getRadius());
        setArea(getRadius());
    }

    public int getRadius() {

        return radius;
    }

    public void setLength(int radius) {

        this.length = (int) (2 * Math.PI * radius);
    }

    public int getLength() {

        return length;
    }

    public void setArea(int radius) {
        this.area = (int) (Math.PI * Math.pow(radius, 2));
    }

    public int getArea() {
        return area;
    }

    public String ToString(){
        return getRadius() + " " + getLength() + " " + getArea();
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_3\FirstTask\CircleTest.java
```java
package Task_3.FirstTask;

public class CircleTest {
    public static void main(String[] args) {
        // Tester for Circle.java
        Circle obj_1 = new Circle();
        obj_1.setRadius(15);
        // Programme gets radius and return on the screen radius, length of circle and its area(square)
        System.out.println(obj_1.ToString());
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_3\SecondTask\Hand.java
```java
package Task_3.SecondTask;

public class Hand {
    private String nails_color;
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setNails_color(String nails_color) {
        this.nails_color = nails_color;
    }

    public String getNails_color() {
        return nails_color;
    }

    public String Nails(){
        return getNails_color();
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_3\SecondTask\Head.java
```java
package Task_3.SecondTask;

public class Head{
    private String eye_color;
    private boolean one_eye;

    public boolean isOne_eye() {
        return one_eye;
    }

    public void setOne_eye(boolean one_eye) {
        this.one_eye = one_eye;
    }

    public void setEye_color(String eye_color) {
        this.eye_color = eye_color;
    }

    public String getEye_color() {
        return eye_color;
    }

    public String toMain(){
        return getEye_color();
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_3\SecondTask\Human.java
```java
package Task_3.SecondTask;

public class Human {
    private int age;
    private String name;
    Hand obj_l_hand = new Hand();
    Hand obj_r_hand = new Hand();
    Head obj_head = new Head();
    Leg obj_l_leg = new Leg();
    Leg obj_r_leg = new Leg();

    public Human(int age, String name, String eye_color, String nails_color, String tattoo, boolean True) {
        this.age = age;
        this.name = name;
        obj_l_hand.setNails_color(nails_color);
        obj_r_hand.setNails_color(nails_color);
        obj_head.setEye_color(eye_color);
        obj_r_leg.setTattoo(tattoo);
    }

    public void setLength_R_Hand(int length){
        obj_r_hand.setLength(length);
    }

    public void setLength_L_Hand(int length){
        obj_l_hand.setLength(length);
    }
    public void setLength_R_Leg(int length){
        obj_r_leg.setLength(length);
    }
    public void setLength_L_Leg(int length){
        obj_l_leg.setLength(length);
    }

    public void setNails_color(String nails_color){
        obj_l_hand.setNails_color(nails_color);
        obj_r_hand.setNails_color(nails_color);
    }

    public void setEye_color(String eye_color){
        obj_head.setEye_color(eye_color);
    }

    public void setTattoo(String tattoo){
        obj_r_leg.setTattoo(tattoo);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setEye(boolean one_eye){
        obj_head.setOne_eye(one_eye);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return getAge() + " " + getName() + " " + obj_head.toMain() + " " + obj_l_hand.Nails() + " " + obj_r_leg.Tattoo()
                + " " + (obj_head.isOne_eye() == true ? "One_eye" : "Two_eyes");
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_3\SecondTask\HumanTest.java
```java
package Task_3.SecondTask;

public class HumanTest {
    public static void main(String args[]){
        Human obj = new Human(15, "John", "green", "red", "Dragon", false);
        obj.setEye_color("brown");
        obj.setLength_L_Hand(12);
        obj.setLength_R_Leg(24);
        obj.setLength_R_Hand(10);
        obj.setLength_L_Leg(23);
        obj.setEye(true);
        System.out.println(obj.toString());
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_3\SecondTask\Leg.java
```java
package Task_3.SecondTask;

public class Leg {
    private String tattoo;
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setTattoo(String tattoo) {
        this.tattoo = tattoo;
    }

    public String getTattoo() {
        return tattoo;
    }

    public String Tattoo(){
        return getTattoo();
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_3\ThirdTask\Book.java
```java
package Task_3.ThirdTask;

public class Book {
    private String author, title, genre;
    private int year;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String ToString(){
        return "\"" + getTitle() + "\"" + " by " + getAuthor() + " was written in " + getYear() + " in genre: " +
                getGenre();
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_3\ThirdTask\BookTest.java
```java
package Task_3.ThirdTask;

public class BookTest {
    public static void main(String args[]){
        Book obj = new Book();
        obj.setAuthor("Stephen King");
        obj.setTitle("Carrie");
        obj.setGenre("novel");
        obj.setYear(1974);
        System.out.println(obj.ToString());

        obj.setAuthor("Jules Verne");
        obj.setTitle("Around the World in Eighty Days");
        obj.setGenre("adventure novel");
        obj.setYear(1873);
        System.out.println(obj.ToString());
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_4\Circle.java
```java
package Task_4;

public class Circle extends Shape{
    protected double radius;

    protected Circle(){}

    protected Circle(double radius){

    }
    protected Circle(double radius, String color, boolean filled){
        setRadius(radius);
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*Math.pow(getRadius(), 2);
    }

    public double getPerimeter(){
        return 2*Math.PI*getRadius();
    }

    @Override
    public String toString() {
        return "Circle: \nRadius: " + getRadius() + "\n" +
                "Perimeter: " + getPerimeter() + "\nArea: " +
                getArea() + "\nColor and its status: " +
                (isFilled()==true ? "filled" : "not filled") + " with " + getColor();
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_4\Rectangle.java
```java
package Task_4;

public class Rectangle extends Shape{
    protected double width, length;
    public Rectangle(){}
    public Rectangle(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, String color, boolean filled){
        this.width = width;
        this.color = color;
        this.filled = filled;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
    public double getArea(){
        return getLength()*getWidth();
    }
    public double getPerimeter(){
        return 2*(getWidth()+getLength());
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    @Override
    public String toString() {
        return "Rectangle:\nwidth and length: " + getWidth() +
                " " + getLength() + "\nPerimeter and area: " +
                getPerimeter() + " " + getArea() + "\nColor and status: " +
                (isFilled()==true ? "filled" : "not filled") + " with " + getColor();
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_4\Shape.java
```java
package Task_4;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    protected Shape() { }

    protected Shape(String color, boolean filled){
        setColor(color);
        setFilled(filled);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();

    abstract double getPerimeter();

    public abstract String toString();
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_4\Square.java
```java
package Task_4;

public class Square extends Shape{
    protected double side;

    protected Square(){}
    protected Square(double side){
        this.side = side;
    }
    protected Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }
    public double getArea(){
        return getSide()*getSide();
    }
    public double getPerimeter(){
        return getSide()*4;
    }

    public void setSide(double side){
        this.side = side;
    }

    public double getSide(){
        return side;
    }

    @Override
    public String toString() {
        return "Square:\nside: " + getSide() + "\nPerimeter and Area: " +
                getPerimeter() + " " + getArea() + "\nColor and its status: " +
                (isFilled()==true ? "filled" : "not filled") + " with " + getColor();
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_4\TestCircle.java
```java
package Task_4;

public class TestCircle {
    public static void main(String args[]){
        Circle test = new Circle(10, "red", true);
        System.out.println(test.toString());
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_4\TestRectangle.java
```java
package Task_4;

public class TestRectangle {
    public static void main(String args[]){
        Rectangle test = new Rectangle(15, 10, "green", true);
        System.out.println(test.toString());
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_4\TestSquare.java
```java
package Task_4;

public class TestSquare {
    public static void main(String args[]){
        Shape test = new Square(20, "indigo", false);
        System.out.println(test.toString());
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_5\Circle.java
```java
package Task_5;

public class Circle extends Shape{
    protected double radius;

    protected Circle(){}

    protected Circle(double radius){

    }
    protected Circle(double radius, String color, boolean filled){
        setRadius(radius);
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*Math.pow(getRadius(), 2);
    }

    public double getPerimeter(){
        return 2*Math.PI*getRadius();
    }

    @Override
    public String toString() {
        return "Circle: \nRadius: " + getRadius() + "\n" +
                "Perimeter: " + getPerimeter() + "\nArea: " +
                getArea() + "\nColor and its status: " +
                (isFilled()==true ? "filled" : "not filled") + " with " + getColor();
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_5\Movable.java
```java
package Task_5;

interface Movable {
    public void moveUpRight(double x, double y);
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_5\MovableCircle.java
```java
package Task_5;

public class MovableCircle extends Circle implements Movable{
    private MovablePoint center;

    public MovableCircle(double radius, double x, double y) {
        setRadius(radius);
        this.center = new MovablePoint(x, y);
    }

    public void changeCenter(double x, double y){
        center.setX(x);
        center.setY(y);
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                center.toString() +
                ", radius=" + radius +
                '}';
    }

    @Override
    public void moveUpRight(double x, double y) {
        center.moveUpRight(x, y);
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_5\MovablePoint.java
```java
package Task_5;

public class MovablePoint implements Movable{
    private double x, y;

    public MovablePoint(double x, double y) {
        setX(x);
        setY(y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y){
        setX(x);
        setY(y);
    }

    @Override
    public void moveUpRight(double x, double y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public String toString() {
        return "x=" + x +
                ", y=" + y +
                '}';
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_5\MovableRectangle.java
```java
package Task_5;

public class MovableRectangle implements Movable {
    private double width, height;
    private MovablePoint upleft;
    private MovablePoint downrigth;

    MovableRectangle(double width, double height, double x, double y){
        setWidth(width);
        setHeight(height);
        this.upleft = new MovablePoint(x, y);
        this.downrigth = new MovablePoint(x+width, y-height);
    }

    public void newRectangle(double width, double height, double x, double y){
        upleft.setXY(x, y);
        downrigth.setXY(x+width, y-height);
    }

    public void setNewCoordinates(double x, double y){
        upleft.setXY(x, y);
        downrigth.setXY(x+getWidth(), y-getHeight());
    }

    public void setWidthCoor(double width){
        downrigth.setX(downrigth.getX()-getWidth()+width);
        setWidth(width);
    }

    public void setHeightCoor(double height){
        downrigth.setY(downrigth.getY() + getHeight() - height);
        setHeight(height);
    }

    public void setHWCoor(double width, double height){
        downrigth.setX(downrigth.getX()-getWidth()+width);
        downrigth.setY(downrigth.getY() + getHeight() - height);
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void moveUpRight(double x, double y) {
        upleft.moveUpRight(x, y);
        downrigth.moveUpRight(x, y);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "width=" + width +
                ", height=" + height +
                ", Up and Left coordinates: " +
                upleft.toString() + ", Down and Right coordinates: " +
                downrigth.toString();
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_5\Rectangle.java
```java
package Task_5;

public class Rectangle extends Shape{
    protected double width, length;
    public Rectangle(){}
    public Rectangle(String color, boolean filled){
        setColor(color);
        setFilled(filled);
    }
    Rectangle(double width, double length){
        setWidth(width);
        setLength(length);
    }
    public Rectangle(double width, String color, boolean filled){
        setWidth(width);
        setColor(color);
        setFilled(filled);
    }
    public Rectangle(double width, double length, String color, boolean filled){
        setWidth(width);
        setLength(length);
        setColor(color);
        setFilled(filled);
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
    public double getArea(){
        return getLength()*getWidth();
    }
    public double getPerimeter(){
        return 2*(getWidth()+getLength());
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    @Override
    public String toString() {
        return "Rectangle:\nwidth and length: " + getWidth() +
                " " + getLength() + "\nPerimeter and area: " +
                getPerimeter() + " " + getArea() + "\nColor and status: " +
                (isFilled()==true ? "filled" : "not filled") + " with " + getColor();
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_5\Shape.java
```java
package Task_5;

abstract class Shape {
    protected String color;
    protected boolean filled;

    protected Shape() { }

    protected Shape(String color, boolean filled){
        setColor(color);
        setFilled(filled);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();

    abstract double getPerimeter();

    public abstract String toString();
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_5\Square.java
```java
package Task_5;

public class Square extends Shape{
    protected double side;

    protected Square(){}
    protected Square(double side){
        this.side = side;
    }
    protected Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }
    public double getArea(){
        return getSide()*getSide();
    }
    public double getPerimeter(){
        return getSide()*4;
    }

    public void setSide(double side){
        this.side = side;
    }

    public double getSide(){
        return side;
    }

    @Override
    public String toString() {
        return "Square:\nside: " + getSide() + "\nPerimeter and Area: " +
                getPerimeter() + " " + getArea() + "\nColor and its status: " +
                (isFilled()==true ? "filled" : "not filled") + " with " + getColor();
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_5\TestCircle.java
```java
package Task_5;

public class TestCircle {
    public static void main(String args[]){
//        Circle test = new Circle(10, "red", true);
//        System.out.println(test.toString());

        MovableCircle test = new MovableCircle(10.0, 5.0, 2.0);
        System.out.println(test.toString());
        test.moveUpRight(2.0, -6.5);
        System.out.println(test.toString());
        test.moveUpRight(10.0, -8.0);
        System.out.println(test.toString());
        test.moveUpRight(-12.5, 12.5);
        System.out.println(test.toString());
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_5\TestRectangle.java
```java
package Task_5;

public class TestRectangle {
    public static void main(String args[]){
//        Rectangle test = new Rectangle(15, 10, "green", true);
//        System.out.println(test.toString());

        MovableRectangle test = new MovableRectangle(6.0, 3.0, 1.0, 6.0);
        System.out.println(test.toString());
        test.moveUpRight(3.0, -5.0);
        System.out.println(test.toString());
        test.setWidthCoor(3.0);
        test.setHeightCoor(2.0);
        System.out.println(test.toString());
        test.setHWCoor(6.0, 3.0);
        System.out.println(test.toString());
        test.setNewCoordinates(3.0, 8.0);
        System.out.println(test.toString());
        test.newRectangle(3.0, 7.0, 3.0, 8.0);
        System.out.println(test.toString());
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_5\TestSquare.java
```java
package Task_5;

public class TestSquare {
    public static void main(String args[]){
        Square test = new Square(20, "indigo", false);
        System.out.println(test.toString());
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_6\main.java
```java
package Task_6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] massive = new int[N][N];
        for(int i=0; i<N; i++){
            for(int j=0;j<N;j++){
                massive[i][j] = scanner.nextInt();
            }
        }
        for (int i=0;i<N;i++){
            for (int j=0; j<N;j++){
                if(i>0&&j>0){
                    massive[i][j]+=Math.max(massive[i-1][j],massive[i][j-1]);
                }
                else {
                    if (i>0){
                        massive[i][j]+=massive[i-1][j];
                    }
                    else if(j>0){
                        massive [i][j]+=massive[i][j-1];
                    }
                }

            }
        }
        System.out.print(massive[N-1][N-1]);

//        int max = 0;
//        int k=0;
//        int max_x = 0, max_y = 0;
//        for (int i=0; i<N; i++){
//            for(int j=0;j<N;j++){
//                if(k==1){
//                    j--;
//                    k=0;
//                }
//                max_x = massive[i][j];
//                max_y = massive[i][j];
//                max += massive[i][j];
//                for(int y=i;y<N;y++){
//                    for(int x=j;x<j+1;x++){
//                        if(massive[x][y]>max_y){
//                            max_y = massive[x][y];
//                        }
//                    }
//                }
//                for(int y=i;y<i+1;y++){
//                    for(int x=j;x<N;x++){
//                        if(massive[x][y]>max_x){
//                            max_x = massive[x][y];
//                        }
//                    }
//                }
//                System.out.println(i + " " + j);
//                System.out.println(max_x + " " + max_y);
//                if(max_y>=max_x){
//                    k=1;
//                    i+=1;
//                }
//            }
//        }
//        System.out.println(max);
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_7_8\Company.java
```java
package Task_7_8;

import java.util.*;

public class Company {
    private double income = 0;
    private List<Employee> employees = new ArrayList<>();
    private List<Double> incomes = new ArrayList<>();

    public List<Employee> getLowestSalaryStaff(int count){
        if (count<1){
            return null;
        }
        List<Employee> LowestSalaryStaff = new ArrayList<>(count);
        Collections.sort(employees, Comparator.comparingDouble(Employee::getBaseSalary));
        for(int i=0;i<count;i++){
            LowestSalaryStaff.add(employees.get(i));
        }
        return LowestSalaryStaff;
    }

    public List<Employee> getTopSalaryStaff(int count){
        if (count<1){
            return null;
        }
        List<Employee> TopSalaryStaff = new ArrayList<>(count);
        Collections.sort(employees, Comparator.comparingDouble(Employee::getBaseSalary));
        Collections.reverse(employees);
        for(int i=0;i<count;i++){
            TopSalaryStaff.add(employees.get(i));
        }
        return TopSalaryStaff;
    }

    public void sumIncome(double plus){
        this.income += plus;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Double> getIncomes() {
        return incomes;
    }

    public void setIncomes(List<Double> incomes) {
        this.incomes = incomes;
    }

    public void hire(Employee employee){
        employees.add(employee);
        if (employee.getPosition()=="Top-manager" && getIncome()>10000000.0){
            employee.setBaseSalary(employee.getBaseSalary()*2.5);
        }
        if (employee.getPosition()=="Manager"){
            double temp = employee.getBaseSalary();
            employee.setBaseSalary(employee.getBaseSalary());
            sumIncome((employee.getBaseSalary() - temp) * 20);
            incomes.add((employee.getBaseSalary() - temp) * 20);
        }
        else{
            incomes.add(0.0);
        }
    }

    public void hireAll(List<Employee> employeesToHire){
        for(Employee employee: employeesToHire){
            employees.add(employee);
        }
    }

    public void fire(int number){
        sumIncome(-incomes.get(number));
        incomes.remove(number);
        if(income<10000000.0){
            for (Employee employee : employees) {
                if (employee.getPosition() == "Top-manager" && employee.getBaseSalary() > 100000.0) {
                    employee.setBaseSalary(employee.getBaseSalary() / 2.5);
                }
            }
        }
        employees.remove(number);
    }

    public double getIncome(){
        return income;
    }

    public void setPosition(int number, String position, double baseSalary){
        income -= incomes.get(number);
        String name = employees.get(number).getFirst_name();
        String secondName = employees.get(number).getSecond_name();
        employees.remove(number);
        employees.add(number, new Employee(name, secondName, baseSalary, (position=="Top-manager" ?
            new TopManager() : position=="Manager" ? new Manager() : new Operator())));
        if (employees.get(number).getPosition()=="Top-manager" && getIncome()>10000000.0){
                employees.get(number).setBaseSalary(employees.get(number).getBaseSalary()*2.5);
        }
        if (employees.get(number).getPosition()=="Manager"){
            double temp = employees.get(number).getBaseSalary();
            employees.get(number).setBaseSalary(employees.get(number).getBaseSalary());
            sumIncome((employees.get(number).getBaseSalary() - temp) * 20);
            incomes.add((employees.get(number).getBaseSalary() - temp) * 20);
        }
        else{
            incomes.add(number, 0.0);
        }
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_7_8\Employee.java
```java
package Task_7_8;

public class Employee{
    private String first_name, second_name;
    private double baseSalary;
    private EmployeePosition position;

    public void setNewEmployee(String first_name, String second_name, double baseSalary, EmployeePosition position){
        this.first_name = first_name;
        this.second_name = second_name;
        this.baseSalary = baseSalary;
        this.position = position;
    }

    public Employee(String first_name, String second_name, double baseSalary, EmployeePosition position) {
        this.first_name = first_name;
        this.second_name = second_name;
        this.baseSalary = baseSalary;
        this.position = position;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = position.calcSalary(baseSalary);
    }

    public String getPosition() {
        return position.GetJobTitle();
    }

    public void setPosition(EmployeePosition position) {
        this.position = position;
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_7_8\EmployeePosition.java
```java
package Task_7_8;

public interface EmployeePosition {
    String GetJobTitle();
    double calcSalary(double baseSalary);
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_7_8\main.java
```java
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

```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_7_8\Manager.java
```java
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
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_7_8\Operator.java
```java
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
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_7_8\TopManager.java
```java
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
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_9\AdditionalClass.java
```java
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
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_9\Company.java
```java
package Task_9;

import java.util.ArrayList;

public class Company {
    private ArrayList<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    void HireEmployee(Employee employee){
        employees.add(employee);
    }

    void FireEmployee(int index){
        employees.remove(index);
    }


    public void doSomething(EmployeeSelector selector, HandleEmployee handle){
        int count = 0;
        for(Employee employee : employees){
            if(selector.isNeed(employee)){
                handle.handleEmployee(employee, count);
            }
            count++;
        }
        System.out.println(count);
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_9\Employee.java
```java
package Task_9;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Employee {
    private final String name, city, number;
    private String surname;
    private final LocalDate date;
    private final double salary;

    public Employee(String name, String surname, String city, String number, LocalDate date, double salary) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.number = number;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.date = date;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCity() {
        return city;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumber() {
        return number;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", number='" + number + '\'' +
                ", surname='" + surname + '\'' +
                ", date=" + date +
                ", salary=" + salary +
                '}';
    }
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_9\EmployeeSelector.java
```java
package Task_9;

public interface EmployeeSelector {
    boolean isNeed(Employee employee);
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_9\HandleEmployee.java
```java
package Task_9;

public interface HandleEmployee {
    void handleEmployee(Employee employee, int index);
}
```
#### C:\Users\roger\IdeaProjects\Java_MIREA_true\src\Task_9\main.java
```java
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
   