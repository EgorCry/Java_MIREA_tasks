package Task_5;

public class TestRectangle {
    public static void main(String args[]){
//        Rectangle test = new Rectangle(15, 10, "green", true);
//        System.out.println(test.toString());

        MovableRectangle test = new MovableRectangle(6.0, 3.0, 1.0, 6.0);
        System.out.println(test.toString());
        test.moveUpRight(3.0, -5.0);
        System.out.println(test.toString());
        test.setWidthCoor(3.0);
        test.setHeightCoor(2.0);
        System.out.println(test.toString());
        test.setHWCoor(6.0, 3.0);
        System.out.println(test.toString());
        test.setNewCoordinates(3.0, 8.0);
        System.out.println(test.toString());
        test.newRectangle(3.0, 7.0, 3.0, 8.0);
        System.out.println(test.toString());
    }
}
