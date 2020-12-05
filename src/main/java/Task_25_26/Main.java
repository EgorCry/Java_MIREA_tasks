package Task_25_26;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.add(1, "I");
        hashMap.add(2, "am");
        hashMap.add(3, "Batman");
        hashMap.add(4, "I");
        hashMap.add(5, "am");
        hashMap.add(6, "vengeance");
        System.out.println("Get key 1: value=" + hashMap.get(1));
        System.out.println("Get key 2: value=" + hashMap.get(2));
        System.out.println("Get key 3: value=" + hashMap.get(3));
        System.out.println("Remove key 6: value=" + hashMap.remove(6));
        hashMap.add(6, "psychopath");
        System.out.println("Get key 6: value=" + hashMap.get(6));
        for (String V : hashMap) {
            System.out.println(V);
        }
    }
}
