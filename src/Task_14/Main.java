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

        //Non-regex method
        String nonregex = string;
        for (int i = 0; i < nonregex.length(); i++) {
            for (int j = 0; j < rules.size(); j++) {
                String temp = (String)rules.keySet().toArray()[j];
                String rule = (String) rules.values().toArray()[j];
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
