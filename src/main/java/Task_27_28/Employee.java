package Task_27_28;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class Employee {
    @Backbone(name = "sum")
    public void sum(Data data){
        int sum = 0;
        for (Integer i:
                data.getValues()) {
            sum+=i;
        }
        System.out.println("The summary is " + sum);
    }

    @Backbone(name = "print")
    public void print(Data data){
        System.out.println("Welcome to a new year at Hogwarts! Before we begin our banquet, I would like to say a few words. And here they are:\n");
        boolean flag = true;
        String words = "";
        for (String i:
                data.getWords()) {
                if(!flag){
                    words += data.getSign() + i;
                }
                else{
                    words += i;
                    flag = false;
                }
        }
        System.out.println(words);
    }

    public static String getTasks() throws IOException, InterruptedException {
        List<ReflectionOfTask> list;
        HttpRequest httpRequest = HttpRequest.newBuilder().GET().uri(URI.create("http://gitlessons2020.rtuitlab.ru:3000/reflectionTasks")).build();
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> httpResponse = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        return httpResponse.body();
    }
}
