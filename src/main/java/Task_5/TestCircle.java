package Task_5;

public class TestCircle {
    public static void main(String args[]){
//        Circle test = new Circle(10, "red", true);
//        System.out.println(test.toString());

        MovableCircle test = new MovableCircle(10.0, 5.0, 2.0);
        System.out.println(test.toString());
        test.moveUpRight(2.0, -6.5);
        System.out.println(test.toString());
        test.moveUpRight(10.0, -8.0);
        System.out.println(test.toString());
        test.moveUpRight(-12.5, 12.5);
        System.out.println(test.toString());
    }
}
