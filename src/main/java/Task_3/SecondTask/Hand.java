package Task_3.SecondTask;

public class Hand {
    private String nails_color;
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setNails_color(String nails_color) {
        this.nails_color = nails_color;
    }

    public String getNails_color() {
        return nails_color;
    }

    public String Nails(){
        return getNails_color();
    }
}
