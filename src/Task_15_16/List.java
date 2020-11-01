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
