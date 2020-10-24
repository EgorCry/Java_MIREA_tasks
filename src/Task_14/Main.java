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
        int N = scanner.nextInt();
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

        //Data output
        System.out.println(matcher.replaceAll(x -> rules.get(x.group())));
    }
}
