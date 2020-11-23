package Task_3.SecondTask;

public class Human {
    private int age;
    private String name;
    Hand obj_l_hand = new Hand();
    Hand obj_r_hand = new Hand();
    Head obj_head = new Head();
    Leg obj_l_leg = new Leg();
    Leg obj_r_leg = new Leg();

    public Human(int age, String name, String eye_color, String nails_color, String tattoo, boolean True) {
        this.age = age;
        this.name = name;
        obj_l_hand.setNails_color(nails_color);
        obj_r_hand.setNails_color(nails_color);
        obj_head.setEye_color(eye_color);
        obj_r_leg.setTattoo(tattoo);
    }

    public void setLength_R_Hand(int length){
        obj_r_hand.setLength(length);
    }

    public void setLength_L_Hand(int length){
        obj_l_hand.setLength(length);
    }
    public void setLength_R_Leg(int length){
        obj_r_leg.setLength(length);
    }
    public void setLength_L_Leg(int length){
        obj_l_leg.setLength(length);
    }

    public void setNails_color(String nails_color){
        obj_l_hand.setNails_color(nails_color);
        obj_r_hand.setNails_color(nails_color);
    }

    public void setEye_color(String eye_color){
        obj_head.setEye_color(eye_color);
    }

    public void setTattoo(String tattoo){
        obj_r_leg.setTattoo(tattoo);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setEye(boolean one_eye){
        obj_head.setOne_eye(one_eye);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return getAge() + " " + getName() + " " + obj_head.toMain() + " " + obj_l_hand.Nails() + " " + obj_r_leg.Tattoo()
                + " " + (obj_head.isOne_eye() == true ? "One_eye" : "Two_eyes");
    }
}
