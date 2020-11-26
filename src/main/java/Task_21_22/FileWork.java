package Task_21_22;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class FileWork implements ItemStore{
    Gson gson = new Gson();
    JsonArray jsonArray = new JsonArray();
    String path = "C:\\Users\\roger\\IdeaProjects\\Java_MIREA_true\\src\\main\\java\\Task_21_22\\data.json";
    File file = new File(path);

    @Override
    public List<Item> getAll() {
        Type listType = new TypeToken<ArrayList<Item>>(){}.getType();
        List<Item> list = new ArrayList<>();
        try(FileReader reader = new FileReader(file)) {
            list = new Gson().fromJson(reader, listType);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Item get(int id) {
        List<Item> list = getAll();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId()==id){
                return list.get(i);
            }
        }
        System.out.println("Nothing has been found!");
        return null;
    }

    @Override
    public Item addItem(Item item) throws IOException {
        List<Item> list = getAll();
        if(list.size()==0){
            list = new ArrayList<>();
        }
        for (Item var:
             list) {
            if(var.getId()==item.getId()) {
                System.out.println("Id's cannot be the same");
                return null;
            }
        }
        list.add(item);
        Rewrite(list);
        return null;
    }

    @Override
    public Item editItem(Item item) throws IOException {
        List<Item> list = getAll();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId()==item.getId()){
                list.remove(i);
            }
        }
        List<Item> temp = list;
        list = new ArrayList<>();
        boolean flag = true;
        for (int i = 0; i < temp.size(); i++) {
            if(flag && item.getId()<i+2 && item.getId()>i || item.getId()==temp.size()){
                list.add(item);
                flag = false;
            }
            list.add(temp.get(i));
        }
        temp = new ArrayList<>();
        Rewrite(list);
        return null;
    }

    @Override
    public void deleteItem(Item item) throws IOException {
        List<Item> list = getAll();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId()==item.getId()){
                list.remove(i);
            }
        }
        Rewrite(list);
    }

    public void Rewrite(List<Item> list) throws  IOException{
        FileWriter fileWriter = new FileWriter(path);
        fileWriter.write("[\n");
        for (int i = 0; i < list.size(); i++) {
            fileWriter.write("\t{\n\t\t\"id\": " + "\"" + list.get(i).getId() + "\"," + "\n\t\t\"data\": " + "\""
                    + list.get(i).getData()
            + "\"," + "\n\t\t\"isGood\": " + "\"" + list.get(i).isGood() +  "\"," + "\n\t\t\"description\": " +
                    "\"" +list.get(i).getDescription() + "\"" + "\n\t}");
            if(i!=list.size()-1){
                fileWriter.write(",\n");
            }
        }
        fileWriter.write("\n]");
        fileWriter.close();
    }
}
