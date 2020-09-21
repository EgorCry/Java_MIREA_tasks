package Task_3.SecondTask;

public class Head{
    private String eye_color;
    private boolean one_eye;

    public boolean isOne_eye() {
        return one_eye;
    }

    public void setOne_eye(boolean one_eye) {
        this.one_eye = one_eye;
    }

    public void setEye_color(String eye_color) {
        this.eye_color = eye_color;
    }

    public String getEye_color() {
        return eye_color;
    }

    public String toMain(){
        return getEye_color();
    }
}
