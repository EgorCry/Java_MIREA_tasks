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
//        String nonregex = string;
//        String temp = "";
//        String check = "";
//        int r = 0;
//        for (int i = 0; i < nonregex.length(); i++) {
//            check += nonregex.charAt(i);
//            for (int j = 0; j < rules.size(); j++) {
//                String test = (String)rules.keySet().toArray()[j];
//                if(test.length() <= nonregex.length()-check.length()) {
//                    r = i;
//                    for (int k = 0; k < test.length(); k++) {
//                        temp += nonregex.charAt(r);
//                        r += 1;
//                    }
//                    if(temp.equals(test)){
//                        String change = check;
//                        change += rules.get(j);
//                        for (int k = i; k < nonregex.length(); k++) {
//                            change += nonregex.charAt(k);
//                        }
//                        nonregex = change;
//                        if(i+rules.get(j).length()<nonregex.length()) {
//                            i += rules.get(j).length();
//                        }
//                        break;
//                    }
//                    temp = "";
//                }
//                else continue;
//            }
//        }

        //Data output
        System.out.println(matcher.replaceAll(x -> rules.get(x.group())));
//        System.out.println(nonregex);
    }
}
