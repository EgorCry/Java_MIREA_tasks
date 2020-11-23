package Task_3.FirstTask;

public class Circle {
    private int radius, length, area;

    public void setRadius(int radius) {
        this.radius = radius;
        setLength(getRadius());
        setArea(getRadius());
    }

    public int getRadius() {

        return radius;
    }

    public void setLength(int radius) {

        this.length = (int) (2 * Math.PI * radius);
    }

    public int getLength() {

        return length;
    }

    public void setArea(int radius) {
        this.area = (int) (Math.PI * Math.pow(radius, 2));
    }

    public int getArea() {
        return area;
    }

    public String ToString(){
        return getRadius() + " " + getLength() + " " + getArea();
    }
}
