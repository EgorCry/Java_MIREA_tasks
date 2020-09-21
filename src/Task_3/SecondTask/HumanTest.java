package Task_3.SecondTask;

public class HumanTest {
    public static void main(String args[]){
        Human obj = new Human(15, "John", "green", "red", "Dragon", false);
        obj.setEye_color("brown");
        obj.setLength_L_Hand(12);
        obj.setLength_R_Leg(24);
        obj.setLength_R_Hand(10);
        obj.setLength_L_Leg(23);
        obj.setEye(true);
        System.out.println(obj.toString());
    }
}
