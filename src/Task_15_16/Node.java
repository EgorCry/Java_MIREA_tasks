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
