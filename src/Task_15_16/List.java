package Task_15_16;

public class List {
    private Node head;
    private Node tail;

    public boolean isEmpty(){
        return head == null;
    }

    public void add(int data){
        switch (data){
            case(1):{
                Node temp = new Node("create_project");
                if(head==null){
                    head = tail = temp;
                    head.prev = null;
                    tail.next = null;
                }
                else{
                    tail.next = temp;
                    temp.prev = tail;
                    tail = temp;
                    tail.next = null;
                }
                break;
            }
            case(2):{
                Node temp = new Node("add_library");
                if(head==null){
                    head = tail = temp;
                    head.prev = null;
                    tail.next = null;
                }
                else{
                    tail.next = temp;
                    temp.prev = tail;
                    tail = temp;
                    tail.next = null;
                }
                break;
            }
            case(3):{
                Node temp = new Node("restart");
                if(head==null){
                    head = tail = temp;
                    head.prev = null;
                    tail.next = null;
                }
                else{
                    tail.next = temp;
                    temp.prev = tail;
                    tail = temp;
                    tail.next = null;
                }
                break;
            }
            case(4):{
                Node temp = new Node("test");
                if(head==null){
                    head = tail = temp;
                    head.prev = null;
                    tail.next = null;
                }
                else{
                    tail.next = temp;
                    temp.prev = tail;
                    tail = temp;
                    tail.next = null;
                }
                break;
            }
            case(5):{
                Node temp = new Node("deploy");
                if(head==null){
                    head = tail = temp;
                    head.prev = null;
                    tail.next = null;
                }
                else{
                    tail.next = temp;
                    temp.prev = tail;
                    tail = temp;
                    tail.next = null;
                }
                break;
            }
            case(6):{
                Node temp = new Node("drop_db");
                if(head==null){
                    head = tail = temp;
                    head.prev = null;
                    tail.next = null;
                }
                else{
                    tail.next = temp;
                    temp.prev = tail;
                    tail = temp;
                    tail.next = null;
                }
                break;
            }
        }
    }


    public void print(){
        Node current = head;
        if(head == null){
            return;
        }
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
