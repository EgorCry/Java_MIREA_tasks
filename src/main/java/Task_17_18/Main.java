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
